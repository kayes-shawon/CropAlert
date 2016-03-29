package com.example.cropinfo;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Home extends Activity {

	ListView homePage;
	ArrayAdapter<String> adapter;

	String[] Home;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		
		
		homePage = (ListView) findViewById(R.id.listView1);
		Home = getResources().getStringArray(R.array.Home);
		adapter = new ArrayAdapter<String>(Home.this, R.layout.list,
				R.id.txtAreaView, Home);

		homePage.setAdapter(adapter);

		homePage.setOnItemClickListener(listener);

	}

	OnItemClickListener listener = new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> parent, View v, int position,
				long id) {

			switch (position) {
			case 0:
				Intent i0 = new Intent(Home.this, About_crop.class);
				startActivity(i0);
				break;
			case 1:
				Intent i1 = new Intent(Home.this, Help.class);
				startActivity(i1);
				break;
			case 2:
				Intent i2 = new Intent(Home.this, About_us.class);
				startActivity(i2);
				break;


			}

		}

	};
	public void onBackPressed() {
	    new AlertDialog.Builder(this)
	    .setTitle(getTitle().toString())
	    .setIcon(R.drawable.ic_launcher)
	           .setMessage("আপনি কি বের হয়ে যেতে চান?")
	           .setCancelable(true)
	           .setPositiveButton("হ্যাঁ", new DialogInterface.OnClickListener() {
	               public void onClick(DialogInterface dialog, int id) {
	                    Home.this.finish();
	               }
	           })
	           .setNegativeButton("না", null)
	           .show();
	}

}
