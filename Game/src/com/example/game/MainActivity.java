package com.example.game;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
	MySurfaceView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
         view = new MySurfaceView(this);
        setContentView(view);

    }

    @Override
    protected void onPause() {
    	// TODO Auto-generated method stub
    	super.onPause();
    	view.runing = false;
    	this.finish();
    }

    @Override
    protected void onStop() {
    	// TODO Auto-generated method stub
    	super.onStop();
		view.runing = false;
		this.finish();
    }
    
    @Override
    protected void onDestroy() {
    	// TODO Auto-generated method stub
    	super.onDestroy();
		view.runing = false;
		this.finish();
    }
    

}
