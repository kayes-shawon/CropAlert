package com.example.cropinfo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Disease_jute extends Activity implements OnClickListener {
	
	Button home12;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.disease_jute);
		
		home12=(Button)findViewById(R.id.home12);
        home12.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		Intent i=new Intent(this,Home.class);
		startActivity(i);
		
	}
}
