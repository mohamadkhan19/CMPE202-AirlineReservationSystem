package com.sparkplug.cmpe202.seat.statepattern;

public class SeatCheckAvailability {
	public boolean CheckAvailability(String seatType, SeatContext context){
		
		if(seatType.equals("Window")){
			if(context.getState().toString().equals("Available State")){
				System.out.println("Window Seat selected");
				OccupiedState occupiedState = new OccupiedState();
				occupiedState.doAction(seatType,context);
				return true;
			}
			else if (context.getState().toString().equals("Occupied State")){
				System.out.println("Window Seat occupied, please select another");
				return false;
			}
			else{
				System.out.println("Error");
				return false;
			}
		}
		
		if(seatType.equals("Middle")){
			if(context.getState().toString().equals("Available State")){
				System.out.println("Middle Seat selected");
				OccupiedState occupiedState = new OccupiedState();
				occupiedState.doAction(seatType,context);
				return true;
			}
			else if (context.getState().toString().equals("Occupied State")){
				System.out.println("Middle Seat occupied, please select another");
				return false;
			}
			else{
				System.out.println("Error");
				return false;
			}
		}
		
		if(seatType.equals("Aisle")){
			if(context.getState().toString().equals("Available State")){
				System.out.println("Aisle Seat selected");
				OccupiedState occupiedState = new OccupiedState();
				occupiedState.doAction(seatType,context);
				return true;
			}
			else if (context.getState().toString().equals("Occupied State")){
				System.out.println("Aisle Seat occupied, please select another");
				return false;
			}
			else{
				System.out.println("Error");
				return false;
			}
		}
		
		System.out.println("Please enter the right type. HINT: Check the spelling");
		return false;
		
	}
}
