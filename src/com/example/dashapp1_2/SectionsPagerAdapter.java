package com.example.dashapp1_2;

import java.util.Locale;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {
	final Context context;
	
	public SectionsPagerAdapter(FragmentManager fm, Context c) {
		super(fm);
		this.context = c;
	}

	@Override
	public Fragment getItem(int position) {
		// getItem is called to instantiate the fragment for the given page.
		// Return a DummySectionFragment (defined as a static inner class
		// below) with the page number as its lone argument.
        switch (position) {
        case 0:
        	
            // Venues fragment activity
            return new VenuesFragment(context);
        case 1:
            // Open Tabs fragment activity
            return new OpenTabsFragment();
        case 2:
            // Settings fragment activity
            return new SettingsFragment();
        }
 
        return null;
	}

	@Override
	public int getCount() {
		// Show 3 total pages.
		return 3;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		Locale l = Locale.getDefault();
		switch (position) {
		case 0:
			return context.getString(R.string.title_section1).toUpperCase(l);
		case 1:
			return context.getString(R.string.title_section2).toUpperCase(l);
		case 2:
			return context.getString(R.string.title_section3).toUpperCase(l);
		}
		return null;
	}
}