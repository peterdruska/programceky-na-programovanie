package become.sk.solarsystem;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;

/**
 * Vytvor aktivitu, ktorá zobrazí detail planéty.
 * V detaile planéty zobraz jej fotku.
 * V zozname planét zobraz malý náhľad fotky.
 * Vytvor slovenskú lokalizáciu aplikácie tak, aby osbahovala aj angličtinu: https://developer.android.com/guide/topics/resources/localization.html
 */

public class MainActivity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener {

    MyRecyclerViewAdapter adapter;
    ArrayList<Planet> planets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Planets");

        preparePlanets();

        // set up the RecyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvPlanets);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyRecyclerViewAdapter(this, planets);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    // because of: implements MyRecyclerViewAdapter.ItemClickListener
    @Override
    public void onItemClick(View view, int position) {
        Planet planet = adapter.getItem(position);
        Toast.makeText(this, planet.name + " on row #" + position, Toast.LENGTH_SHORT).show();
    }

    protected void preparePlanets() {
        // data to populate the RecyclerView with
        planets = new ArrayList<>();

        for (int i = 0; i < PlanetName.values().length; i++) {

            PlanetName name = PlanetName.EARTH; // default name
            Double distanceFromSun = 0.0;
            Double inhabitants = 0.0;
            switch (i) {
                case 1:
                    name = PlanetName.VENUS;
                    distanceFromSun = 2.0;
                    inhabitants = 0.0;
                    break;
                case 2:
                    name = PlanetName.EARTH;
                    distanceFromSun = 3.0;
                    inhabitants = 7.442; // in year of 2016
                    break;
                case 3:
                    name = PlanetName.MARS;
                    distanceFromSun = 4.0;
                    inhabitants = 0.0;
                    break;
                case 4:
                    name = PlanetName.JUPITER;
                    distanceFromSun = 5.0;
                    inhabitants = 0.0;
                    break;
                case 5:
                    name = PlanetName.SATURN;
                    distanceFromSun = 6.0;
                    inhabitants = 0.0;
                    break;
                case 6:
                    name = PlanetName.URAN;
                    distanceFromSun = 7.0;
                    inhabitants = 0.0;
                    break;
                case 7:
                    name = PlanetName.NEPTUNE;
                    distanceFromSun = 8.0;
                    inhabitants = 0.0;
                    break;
                case 8:
                    name = PlanetName.PLUTO;
                    distanceFromSun = 9.0;
                    inhabitants = 0.0;
                    break;
                default:
                    name = PlanetName.MERCURY;
                    distanceFromSun = 0.0;
                    inhabitants = 0.0;
                    break;
            }

            Planet planet = new Planet(String.valueOf(i), name.toString(), distanceFromSun, inhabitants);
            planets.add(planet);
        }
    }
}
