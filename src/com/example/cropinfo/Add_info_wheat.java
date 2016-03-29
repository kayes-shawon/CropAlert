package com.example.cropinfo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Add_info_wheat extends Activity implements OnClickListener {

	
	Button home5, submit3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_info_wheat);
		
		home5=(Button)findViewById(R.id.home5);
        home5.setOnClickListener(this);
        
        submit3=(Button)findViewById(R.id.submit3);
        submit3.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch (v.getId()) {
		
		case R.id.home5:
			
							
				Intent i=new Intent(Add_info_wheat.this,Home.class);
				startActivity(i);
				     
				
			break;
		
		
			case R.id.submit3:
					
				
				Intent j=new Intent(Add_info_wheat.this,Wheat.class);
				startActivity(j);
				
			
				break;
			
				default:
				break;
				
			}
		
	}

}
