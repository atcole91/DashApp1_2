package com.example.dashapp1_2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class VenueInfo extends Activity{
	 String value;
	
	@Override
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.venueinfo_main);
		
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
		    this.value = extras.getString("new_variable_name");
		}
		
		Toast toast = Toast.makeText(getBaseContext(), this.value, 200);
		toast.show();
		
	}
	
	
	
}
