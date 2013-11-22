package com.example.SoftSkills;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartAct extends Activity{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
        
         Button next = (Button) findViewById(R.id.buttonhome);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), SoftSkills.class);
                startActivityForResult(myIntent, 0);
            }

        });
        
        Button next1 = (Button) findViewById(R.id.buttoncts);
        next1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), StartCTS.class);
                startActivityForResult(myIntent, 0);
            }

        });
        
        Button next2 = (Button) findViewById(R.id.buttoncs);
        next2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), StartCS.class);
                startActivityForResult(myIntent, 0);
            }

        });
        
        Button next3 = (Button) findViewById(R.id.buttonss);
        next3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), StartTS.class);
                startActivityForResult(myIntent, 0);
            }

        });
        
        Button next4 = (Button) findViewById(R.id.buttonpe);
        next4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), StartEM.class);
                startActivityForResult(myIntent, 0);
            }

        });
        
        Button next5 = (Button) findViewById(R.id.buttonll);
        next5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), StartLL.class);
                startActivityForResult(myIntent, 0);
            }

        });
        
        Button next6 = (Button) findViewById(R.id.buttones);
        next6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), StartKK.class);
                startActivityForResult(myIntent, 0);
            }

        });
        
        Button next7 = (Button) findViewById(R.id.buttonls);
        next7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), StartLS.class);
                startActivityForResult(myIntent, 0);
            }

        });
        
    }
    
}