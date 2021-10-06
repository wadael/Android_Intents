package fr.isep.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClickedForActivityChange(View v){
        Log.d("CLK","DEBUG CLICK");
        Log.v("CLK","VERBOSE CLICK");
        Log.w("CLK","WARNING CLICK");
        Log.e("CLK","ERROR CLICK");

        // get the input data  from editTextTextMultiLine
        EditText et = findViewById(R.id.editTextTextMultiLine);
        String val = et.getText().toString();

        // pack value

        // start second activity
        Intent go = new Intent(this, SecondActivity.class);
        // pack value
        go.putExtra(Gardener.INTENT_KEY,val);
        startActivity(go);

    }

}