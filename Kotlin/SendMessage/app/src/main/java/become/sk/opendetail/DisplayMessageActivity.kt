package become.sk.opendetail

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        // 1
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // 2
        title = "Správa"

        // 3
        val intent = intent
        val message = intent.getStringExtra(MainActivity.KEY)

        // 4
        val textView = findViewById(R.id.textView) as TextView
        textView.text = message
    }
}
