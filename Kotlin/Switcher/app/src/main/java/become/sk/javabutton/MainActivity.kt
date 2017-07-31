package become.sk.javabutton

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    internal var toggleTitle: Boolean? = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Prepínač"

        val button = findViewById(R.id.buttonX) as Button
        button.setOnClickListener { prepni() }
    }

    protected fun prepni() {
        val textView = findViewById(R.id.textViewX) as TextView
        if (toggleTitle!!) {
            toggleTitle = false
            textView.text = "Vyplo mi"
        } else {
            toggleTitle = true
            textView.text = "Zaplo mi"
        }
    }
}
