package com.example.cropinfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Add_info_paddy extends Activity implements OnClickListener {
	

	Button home4, submit1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_info_paddy);
		
		home4=(Button)findViewById(R.id.home4);
        home4.setOnClickListener(this);
        
        submit1=(Button)findViewById(R.id.submit1);
        submit1.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch (v.getId()) {
		
		case R.id.home4:
			
							
				Intent i=new Intent(Add_info_paddy.this,Home.class);
				startActivity(i);
				     
				
			break;
		
		
			case R.id.submit1:
					
								
				Intent j=new Intent(Add_info_paddy.this,Paddy.class);
				startActivity(j);
				
			
				break;
			
				default:
				break;
				
			}
		
	}

	

}
