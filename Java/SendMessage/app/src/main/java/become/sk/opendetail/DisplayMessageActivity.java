package become.sk.opendetail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 1
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // 2
        setTitle("Správa");

        // 3
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.KEY);

        // 4
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);
    }
}
