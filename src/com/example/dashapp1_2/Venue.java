package com.example.dashapp1_2;

public class Venue {

	final String name;
	final String address;
	final String imageLocation;
	
	public Venue(String n, String a, String imgLoc ) {
		this.name = n;
		this.address = a;
		this.imageLocation = imgLoc;
	}
	
	public String getName() {
		return this.name;
		
	}
	
	public String getAddress() {
		return this.address;
		
	}
	
	public String getImageLocation() {
		return this.imageLocation;
	}
	

}
