package edu.quinnipiac.ser210.ls08_numbersapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class YearFactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year_fact);

        String fact = (String) getIntent().getExtras().get("yearfact");
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(fact);
    }
}