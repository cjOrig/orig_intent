package mcm.edu.ph.orig_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button next = findViewById(R.id.btnNext);

        next.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){

        TextView display = findViewById(R.id.txtdisplay);
        EditText input = findViewById(R.id.txtMonthValue);

        Intent i = new Intent(MainActivity.this, screen2.class);

        switch(v.getId()) {
            case R.id.btnNext:
                int numberMonths = Integer.parseInt(String.valueOf(input.getText()));

                i.putExtra("INT_MONTHS", numberMonths);
                startActivity(i);
                break;



        }
    }
}