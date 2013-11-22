package com.example.SoftSkills;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Startcredits extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startcredits);
        
        Button next1 = (Button) findViewById(R.id.buttonback);
        next1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), SoftSkills.class);
                startActivityForResult(myIntent, 0);
            }

        }); 
        
        Button buttonA = (Button) findViewById(R.id.start);
		buttonA.setOnClickListener(this);
		Button buttonB = (Button) findViewById(R.id.stop);
		buttonB.setOnClickListener(this);
        
    	}

    public void onClick(View v) {
    	AnimationDrawable frameAnimation =
    	(AnimationDrawable)findViewById(R.id.frame).getBackground();
    	switch (v.getId()) {
    		case R.id.start:
    			frameAnimation.start();break;
    		case R.id.stop:
    			frameAnimation.stop();break;
    		}
    }
    
}
