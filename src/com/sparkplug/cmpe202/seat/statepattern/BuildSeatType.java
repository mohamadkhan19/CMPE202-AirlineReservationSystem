package com.sparkplug.cmpe202.seat.statepattern;

import java.util.ArrayList;

public class BuildSeatType {
	public static ArrayList<String> buildSeatType(){

        ArrayList<String> seatTypes = new ArrayList<String>();

        seatTypes.add("WINDOW");
        seatTypes.add("MIDDLE");
        seatTypes.add("AISLE");

        return seatTypes;
    }
}
