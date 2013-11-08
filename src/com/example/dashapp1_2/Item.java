package com.example.dashapp1_2;

import android.os.Parcel;
import android.os.Parcelable;

public class Item implements Parcelable {
	 String name;
	 double price;
	
	public Item(String n, double p) {
		this.name = n;
		this.price = p;
	}
	
	public Item(Parcel in) {
		this.name = in.readString();
		this.price = in.readDouble();
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public void setPrice(double p) {
		this.price = p;
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
	dest.writeString(this.name);
	dest.writeDouble(this.price);
	}
	
	public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Item createFromParcel(Parcel in) {
            return new Item(in); 
        }

        public Item[] newArray(int size) {
            return new Item[size];
        }
    };
	
	
}
