package com.example.SoftSkills;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class SoftSkillstheme2 extends Activity implements RadioGroup.OnCheckedChangeListener {
    /** Called when the activity is first created. */
	TextView text;
	RadioGroup radiogroup;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.main);
                
        radiogroup=(RadioGroup)findViewById(R.id.radiogroup);
        radiogroup.setOnCheckedChangeListener(this);

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

    public void onCheckedChanged(RadioGroup group, int checkedId) {
    	// Polymorphism!!
    	switch (checkedId) {
    	case R.id.radio1:
            Button next5 = (Button) findViewById(R.id.radio1);
            next5.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent myIntent = new Intent(view.getContext(), SoftSkills.class);
                    startActivityForResult(myIntent, 0);
                }

            });
    	break;
    	case R.id.radio2:
            Button next6 = (Button) findViewById(R.id.radio2);
            next6.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent myIntent = new Intent(view.getContext(), SoftSkillstheme2.class);
                    startActivityForResult(myIntent, 0);
                }

            });
    	break;
    	}
    	}    
    
}