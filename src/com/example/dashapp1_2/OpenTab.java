package com.example.dashapp1_2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class OpenTab extends Activity {
	
	Tab tab;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_viewtab);
		Bundle extras = getIntent().getExtras();
		
		if (extras != null) {
		    this.tab = (Tab) extras.getParcelable("Tab");
		}
		

	    
		TextView text1 = (TextView) this.findViewById(R.id.text1);
		text1.setText(this.tab.getUser());
	     
		
	     
	     
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
}
