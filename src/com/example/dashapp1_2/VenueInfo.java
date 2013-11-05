package com.example.dashapp1_2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class VenueInfo extends Activity{
	 String name;
	 Venue venue;
	
	@Override
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.venueinfo_main);
		
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
		   //  this.name = extras.getString("Name");
		    this.venue = (Venue) extras.getParcelable("Venue");
		}
		
		Toast toast = Toast.makeText(getBaseContext(), this.venue.getName(), 200);
		toast.show();
		
	}
	
	
	
}
