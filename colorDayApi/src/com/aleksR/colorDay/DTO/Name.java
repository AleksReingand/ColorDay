package com.aleksR.colorDay.DTO;

public class Name {
	String value;
	String closest_named_hex;
	boolean exact_match_name;
	int distance;

	public String getValue() {
		return value;
	}

	public String getClosest_named_hex() {
		return closest_named_hex;
	}

	public boolean isExact_match_name() {
		return exact_match_name;
	}

	public int getDistance() {
		return distance;
	}

}
