package become.sk.opendetail

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Pošli správu"

        val button = findViewById(R.id.openDetail) as Button
        button.setOnClickListener { sendMessage() }
    }

    /** Called when the user taps the Send button  */
    fun sendMessage() {
        val intent = Intent(this, DisplayMessageActivity::class.java)
        val editText = findViewById(R.id.message) as EditText
        val messageText = editText.text.toString()
        intent.putExtra(KEY, messageText)
        startActivity(intent)
    }

    companion object {
        val KEY = "KEY"
    }
}
