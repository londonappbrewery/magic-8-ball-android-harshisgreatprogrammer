package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ball8image=findViewById(R.id.ball8image);
        Button askbtn=findViewById(R.id.Ask_btn);

        final int balldisplay[]={R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,
        R.drawable.ball4,R.drawable.ball5};

        askbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomgenerator=new Random();
                int randomballs=randomgenerator.nextInt(5);
                ball8image.setImageResource(balldisplay[randomballs]);

            }
        });

    }
}
