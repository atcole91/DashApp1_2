package com.example.dashapp1_2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.dashapp1_2.R;


public class VenueInfo extends Activity{
	 String name;
	 Venue venue;
	 Button openTabButton;
	 
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.venueinfo_activity);
		ImageView image = (ImageView) this.findViewById(R.id.venueInfoImage);
		
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
		    this.venue = (Venue) extras.getParcelable("Venue");
		}
		
		String uri = venue.getImageLocation();
		
	    int imageResource = getBaseContext().getResources().getIdentifier(uri , null , getBaseContext().getPackageName());
	    
	    Drawable res = getResources().getDrawable(imageResource);
		image.setImageDrawable(res);
		
		this.openTabButton = (Button)this.findViewById(R.id.openATab);
		this.openTabButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Toast toast = Toast.makeText(getBaseContext(), "You cannot open a tab here, remember what happened last time?", 600);
        	    toast.show();
            }
        });
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
}

