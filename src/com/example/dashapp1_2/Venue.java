package com.example.dashapp1_2;

import android.os.Parcel;
import android.os.Parcelable;

public class Venue implements Parcelable {

	 String name;
	 String address;
	 String imageLocation;
	
	public Venue(String n, String a, String imgLoc ) {
		this.name = n;
		this.address = a;
		this.imageLocation = imgLoc;
	}
	
	public Venue(Parcel in) {
		String[] instring = new String[3];
		in.readStringArray(instring);
		
		this.name = instring[0];
		this.address = instring[1];
		this.imageLocation = instring[2]; 
	}
	
	public String getName() {
		return this.name;
		
	}
	public void setName(String s) {
		this.name = s;
	}
	
	public String getAddress() {
		return this.address;
		
	}
	public void setAddress(String s) {
		this.name = s;
	}
	
	public String getImageLocation() {
		return this.imageLocation;
	}
	public void setImageLocation(String s) {
		this.name = s;
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel out, int arg1) {
		out.writeStringArray(new String[] { this.name, this.address, this.imageLocation });
	}
	
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Venue createFromParcel(Parcel in) {
            return new Venue(in); 
        }

        public Venue[] newArray(int size) {
            return new Venue[size];
        }
    };

}
