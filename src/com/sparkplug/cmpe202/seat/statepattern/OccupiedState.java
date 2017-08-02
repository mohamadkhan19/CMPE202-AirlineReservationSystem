package com.sparkplug.cmpe202.seat.statepattern;

public class OccupiedState implements State {

	   public void doAction(String SeatType, SeatContext context) {
	      //System.out.println("This seat is in occupied state");
	     // context.setState(this);	
	      
	       if (SeatType.equals("Window")){
	    	  System.out.println("This seat is in occupied state");
		      context.setState(new OccupiedState());
		   }
		   if (SeatType.equals("Middle")){
		      System.out.println("This seat is in occupied state");
		      context.setState(new OccupiedState());
		   }
		   if (SeatType.equals("Aisle")){
		   	  System.out.println("This seat is in occupied state");
		      context.setState(new OccupiedState());
		   }
	   }

	   public String toString(){
	      return "Occupied State";
	   }
	}