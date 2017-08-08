package become.sk.javabutton

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

/*
* Vylepši program tak, aby prepínal farbu pozadia.
* Zmeň meniaci sa text.
* Zmeň text v tlačidle.
*
* */

class MainActivity : AppCompatActivity() {

    internal var toggleTitle: Boolean? = false
    var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Prepínač"

        val button = findViewById(R.id.buttonX) as Button
        button.setOnClickListener { prepni() }

        textView = findViewById(R.id.textViewX) as TextView
    }

    protected fun prepni() {
        if (toggleTitle!!) {
            toggleTitle = false
            textView!!.text = "Vyplo mi"
        } else {
            toggleTitle = true
            textView!!.text = "Zaplo mi"
        }
    }
}
