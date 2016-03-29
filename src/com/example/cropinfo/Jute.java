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

public class Jute extends Activity implements OnClickListener {
	
	Button home16;
	
	ListView jute;
	ArrayAdapter<String> adapter;

	String[] Jute;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jute);
		
		home16=(Button)findViewById(R.id.home16);
        home16.setOnClickListener(this);
        
        jute = (ListView) findViewById(R.id.listView1);
        Jute = getResources().getStringArray(R.array.CropInfo_Jute);
		adapter = new ArrayAdapter<String>(Jute.this, R.layout.list,
				R.id.txtAreaView, Jute);

		jute.setAdapter(adapter);

		jute.setOnItemClickListener(listener);
		
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
				Intent i0 = new Intent(Jute.this, Description_jute.class);
				startActivity(i0);
				break;
			case 1:
				Intent i1 = new Intent(Jute.this, Cultivation_time_jute.class);
				startActivity(i1);
				break;
			case 2:
				Intent i2 = new Intent(Jute.this, Disease_jute.class);
				startActivity(i2);
				break;


			}

		}

	};

}

