package become.sk.opendetail

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    var editText: EditText? = null
    var messageText: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Pošli správu"

        val button = findViewById(R.id.openDetail) as Button
        button.setOnClickListener { sendMessage() }

        editText = findViewById(R.id.message) as EditText
    }

    /** Called when the user taps the Send button  */
    fun sendMessage() {
        val intent = Intent(this, DisplayMessageActivity::class.java)
        messageText = editText!!.text.toString()
        intent.putExtra(KEY, messageText)
        startActivity(intent)
    }

    companion object {
        val KEY = "KEY"
    }
}
