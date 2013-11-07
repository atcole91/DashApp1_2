package com.example.dashapp1_2;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.Toast;
import com.example.dashapp1_2.R;


public class VenueInfo extends Activity{
	 String name;
	 Venue venue;
	 
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.venueinfo_activity);
		ImageView image = (ImageView) this.findViewById(R.id.venueInfoImage);
		
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
		   //  this.name = extras.getString("Name");
		    this.venue = (Venue) extras.getParcelable("Venue");
		}
		
		//Toast toast = Toast.makeText(getBaseContext(), this.venue.getName(), 200);
		// toast.show();
	     
		String uri = venue.getImageLocation();
		
	    int imageResource = getBaseContext().getResources().getIdentifier(uri , null , getBaseContext().getPackageName());
	    Toast toast = Toast.makeText(getBaseContext(), String.valueOf(imageResource), 200);
	    toast.show();
	    Drawable res = getResources().getDrawable(imageResource);
		image.setImageDrawable(res);
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
}

