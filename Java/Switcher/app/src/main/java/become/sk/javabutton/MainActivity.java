package become.sk.javabutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/*
* Vylepši program tak, aby prepínal farbu pozadia.
* Zmeň meniaci sa text.
* Zmeň text v tlačidle.
*
* */

public class MainActivity extends AppCompatActivity {

    Boolean toggleTitle = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Prepínač");

        Button button = (Button) findViewById(R.id.buttonX);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prepni();
            }
        });
    }

    protected void prepni() {
        TextView textView = (TextView) findViewById(R.id.textViewX);
        if (toggleTitle) {
            toggleTitle = false;
            textView.setText("Vyplo mi");
        } else {
            toggleTitle = true;
            textView.setText("Zaplo mi");
        }
    }
}
