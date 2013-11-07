package com.example.dashapp1_2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class VenueInfoAdapter extends ArrayAdapter {
	final Venue venue;
	final Context context;
	
	
	public VenueInfoAdapter (Context context, int resource, Venue venue) {
		super(context, resource);
		this.venue = venue;
		this.context = context;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		 View v = convertView;
		 if (v == null) {

		        LayoutInflater vi;
		        vi = LayoutInflater.from(getContext());
		        v = vi.inflate(R.layout.venueinfo_activity, null);

		    }
		 
		 TextView tt = (TextView) v.findViewById(R.id.venueName);
		 ImageView tt3 = (ImageView) v.findViewById(R.id.venueInfoImage);
		 
		 
		 String uri = venue.getImageLocation();
	     int imageResource = context.getResources().getIdentifier(uri, null, context.getPackageName());
		 
	     Drawable res = context.getResources().getDrawable(imageResource);
     	 tt3.setImageDrawable(res);
     	 
		 return v;
	}

}
