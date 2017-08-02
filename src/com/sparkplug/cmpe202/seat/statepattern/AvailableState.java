package com.sparkplug.cmpe202.seat.statepattern;

public class AvailableState implements State {

	   public static void doAction(String SeatType, SeatContext context) {
		   
		   if (SeatType.equals("Window")){
		      //System.out.println("This seat is in available state");
		      context.setState(new AvailableState());
		   }
		   if (SeatType.equals("Middle")){
			      //System.out.println("This seat is in available state");
			      context.setState(new AvailableState());
			   }
		   if (SeatType.equals("Aisle")){
			      //System.out.println("This seat is in available state");
			      context.setState(new AvailableState());
			   }
	   }

	   public String toString(){
	      return "Available State";
	   }
	}