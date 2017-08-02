package com.sparkplug.cmpe202.flight.factorypattern;

import java.util.ArrayList;

public class BuildFlights {
	
	public static ArrayList<String> buildFlights(){

        ArrayList<String> flights = new ArrayList<String>();

        flights.add("EMIRATES");
        flights.add("ETEHAD");

        return flights;
    }

}
