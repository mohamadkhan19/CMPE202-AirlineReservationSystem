package com.sparkplug.cmpe202.singletonpattern;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.sparkplug.cmpe202.flight.factorypattern.BuildFlights;
import com.sparkplug.cmpe202.flight.factorypattern.FlightDetails;
import com.sparkplug.cmpe202.flight.factorypattern.Flights;
import com.sparkplug.cmpe202.food.decoratorpattern.FoodInformation;
import com.sparkplug.cmpe202.food.decoratorpattern.Italian;
import com.sparkplug.cmpe202.food.decoratorpattern.Meal;
import com.sparkplug.cmpe202.food.decoratorpattern.Non_Vegetarian;
import com.sparkplug.cmpe202.food.decoratorpattern.Vegetarian;
import com.sparkplug.cmpe202.passenger.Passenger;
import com.sparkplug.cmpe202.seat.factorypattern.Seat;
import com.sparkplug.cmpe202.seat.factorypattern.SeatDetails;
import com.sparkplug.cmpe202.seat.statepattern.AvailableState;
import com.sparkplug.cmpe202.seat.statepattern.BuildSeatType;
import com.sparkplug.cmpe202.seat.statepattern.OccupiedState;
import com.sparkplug.cmpe202.seat.statepattern.SeatCheckAvailability;
import com.sparkplug.cmpe202.seat.statepattern.SeatContext;

public class AirlineReservationSystem {
	
	//declare variables
	static Scanner scanner;
	static String name;
	static String dob;
	static String gender;
	static String food;
	static SeatContext context;
	static String seatType;
	static ArrayList<String> passengerList = new ArrayList();
	static int index=0;
	static Boolean decision;
	static Meal meal;
	static ArrayList<String> flightsList;
	static Iterator<String> iterator1;
	static Iterator<String> iterator2;
	static ArrayList<String> seatsList;
	
	
	//declare objects
	static Passenger passenger = new Passenger();
	static FlightDetails flightDetails = new FlightDetails();
	static BuildFlights buildFlights = new BuildFlights();
	static BuildSeatType buildSeatType = new BuildSeatType();
	static SeatCheckAvailability checkAvailability = new SeatCheckAvailability();
	static FoodInformation foodInformation = new FoodInformation();
	
	//constructor
	public AirlineReservationSystem() {
		Passenger passenger = new Passenger();
		context = new SeatContext();
		AvailableState.doAction("Window",context);
		AvailableState.doAction("Middle",context);
		AvailableState.doAction("Aisle",context);
		index+=1;
	}
	
	
	//Confirmation confirmation = new Confirmation();
	
/*setinformation(); // save user data into variables
	getflightinfo();try to apply observer pattern, Factory seems good
	getseat(); (we are giving three states)
	setseat();(inside this function check if the seat is avaible or not) Apply state pattern
	getluggageoptions()
	setluggage()
	getfood()
	setfood() (apply decorator pattern)
	confirmation()
	*/
	
	public  static void execute(){
		//Retrieving Passenger information
		scanner = new Scanner(System.in);
		System.out.println("Enter name of the passenger");
    	name = scanner.next();
    	System.out.println("Enter dob of the passenger");
    	dob = scanner.next();
    	System.out.println("Enter gender of the passenger");
    	gender = scanner.next();
    	passenger.setInformation(name, dob, gender);
    	
    	
    	//FLight module implementing Factory pattern
    	
		System.out.println("Retrieving list of all flights");
		flightsList = buildFlights.buildFlights();
		iterator1 = flightsList.iterator();
		while(iterator1.hasNext()){
		
		    Flights flight1 = flightDetails.getFlights(iterator1.next());
		    flight1.getFlights();
		}
		System.out.println("Enter flight number");
		String flightnumber = scanner.next();
		passenger.addFlightNumber(flightnumber);
		
		// Seat module implementing State pattern
		while(true){
		SeatDetails seatDetails = new SeatDetails();
		System.out.println("Retrieving list of all seats");
		seatsList = buildSeatType.buildSeatType();	
		iterator2 = seatsList.iterator();
		while(iterator2.hasNext()){
		
		    Seat seat1 = seatDetails.getSeats(iterator2.next());
		    seat1.getSeats();
		}
		System.out.println("Choose seat type");
        seatType = scanner.next();
        decision = checkAvailability.CheckAvailability(seatType, context);
        if(decision.equals(true)){
        	break;
        }
		/*if(context.getState().toString().equals("Available State")){
			System.out.println("Window Seat selected");
			OccupiedState occupiedState = new OccupiedState();
			occupiedState.doAction(seatType,context);
			break;
		}
		else if (context.getState().toString().equals("Occupied State")){
			System.out.println("Window Seat occupied, please select another");
		}
		else{
			System.out.println("Error");
		}*/
		}
		passenger.addSeatType(seatType);
		
		//Food order module, Implementing Decorator pattern
		
		System.out.println("Choose Meal Type from the options: Vegetarian , Non_Vegetarian, Italian");

		
		food = scanner.next();

		if (food.equals("Vegetarian")) {
			meal = new Vegetarian();
			foodInformation.getFoodInformation(meal);
		} else if (food.equals("Non_Vegetarian")) {

			meal = new Vegetarian();
			meal = new Non_Vegetarian(meal);
			foodInformation.getFoodInformation(meal);
		} else if (food.equals("Italian")) {

			meal = new Vegetarian();
			meal = new Italian(meal);
			foodInformation.getFoodInformation(meal);
		} else {
			System.out.println(" Option chosen is wrong");
		}
		
		
		//confirmation page
		passenger.getInformation(); // have to delete this
		passengerList=passenger.addPassenger(passengerList);
		
		
		
		for(String item : passengerList){
			System.out.println(item);
		}
	}
}
