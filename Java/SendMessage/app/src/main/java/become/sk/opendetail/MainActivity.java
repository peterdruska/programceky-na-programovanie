package become.sk.opendetail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 *
 */

public class MainActivity extends AppCompatActivity {

    public static final String KEY = "KEY";
    EditText editText;
    String messageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Pošli správu");

        Button button = (Button) findViewById(R.id.openDetail);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessage();
            }
        });

        editText = (EditText) findViewById(R.id.message);
    }

    /** Called when the user taps the Send button */
    public void sendMessage() {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        messageText = editText.getText().toString();
        intent.putExtra(KEY, messageText);
        startActivity(intent);
    }
}
