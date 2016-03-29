package com.example.cropinfo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Paddy extends Activity implements OnClickListener {

	Button home17;
	
	ListView paddy;
	ArrayAdapter<String> adapter;

	String[] Paddy;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.paddy);
		
		home17=(Button)findViewById(R.id.home17);
        home17.setOnClickListener(this);
        
        
        paddy = (ListView) findViewById(R.id.listView1);
        Paddy = getResources().getStringArray(R.array.CropInfo_Paddy);
		adapter = new ArrayAdapter<String>(Paddy.this, R.layout.list,
				R.id.txtAreaView, Paddy);

		paddy.setAdapter(adapter);

		paddy.setOnItemClickListener(listener);
		
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		Intent i=new Intent(this,Home.class);
		startActivity(i);
		
	}

	
	OnItemClickListener listener = new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> parent, View v, int position,
				long id) {

			switch (position) {
			case 0:
				Intent i0 = new Intent(Paddy.this, Description_paddy.class);
				startActivity(i0);
				break;
			case 1:
				Intent i1 = new Intent(Paddy.this, Cultivation_time_paddy.class);
				startActivity(i1);
				break;
			case 2:
				Intent i2 = new Intent(Paddy.this, Disease_paddy.class);
				startActivity(i2);
				break;


			}

		}

	};
	

}

