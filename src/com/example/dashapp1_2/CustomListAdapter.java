package com.example.dashapp1_2;

import java.util.List;

import android.content.ClipData.Item;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomListAdapter extends ArrayAdapter {

	 Context context;
	public CustomListAdapter(Context context, int textViewResourceId) {
	    super(context, textViewResourceId);
	    this.context = context;
	    // TODO Auto-generated constructor stub
	}

	private List<Venue> venues;

	public CustomListAdapter(Context context, int resource, List<Venue> items) {

	    super(context, resource, items);
	    this.context = context;
	    this.venues = items;

	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

	    View v = convertView;

	    if (v == null) {

	        LayoutInflater vi;
	        vi = LayoutInflater.from(getContext());
	        v = vi.inflate(R.layout.venue_list, null);

	    }

	    Venue p = venues.get(position);

	    if (p != null) {

	        TextView tt = (TextView) v.findViewById(R.id.Name);
	        TextView tt1 = (TextView) v.findViewById(R.id.Address);
	        ImageView tt3 = (ImageView) v.findViewById(R.id.icon);
	        String uri = p.getImageLocation();
	        int imageResource = context.getResources().getIdentifier(uri, "drawable", context.getPackageName());
			
	        if (tt != null) {
	            tt.setText(p.getName());
	        }
	        if (tt1 != null) {
	            tt1.setText(p.getAddress());
	        }
	        if (tt3 != null) {
	        	// use this when I upload thumbnail versions of the venues
	        	// tt3.setImageResource(imageResource);
	        	tt3.setImageResource(R.drawable.ic_launcher);
	        }
	    }
	    return v;
}
}
