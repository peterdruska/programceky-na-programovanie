package become.sk.calculatoroftwovalues

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

/**
 * Ošetri kalkulačku tak, aby nepadala, keď nie je nič zadané do hociktorého políčka.
 * Vytvor rozdiel a mysli aj na záporné čísla.
 * Vytvor podiel a mysli na to, že nulou vie deliť len Chuck Norris.
 * Vytvor súčin.
 * Vytvor kalkulačku pre dve zadané čísla so súčtom, rozdielom, súčinom a podielom.
 * Naformátuj výstupné číslo na 4 desatinné miesta.
 * Skús urobiť kalkulačku len pre celé, nie desatinné (reálne) čísla.

 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Súčet dvoch čísel"

        val equalsSign = findViewById(R.id.equalsSign) as Button // nájdete prvku podľa ID
        // nastavenie onClickListener metódy na button
        equalsSign.setOnClickListener() {
            calculate() // volanie metódy calculate(), ktorá vypočíta súčet a vypíše ho do políčka
        }
    }

    protected fun calculate() {
        // polia na zadanie dvoch čísel
        val number1 = findViewById(R.id.number1) as EditText
        val number2 = findViewById(R.id.number2) as EditText

        // tu sa zobrazí riešenie
        val solution = findViewById(R.id.solution) as TextView

        // toto sú dve začané čísla
        val num1 = java.lang.Double.parseDouble(number1.text.toString())
        val num2 = java.lang.Double.parseDouble(number2.text.toString())

        // súčet
        val sum = num1 + num2

        // výpis súčtu
        var solutionString = String() // nový objekt triedy String()
        solutionString = String.format("%.2f", sum) // sformátovanie na dve desatinné miesta
        solution.text = solutionString // vlastný výpis
    }
}
