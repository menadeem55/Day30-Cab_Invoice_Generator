package com.bridgelabz.jdbc1.Day30_Cab_Invoice;

public class Ride {
	public final int time;
	public double distance;

	public Ride(double distance, int time) {
		this.distance = distance;
		this.time = time;
	}
}
