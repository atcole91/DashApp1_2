package com.example.dashapp1_2;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

public class Tab implements Parcelable {
	final Venue venue;
	final String user;
	Item[] items;
	
	public Tab(Venue v, String s, Item[] i) {
		this.venue = v;
		this.user = s;
		this.items = i;
	}
	
	public Tab(Parcel in) {
		/*
		String[] instring = new String[4];
		in.readStringArray(instring);
		Venue tempVenue = new Venue(null, null , null);
		tempVenue.setName(instring[0]);
		tempVenue.setAddress(instring[1]);
		tempVenue.setImageLocation(instring[2]);
		
		this.venue = tempVenue;
		this.user = instring[3];
		this.items = null;
		
		String s = in.readString();
		int i = 0;
		while (s != null && s != "") {
			String tempName = null;
			double tempPrice = 0.0;
			if (i == 0) {
				tempName = s;
				i ++;
			}
			if (i == 1) {
				Log.w("Warn" , s);
				tempPrice = Double.valueOf(s);
				this.addItem(tempName, 0.0);
				i = 0;
			}
			s = in.readString();
		}
		*/
		
		String[] instring = new String[6];
		in.readStringArray(instring);
		Venue tempVenue = new Venue(null, null , null);
		tempVenue.setName(instring[0]);
		tempVenue.setAddress(instring[1]);
		tempVenue.setImageLocation(instring[2]);
		
		this.venue = tempVenue;
		this.user = instring[3];
		
		this.addItem(instring[4],Double.valueOf(instring[5]));
		
	}
	
	public void addItem(String n, double p) {
		// Adding an Item to an Array is annoying
		if (items != null){ 
		int length = items.length;
		Item[] temp = new Item[length + 1];
		for (int j = 0; j < length; j++) {
			temp[j] = items[j];
		}
		temp[length] = new Item(n,p);
		this.items = temp;
		}
		else  {
			Item[] temp = new Item[1];
			temp[0] = new Item(n,p);
			items = temp;
		}
	}
	
	public String getUser() {
		return this.user;
	}
	
	public Venue getVenue() {
		return this.venue;
	}
	
	public String toString() {
		return this.user;
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel out, int flags) {
		out.writeStringArray(new String[] {this.venue.getName(), this.venue.getAddress(), this.venue.getImageLocation(), this.user, this.items[0].getName(), String.valueOf(this.items[0].getPrice()) });
	}
	
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Tab createFromParcel(Parcel in) {
            return new Tab(in); 
        }

        public Venue[] newArray(int size) {
            return new Venue[size];
        }
    };

}
