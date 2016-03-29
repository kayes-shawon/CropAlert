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

public class Wheat extends Activity implements OnClickListener {

	Button home18;
	
	ListView wheat;
	ArrayAdapter<String> adapter;

	String[] Wheat;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wheat);
		
		home18=(Button)findViewById(R.id.home18);
        home18.setOnClickListener(this);
        
        
        wheat = (ListView) findViewById(R.id.listView1);
        Wheat = getResources().getStringArray(R.array.CropInfo_Wheat);
		adapter = new ArrayAdapter<String>(Wheat.this, R.layout.list,
				R.id.txtAreaView, Wheat);

		wheat.setAdapter(adapter);

		wheat.setOnItemClickListener(listener);
		
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
				Intent i0 = new Intent(Wheat.this, Description_wheat.class);
				startActivity(i0);
				break;
			case 1:
				Intent i1 = new Intent(Wheat.this, Cultivation_time_wheat.class);
				startActivity(i1);
				break;
			case 2:
				Intent i2 = new Intent(Wheat.this, Disease_wheat.class);
				startActivity(i2);
				break;


			}

		}

	};
	

}

