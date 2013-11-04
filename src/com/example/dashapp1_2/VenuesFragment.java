package com.example.dashapp1_2;

import java.util.ArrayList;
import java.util.List;

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

public class VenuesFragment extends Fragment {
	public static final String ARG_SECTION_NUMBER = "section_number";
	
	public VenuesFragment() {
		
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		String[] Venues = { "STK" , "STK Rooftop" , "Tenjune" , "Bagatelle" , "Charlemagne" };
		Venue v1 = new Venue("STK","26th Little West 12th St", "@drawable/ic_launcher");
		Venue v2 = new Venue("STK Rooftop","26th Little West 12th St", "@drawable/ic_launcher");
		Venue v3 = new Venue("STK Mucho Rooftop","26th Little West 12th St", "@drawable/ic_launcher");
		
		List<Venue> venues = new ArrayList<Venue>();
		
		venues.add(v1);
		venues.add(v2);
		venues.add(v3);
		
		View rootView = inflater.inflate(R.layout.fragment_venues, container, false);
		ListView listview = (ListView) rootView.findViewById(R.id.venues_listview);
		CustomListAdapter customListAdapter = new CustomListAdapter(this.getActivity(), android.R.layout.simple_list_item_1, venues);
		
		listview.setAdapter(customListAdapter);
		
		/*
		View rootView = inflater.inflate(R.layout.fragment_venues, container, false);
		ListView listview = (ListView) rootView.findViewById(R.id.venues_listview);
		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (this.getActivity(), android.R.layout.simple_list_item_1, Venues);
		
		listview.setAdapter(arrayAdapter);
		
		OnItemClickListener mMessageClickHandler = new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				String toast = "To you";
				Toast.makeText(parent.getContext(), toast, 200).show();
				
			}
		};
		listview.setOnItemClickListener(mMessageClickHandler);
		*/
		return rootView;
	}
}