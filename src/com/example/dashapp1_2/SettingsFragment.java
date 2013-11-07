package com.example.dashapp1_2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

@SuppressLint("ValidFragment")
public class SettingsFragment extends Fragment {
	
	public final String ARG_SECTION_NUMBER = "section_number";
	public final Context context;
	
	public SettingsFragment() {
		this.context = null;
	}
	
	public SettingsFragment(Context c) {
		this.context = c;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_settings ,container, false);
		TextView text1 = (TextView) rootView.findViewById(R.id.nameandemail);
		text1.setText("Name and Email");
		
		EditText editText = (EditText) rootView.findViewById(R.id.firstName);
		editText.setOnEditorActionListener(new OnEditorActionListener() {
		    @Override
		    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
		        boolean handled = false;
		        if (actionId == EditorInfo.IME_ACTION_SEND) {
		            
		            handled = true;
		        }
		        return handled;
		    }
		});
		EditText editText2 = (EditText) rootView.findViewById(R.id.lastName);
		editText.setOnEditorActionListener(new OnEditorActionListener() {
		    @Override
		    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
		        boolean handled = false;
		        if (actionId == EditorInfo.IME_ACTION_SEND) {
		            handled = true;
		        }
		        return handled;
		    }
		});
		EditText editText3 = (EditText) rootView.findViewById(R.id.email);
		editText.setOnEditorActionListener(new OnEditorActionListener() {
		    @Override
		    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
		        boolean handled = false;
		        if (actionId == EditorInfo.IME_ACTION_SEND) {
		            handled = true;
		        }
		        return handled;
		    }
		});
		
		return rootView;
	}
}