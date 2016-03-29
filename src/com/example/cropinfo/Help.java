package com.example.cropinfo;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class Help extends Activity implements OnClickListener {

	
	Button home15;
	
	Spinner spnr;
	ArrayAdapter<String> adapter;
	String[] helpline;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.help);
	
	home15=(Button)findViewById(R.id.home15);
    home15.setOnClickListener(this);
	
        spnr=(Spinner)findViewById(R.id.spinner1);
        helpline=getResources().getStringArray(R.array.help);
        
        
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_selectable_list_item,helpline);
        spnr.setAdapter(adapter);
        spnr.setOnItemSelectedListener(listener);
        

    }
OnItemSelectedListener listener=new OnItemSelectedListener() {

	@Override
	public void onItemSelected(AdapterView<?> parent, View v, int position,
			long id) {
	switch(position){
	case 1:

		Log.i("Send SMS", "");

        Intent smsIntent2 = new Intent(Intent.ACTION_VIEW);
        
        smsIntent2.setData(Uri.parse("smsto:"));
        smsIntent2.setType("vnd.android-dir/mms-sms");

        smsIntent2.putExtra("address"  , new String ("+8801956995686"));
        smsIntent2.putExtra("sms_body"  , "");
        try {
           startActivity(smsIntent2);
           finish();
           Log.i("Finished sending SMS...", "");
        } catch (android.content.ActivityNotFoundException ex) {
           Toast.makeText(Help.this, 
           "SMS faild, please try again later.", Toast.LENGTH_SHORT).show();
        }
		
		
		break;
	case 2:
	//	Intent i1= new Intent(Help.this,Disease_help.class);
	//	startActivity(i1);
		
		Log.i("Send SMS", "");

        Intent smsIntent3 = new Intent(Intent.ACTION_VIEW);
        
        smsIntent3.setData(Uri.parse("smsto:"));
        smsIntent3.setType("vnd.android-dir/mms-sms");

        smsIntent3.putExtra("address"  , new String ("+8801918370722"));
        smsIntent3.putExtra("sms_body"  , "");
        try {
           startActivity(smsIntent3);
           finish();
           Log.i("Finished sending SMS...", "");
        } catch (android.content.ActivityNotFoundException ex) {
           Toast.makeText(Help.this, 
           "SMS faild, please try again later.", Toast.LENGTH_SHORT).show();
        }
		
		break;
		
	}
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}
};

@Override
public void onClick(View arg0) {
	// TODO Auto-generated method stub
	
	Intent i=new Intent(this,Home.class);
	startActivity(i);
	
}

}

