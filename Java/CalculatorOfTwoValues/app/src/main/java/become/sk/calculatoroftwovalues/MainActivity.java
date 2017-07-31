package become.sk.calculatoroftwovalues;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Ošetri kalkulačku tak, aby nepadala, keď nie je nič zadané do hociktorého políčka.
 * Vytvor rozdiel a mysli aj na záporné čísla.
 * Vytvor podiel a mysli na to, že nulou vie deliť len Chuck Norris.
 * Vytvor súčin.
 * Vytvor kalkulačku pre dve zadané čísla so súčtom, rozdielom, súčinom a podielom.
 * Naformátuj výstupné číslo na 4 desatinné miesta.
 * Skús urobiť kalkulačku len pre celé, nie desatinné (reálne) čísla.
 *
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Súčet dvoch čísel");

        Button equalsSign = (Button) findViewById(R.id.equalsSign); // nájdete prvku podľa ID
        equalsSign.setOnClickListener(new View.OnClickListener() { // nastavenie onClickListener metódy na button
            @Override
            public void onClick(View v) {
                calculate(); // volanie metódy calculate(), ktorá vypočíta súčet a vypíše ho do políčka
            }
        });
    }

    protected void calculate() {
        // polia na zadanie dvoch čísel
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);

        // tu sa zobrazí riešenie
        TextView solution = (TextView) findViewById(R.id.solution);

        // toto sú dve začané čísla
        Double num1 = Double.parseDouble(number1.getText().toString());
        Double num2 = Double.parseDouble(number2.getText().toString());

        // súčet
        Double sum = num1 + num2;

        // výpis súčtu
        String solutionString = new String(); // nový objekt triedy String()
        solutionString = String.format("%.2f", sum); // sformátovanie na dve desatinné miesta
        solution.setText(solutionString); // vlastný výpis
    }
}
