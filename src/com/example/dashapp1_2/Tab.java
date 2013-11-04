package com.example.dashapp1_2;

public class Tab {
	final Venue venue;
	final String user;
	
	public Tab(Venue v, String s) {
		this.venue = v;
		this.user = s;
	}
	
	public String getUser() {
		return this.user;
	}
	
	public Venue getVenue() {
		return this.venue;
	}

}
