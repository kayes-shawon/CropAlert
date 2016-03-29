package com.example.cropinfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Add_info_jute extends Activity implements OnClickListener {
	

	Button home3, submit2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_info_jute);
		
		home3=(Button)findViewById(R.id.home3);
        home3.setOnClickListener(this);
        
        submit2=(Button)findViewById(R.id.submit2);
        submit2.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch (v.getId()) {
		
		case R.id.home3:
			
							
				Intent i=new Intent(Add_info_jute.this,Home.class);
				startActivity(i);
				     
				
			break;
		
		
			case R.id.submit2:
					
								
				Intent j=new Intent(Add_info_jute.this,Jute.class);
				startActivity(j);
				
			
				break;
			
				default:
				break;
				
			}
		
	}

	

}
