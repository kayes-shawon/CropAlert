package com.example.cropinfo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Cultivation_time_wheat extends Activity implements OnClickListener {
	
	Button home8;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cultivation_time_paddy);
		
		home8=(Button)findViewById(R.id.home8);
        home8.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		Intent i=new Intent(this,Home.class);
		startActivity(i);
		
	}

}


