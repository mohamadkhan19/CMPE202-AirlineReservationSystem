package com.sparkplug.cmpe202.seat.factorypattern;

public class SeatDetails {
		public Seat getSeats(String seat){

	        
	        if(seat == "WINDOW")
	            return new Window();
	        else if(seat == "MIDDLE")
	            return new Middle();
	        else if(seat == "AISLE")
	            return new Aisle();
	        else
	        	return null;


	    }
		
		public void setSeats(){}
}


