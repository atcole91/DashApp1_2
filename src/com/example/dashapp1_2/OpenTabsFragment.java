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
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

@SuppressLint("ValidFragment")
public  class OpenTabsFragment extends Fragment {
	public final String ARG_SECTION_NUMBER = "section_number";
	final Context context;
	public OpenTabsFragment() {
		this.context = null;
	}
	
	public OpenTabsFragment(Context c) {
		this.context = c;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		List<Tab> tabs = new ArrayList<Tab>();
		final Tab tab1 = new Tab(new Venue("STK Rooftop", "26th Little West 12th Street","@drawable/ic_launcher"), "Andrew Cole", null);
		tab1.addItem("Dog Fish Head, 90 min IPA" , 8.00);
		tab1.addItem("Tequila Shot" , 6.00);
		
		tabs.add(tab1);
		
		View rootView = inflater.inflate(R.layout.fragment_open_tabs, container, false);
		ListView listview = (ListView) rootView.findViewById(R.id.opentabs_listview);
		OpenTabListAdapter openTabListAdapter = new OpenTabListAdapter(this.getActivity(), android.R.layout.simple_list_item_1, tabs);
		
		listview.setAdapter(openTabListAdapter);
		
		listview.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
				Intent intent1 = new Intent(context , OpenTab.class);
					 intent1.putExtra("Tab",  tab1 );
					 startActivity(intent1);
				}
			});
		return rootView;
}
}