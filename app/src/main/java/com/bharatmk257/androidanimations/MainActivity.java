package com.bharatmk257.androidanimations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWorld;
    private TextView txtHiWorld;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHelloWorld = (TextView)findViewById(R.id.helloWorld);
        txtHiWorld = (TextView)findViewById(R.id.hiWorld);

        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this,"Hello World",Toast.LENGTH_LONG).show();

//                txtHelloWorld.animate().scaleY(90f).setDuration(1000);
//                txtHelloWorld.animate().scaleX(90f).setDuration(1000);
                txtHelloWorld.animate().alpha(0.0f).setDuration(1000);
                txtHiWorld.animate().alpha(1.0f).setDuration(1000);

            }
        });

    }
}
