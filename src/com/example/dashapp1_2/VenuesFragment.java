package com.example.dashapp1_2;

import java.util.ArrayList;
import java.util.List;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

@SuppressLint("ValidFragment")
public class VenuesFragment extends Fragment {
	public static final String ARG_SECTION_NUMBER = "section_number";
	final Context context;
	
	public VenuesFragment() {
		this.context = null;
	}
	public VenuesFragment(Context c) {
		this.context = c;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		
		final Venue v1 = new Venue("STK","26th Little West 12th St", "@drawable/stk");
		final Venue v2 = new Venue("STK Rooftop","26th Little West 12th St", "@drawable/stkrooftop");
		final Venue v3 = new Venue("Tenjune","26th Little West 12th St", "@drawable/tenjne");
		
		List<Venue> venues = new ArrayList<Venue>();
		
		venues.add(v1);
		venues.add(v2);
		venues.add(v3);
		
		View rootView = inflater.inflate(R.layout.fragment_venues, container, false);
		ListView listview = (ListView) rootView.findViewById(R.id.venues_listview);
		CustomListAdapter customListAdapter = new CustomListAdapter(this.getActivity(), android.R.layout.simple_list_item_1, venues);
		
		listview.setAdapter(customListAdapter);
		
		listview.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
				Intent intent = new Intent(context , VenueInfo.class);
				switch (position) {
				case 0: 
					// intent.putExtra("Name", v1.getName());
					intent.putExtra("Venue",  v1 );
					break;
				case 1 :
					intent.putExtra("Venue",  v2 );
					break;
				case 2:
					intent.putExtra("Venue",  v3 );
				}
					
				startActivity(intent);
			}
		});
		
		
		return rootView;
	}
}