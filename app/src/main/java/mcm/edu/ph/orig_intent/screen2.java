package mcm.edu.ph.orig_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        boolean condition;
        int x = 0;

        Intent i = getIntent();
        condition = Boolean.parseBoolean(i.getStringExtra("condition_var"));
        x = i.getIntExtra("INT_MONTHS", 0);

        TextView display = findViewById(R.id.textView);

        switch (x) {
            case 1:
                display.setText("January");
                break;
            case 2:
                display.setText(" February");
                break;
            case 3:
                display.setText("March");
                break;
            case 4:
                display.setText("April");
                break;
            case 5:
                display.setText("May");
                break;
            case 6:
                display.setText("June");
                break;
            case 7:
                display.setText("July");
                break;
            case 8:
                display.setText("August");
                break;
            case 9:
                display.setText("September");
                break;
            case 10:
                display.setText("October");
                break;
            case 11:
                display.setText("November");
                break;
            case 12:
                display.setText("December");
                break;
            default:
                display.setText("ERROR: THERE IS NO MONTH IN THIS NUMBER");
                break;

        }
    }
}








