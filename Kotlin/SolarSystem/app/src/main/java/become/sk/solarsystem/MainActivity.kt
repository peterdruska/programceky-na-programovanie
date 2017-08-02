package become.sk.solarsystem

import android.media.Image
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Toast
import java.util.ArrayList

/**
 * Vytvor aktivitu, ktorá zobrazí detail planéty.
 * V detaile planéty zobraz jej fotku.
 * V zozname planét zobraz malý náhľad fotky.
 * Vytvor slovenskú lokalizáciu aplikácie tak, aby osbahovala aj angličtinu: https://developer.android.com/guide/topics/resources/localization.html
 */

class MainActivity : AppCompatActivity(), MyRecyclerViewAdapter.ItemClickListener {

    internal var planets: ArrayList<Planet> = ArrayList<Planet>()
    internal var adapter: MyRecyclerViewAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Planets"

        preparePlanets()

        // set up the RecyclerView
        val recyclerView = findViewById(R.id.rvPlanets) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = MyRecyclerViewAdapter(this, planets)
        adapter!!.setClickListener(this)
        recyclerView.adapter = adapter
    }

    // because of: implements MyRecyclerViewAdapter.ItemClickListener
    override fun onItemClick(view: View, position: Int) {
        val planet = adapter!!.getItem(position)
        Toast.makeText(this, planet.name + " on row #" + position, Toast.LENGTH_SHORT).show()
    }

    protected fun preparePlanets() {
        // data to populate the RecyclerView with
        planets = ArrayList<Planet>()

        for (i in 0..PlanetName.values().size - 1) {

            var name = PlanetName.EARTH // default name
            var distanceFromSun: Double? = 0.0
            var inhabitants: Double? = 0.0
            when (i) {
                1 -> {
                    name = PlanetName.VENUS
                    distanceFromSun = 2.0
                    inhabitants = 0.0
                }
                2 -> {
                    name = PlanetName.EARTH
                    distanceFromSun = 3.0
                    inhabitants = 7.442 // in year of 2016
                }
                3 -> {
                    name = PlanetName.MARS
                    distanceFromSun = 4.0
                    inhabitants = 0.0
                }
                4 -> {
                    name = PlanetName.JUPITER
                    distanceFromSun = 5.0
                    inhabitants = 0.0
                }
                5 -> {
                    name = PlanetName.SATURN
                    distanceFromSun = 6.0
                    inhabitants = 0.0
                }
                6 -> {
                    name = PlanetName.URAN
                    distanceFromSun = 7.0
                    inhabitants = 0.0
                }
                7 -> {
                    name = PlanetName.NEPTUNE
                    distanceFromSun = 8.0
                    inhabitants = 0.0
                }
                8 -> {
                    name = PlanetName.PLUTO
                    distanceFromSun = 9.0
                    inhabitants = 0.0
                }
                else -> {
                    name = PlanetName.MERCURY
                    distanceFromSun = 0.0
                    inhabitants = 0.0
                }
            }

            val planet = Planet(i.toString(), name.toString(), distanceFromSun, inhabitants)
            planets.add(planet)
        }
    }
}
