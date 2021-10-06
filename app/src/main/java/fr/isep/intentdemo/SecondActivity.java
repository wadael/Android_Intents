package fr.isep.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // changingTextView
        TextView tv = findViewById(R.id.changingTextView);
        Intent intent = getIntent();
        String newValue = intent.getStringExtra(Gardener.INTENT_KEY);
        tv.setText(newValue);
    }
}