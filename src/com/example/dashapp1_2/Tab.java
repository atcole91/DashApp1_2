package com.example.dashapp1_2;

import android.os.Parcel;
import android.os.Parcelable;

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
		while (s != null) {
			String tempName = null;
			double tempPrice = (Double) null;
			if (i == 0) {
				tempName = s;
				i ++;
			}
			if (i == 1) {
				tempPrice = Double.valueOf(s);
				this.addItem(tempName, tempPrice);
				i = 0;
			}
			
		}
		
	}
	
	public void addItem(String n, double p) {
		// Adding an Item to an Array is annoying
		int length = items.length;
		Item[] temp = new Item[length + 1];
		for (int j = 0; j < length; j++) {
			temp[j] = items[j];
		}
		temp[length + 1] = new Item(n,p);
		this.items = temp;
		
	}
	
	public String getUser() {
		return this.user;
	}
	
	public Venue getVenue() {
		return this.venue;
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel out, int flags) {
		out.writeStringArray(new String[] {this.venue.getName(), this.venue.getAddress(), this.venue.getImageLocation(), this.user });
		out.writeArray(this.items);
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
