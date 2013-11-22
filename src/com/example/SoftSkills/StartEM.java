package com.example.SoftSkills;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartEM extends Activity{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startem);

        Button next = (Button) findViewById(R.id.buttonhome);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), SoftSkills.class);
                startActivityForResult(myIntent, 0);
            }

        });
        
        Button next1 = (Button) findViewById(R.id.buttonback);
        next1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), StartAct.class);
                startActivityForResult(myIntent, 0);
            }

        });
        
    }
}