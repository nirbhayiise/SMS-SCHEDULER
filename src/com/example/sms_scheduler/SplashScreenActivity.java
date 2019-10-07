package com.example.sms_scheduler;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class SplashScreenActivity extends Activity {

	  @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        setContentView(R.layout.splashscreen);
	        
	        new Handler().postDelayed(new Runnable() {
	            
	            // Using handler with postDelayed called runnable run method
	
	            public void run() {
	                Intent i = new Intent(SplashScreenActivity.this, SMSScheduler.class);
	                startActivity(i);
	  
	                // close this activity
	                finish();
	            }
	        }, 4*1000);
	  }
}
