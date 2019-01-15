package com.bharatmk257.androidanimations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWorld;
    private TextView txtHiWorld;
    private ImageView imgWolf;
    private ImageView imgComedy;
    private TextView txtAndroid;

    boolean isHelloWorldShowing = true;
    boolean isWolfShowing = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHelloWorld = (TextView) findViewById(R.id.helloWorld);
        txtHiWorld = (TextView) findViewById(R.id.hiWorld);
        imgComedy = (ImageView) findViewById(R.id.comedy);
        imgWolf = (ImageView) findViewById(R.id.wolf);
        txtAndroid = (TextView)findViewById(R.id.txtAndroid);


        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this,"Hello World",Toast.LENGTH_LONG).show();

//                txtHelloWorld.animate().scaleY(90f).setDuration(1000);
//                txtHelloWorld.animate().scaleX(90f).setDuration(1000);
//                txtHelloWorld.animate().alpha(0.0f).setDuration(3000);
//                txtHiWorld.animate().alpha(1.0f).setDuration(3000);

                if (isHelloWorldShowing) {
                    txtHelloWorld.animate().alpha(0.0f).setDuration(1000);
                    txtHiWorld.animate().alpha(1.0f).setDuration(1000);
                    isHelloWorldShowing = false;
                }else if(!isHelloWorldShowing){
                    txtHelloWorld.animate().alpha(1.0f).setDuration(1000);
                    txtHiWorld.animate().alpha(0.0f).setDuration(1000);
                    isHelloWorldShowing = true;
                }
            }
        });


        imgWolf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isWolfShowing){
                    imgWolf.animate().alpha(0).setDuration(1000);
                    imgComedy.animate().alpha(1).setDuration(1000);
                    isWolfShowing = false;
                }else if (!isWolfShowing){
                    imgWolf.animate().alpha(1).setDuration(1000);
                    imgComedy.animate().alpha(0).setDuration(1000);
                    isWolfShowing = true;
                }
            }
        });

        txtAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtAndroid.animate().translationX(-3000).setDuration(2000);

            }
        });

    }
}
