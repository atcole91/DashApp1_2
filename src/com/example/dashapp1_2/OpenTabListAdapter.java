package com.example.dashapp1_2;

import java.util.List;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class OpenTabListAdapter extends ArrayAdapter{
	 Context context;
	 
		public OpenTabListAdapter(Context context, int textViewResourceId) {
		    super(context, textViewResourceId);
		    this.context = context;
		    // TODO Auto-generated constructor stub
		}

		private List<Tab> tabs;

		public OpenTabListAdapter(Context context, int resource, List<Tab> tabs) {

		    super(context, resource, tabs);
		    this.context = context;
		    this.tabs = tabs;

		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {

		    View v = convertView;

		    if (v == null) {

		        LayoutInflater vi;
		        vi = LayoutInflater.from(getContext());
		        v = vi.inflate(R.layout.open_tabs_list, null);

		    }

		    Tab p = tabs.get(position);

		    if (p != null) {

		        TextView tt = (TextView) v.findViewById(R.id.Name);
		        TextView tt1 = (TextView) v.findViewById(R.id.Address);
		        ImageView tt3 = (ImageView) v.findViewById(R.id.icon);
		        String uri = p.getVenue().getImageLocation();
		        int imageResource = context.getResources().getIdentifier(uri, null, context.getPackageName());

		        if (tt != null) {
		            tt.setText(p.getVenue().getName());
		        }
		        if (tt1 != null) {

		            tt1.setText(p.getVenue().getAddress());
		        }
		        if (tt3 != null) {
		        	
		        	Drawable res = context.getResources().getDrawable(imageResource);
		        	tt3.setImageDrawable(res);
		            
		        }
		    }
		    return v;
	}
	
}
