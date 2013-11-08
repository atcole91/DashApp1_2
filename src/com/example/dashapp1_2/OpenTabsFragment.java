package com.example.dashapp1_2;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

public  class OpenTabsFragment extends Fragment {
	public final String ARG_SECTION_NUMBER = "section_number";

	public OpenTabsFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		List<Tab> tabs = new ArrayList<Tab>();
		Tab tab1 = new Tab(new Venue("STK Rooftop", "26th Little West 12th Street","@drawable/ic_launcher"), "Andrew Cole", null);
		
		tabs.add(tab1);
		
		View rootView = inflater.inflate(R.layout.fragment_open_tabs, container, false);
		ListView listview = (ListView) rootView.findViewById(R.id.opentabs_listview);
		OpenTabListAdapter openTabListAdapter = new OpenTabListAdapter(this.getActivity(), android.R.layout.simple_list_item_1, tabs);
		
		listview.setAdapter(openTabListAdapter);
		
		return rootView;
	}
}