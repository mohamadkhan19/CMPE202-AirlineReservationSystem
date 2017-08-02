package com.sparkplug.cmpe202.passenger;

import java.util.ArrayList;

public class Passenger {
	String name;
	String dob;
	String gender;
	String flightnumber;
	String seatType;
	
	
	
	public Passenger(){
		name=null;
		dob=null;
		gender=null;
		flightnumber = null;
		seatType = null;
		
	}
	
	public void setInformation(String name,String dob,String gender){
		// set name, age, gender etc
		this.name=name;
		this.dob=dob;
		this.gender=gender;
		}
	public void addFlightNumber(String flightnumber){
		this.flightnumber = flightnumber;
	}
	public void addSeatType(String seatType){
		this.seatType = seatType;
	}
	
	public void getInformation(){
			System.out.println("name, dob, gender: "+ name+" "+dob+" "+ gender);
		}
	public ArrayList<String> addPassenger(ArrayList<String> passengerList){
		passengerList.add(name);
		passengerList.add(dob);
		passengerList.add(gender);
		passengerList.add(flightnumber);
		passengerList.add(seatType);
		
		return passengerList;
		
	}

}
