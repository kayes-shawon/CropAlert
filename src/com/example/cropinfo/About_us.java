package com.example.cropinfo;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class About_us extends Activity implements OnClickListener {

Button home2;
	
	
	final Context context = this;

	private ImageButton call_evan_imgbtn, call_kayes_imgbtn, sms_evan_imgbtn, sms_kayes_imgbtn ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);
        
        home2=(Button)findViewById(R.id.home2);
        home2.setOnClickListener(this);
        
      
        sms_evan_imgbtn = (ImageButton) findViewById(R.id.send_sms_evan);
        sms_evan_imgbtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
							
				send_sms_evan();
			}
	
       
	
});
        
        
        sms_kayes_imgbtn = (ImageButton) findViewById(R.id.send_sms_kayes);
        sms_kayes_imgbtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
							
				send_sms_kayes();
			}
	
   
	
});
        
        
       call_evan_imgbtn = (ImageButton) findViewById(R.id.call_evan);
        
        PhoneCallListener phoneListener1 = new PhoneCallListener();
		TelephonyManager telephonyManager = (TelephonyManager) this
				.getSystemService(Context.TELEPHONY_SERVICE);
		telephonyManager.listen(phoneListener1,
				PhoneStateListener.LISTEN_CALL_STATE);
        
        call_evan_imgbtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
							
				Intent callIntent = new Intent(Intent.ACTION_CALL);
				callIntent.setData(Uri.parse("tel:+8801956995686"));
				startActivity(callIntent);
			}
	
   
	
}); 
	
        call_kayes_imgbtn = (ImageButton) findViewById(R.id.call_kayes);

        PhoneCallListener phoneListener2 = new PhoneCallListener();
		TelephonyManager telephonyManager2 = (TelephonyManager) this
				.getSystemService(Context.TELEPHONY_SERVICE);
		telephonyManager2.listen(phoneListener2,
				PhoneStateListener.LISTEN_CALL_STATE);
        
       call_kayes_imgbtn.setOnClickListener(new OnClickListener() {
				
				@Override
				
				public void onClick(View v) {
								
					
					Intent callIntent2 = new Intent(Intent.ACTION_CALL);
					callIntent2.setData(Uri.parse("tel:+8801918370722"));
					startActivity(callIntent2);
				}
		
	   
		
	});
			 
        
    }
    
    protected void send_sms_evan() {
        Log.i("Send SMS", "");

        Intent smsIntent = new Intent(Intent.ACTION_VIEW);
        
        smsIntent.setData(Uri.parse("smsto:"));
        smsIntent.setType("vnd.android-dir/mms-sms");

        smsIntent.putExtra("address"  , new String ("+8801956995686"));
        smsIntent.putExtra("sms_body"  , "");
        try {
           startActivity(smsIntent);
           finish();
           Log.i("Finished sending SMS...", "");
        } catch (android.content.ActivityNotFoundException ex) {
           Toast.makeText(About_us.this, 
           "SMS faild, please try again later.", Toast.LENGTH_SHORT).show();
        }
     }

    
    protected void send_sms_kayes() {
        Log.i("Send SMS", "");

        Intent smsIntent2 = new Intent(Intent.ACTION_VIEW);
        
        smsIntent2.setData(Uri.parse("smsto:"));
        smsIntent2.setType("vnd.android-dir/mms-sms");

        smsIntent2.putExtra("address"  , new String ("+8801918370722"));
        smsIntent2.putExtra("sms_body"  , "");
        try {
           startActivity(smsIntent2);
           finish();
           Log.i("Finished sending SMS...", "");
        } catch (android.content.ActivityNotFoundException ex) {
           Toast.makeText(About_us.this, 
           "SMS faild, please try again later.", Toast.LENGTH_SHORT).show();
        }
     }
    
    		
    
   /* protected void call_evan() {
			    Intent callIntent = new Intent(Intent.ACTION_CALL);
				callIntent.setData(Uri.parse("tel:+8801956995686"));
				startActivity(callIntent);*/
			
	
			
			private class PhoneCallListener extends PhoneStateListener {
			
			private boolean isPhoneCalling = false;
			
			String LOG_TAG = "LOGGING 123";
			
			@Override
			public void onCallStateChanged(int state, String incomingNumber) {
			
			if (TelephonyManager.CALL_STATE_RINGING == state) {
				// phone ringing
				Log.i(LOG_TAG, "RINGING, number: " + incomingNumber);
			}
			
			if (TelephonyManager.CALL_STATE_OFFHOOK == state) {
				// active
				Log.i(LOG_TAG, "OFFHOOK");
			
				isPhoneCalling = true;
			}
			
			if (TelephonyManager.CALL_STATE_IDLE == state) {
				// run when class initial and phone call ended, need detect flag
				// from CALL_STATE_OFFHOOK
				Log.i(LOG_TAG, "IDLE");
			
				if (isPhoneCalling) {
			
					Log.i(LOG_TAG, "restart app");
			
					// restart app
					Intent i = getBaseContext().getPackageManager()
							.getLaunchIntentForPackage(
									getBaseContext().getPackageName());
					i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(i);
			
					isPhoneCalling = false;
				}
			
			}
			}
			}
    
    
   	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		Intent i=new Intent(this,Home.class);
		startActivity(i);
		
	}

}
