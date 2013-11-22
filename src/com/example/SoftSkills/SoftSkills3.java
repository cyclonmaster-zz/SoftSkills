package com.example.SoftSkills;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SoftSkills3 extends Activity {
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.zoom_enter, R.anim.zoom_exit);
        setContentView(R.layout.main3);
        
        Button next = (Button) findViewById(R.id.buttonhome);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), SoftSkills.class);
                startActivityForResult(myIntent, 0);
            }

        });
        
        Button next1 = (Button) findViewById(R.id.buttonsoft);
        next1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), SoftSkills2.class);
                startActivityForResult(myIntent, 0);
            }

        });
        
        Button next2 = (Button) findViewById(R.id.buttonlearn);
        next2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), SoftSkills3.class);
                startActivityForResult(myIntent, 0);
            }

        });
        
        Button next3 = (Button) findViewById(R.id.buttonstart);
        next3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), StartAct.class);
                startActivityForResult(myIntent, 0);
            }

        });
        
        Button next4 = (Button) findViewById(R.id.buttoncredits);
        next4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Startcredits.class);
                startActivityForResult(myIntent, 0);
            }

        });
        
    }
}