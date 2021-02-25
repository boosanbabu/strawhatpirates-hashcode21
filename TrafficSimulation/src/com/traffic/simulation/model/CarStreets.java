package com.traffic.simulation.model;

import java.util.Arrays;

public class CarStreets {
	int noOfStreets;
	String[] streetNames;

	CarStreets(int n, String... st) {
		streetNames = Arrays.copyOf(st, st.length);
		noOfStreets = n;
	}

	public int getNoOfStreets() {
		return noOfStreets;
	}

	public void setNoOfStreets(int noOfStreets) {
		this.noOfStreets = noOfStreets;
	}

	public String[] getStreetNames() {
		return streetNames;
	}

	public void setStreetNames(String[] streetNames) {
		this.streetNames = streetNames;
	}

	@Override
	public String toString() {
		return "CarStreets [noOfStreets=" + noOfStreets + ", streetNames=" + Arrays.toString(streetNames) + "]";
	}

}
