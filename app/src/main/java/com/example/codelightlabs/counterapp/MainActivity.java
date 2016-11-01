package com.example.codelightlabs.counterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private TextView counterNumber;
    private int num ;
    private static final String LOG_TAG = "ini log Tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counterNumber = (TextView) findViewById(R.id.counter);
        num = Integer.parseInt((String)counterNumber.getText());
        Button plus = (Button) findViewById(R.id.plus);
        Button min = (Button) findViewById(R.id.min);
        Toast.makeText(this,"Angka sekarang: "+ num,Toast.LENGTH_LONG).show();

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num++;
                counterNumber.setText(""+num);

            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num--;
                counterNumber.setText(""+num);

            }
        });

    }

//    public void increment(View view){
//
//        num++;
//        counterNumber.setText(""+num);
//
//
//    }
//
//    public void decrement(View view){
//        num--;
//        counterNumber.setText(""+num);
//
//
//    }
}
