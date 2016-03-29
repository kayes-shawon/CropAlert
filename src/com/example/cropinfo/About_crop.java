package com.example.cropinfo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class About_crop extends Activity implements OnClickListener {

	Button home1;
	
	ListView about_crop_list;
	ArrayAdapter<String> adapter;

	String[] About_crop;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about_crop);
	
		
		home1=(Button)findViewById(R.id.home1);
		home1.setOnClickListener(this);
		
		
		
		about_crop_list = (ListView) findViewById(R.id.listView1);
		About_crop = getResources().getStringArray(R.array.About_crop);
		adapter = new ArrayAdapter<String>(About_crop.this, R.layout.list,
				R.id.txtAreaView, About_crop);

		about_crop_list.setAdapter(adapter);

		about_crop_list.setOnItemClickListener(listener);
		
		
	}

	OnItemClickListener listener = new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> parent, View v, int position,
				long id) {

			switch (position) {
			case 0:
				Intent i0 = new Intent(About_crop.this, Add_info_paddy.class);
				startActivity(i0);
				break;
			case 1:
				Intent i1 = new Intent(About_crop.this, Add_info_jute.class);
				startActivity(i1);
				break;
			case 2:
				Intent i2 = new Intent(About_crop.this, Add_info_wheat.class);
				startActivity(i2);
				break;


			}

		}

	};

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		Intent i=new Intent(this,Home.class);
		startActivity(i);
	}

}

