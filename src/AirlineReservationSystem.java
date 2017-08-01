import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AirlineReservationSystem {
	Passenger passenger = new Passenger();
	
	
	
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
	
	public void execute(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of the passenger");
    	String name = scanner.next();
    	System.out.println("Enter dob of the passenger");
    	String dob = scanner.next();
    	String gender = scanner.next();
    	Passenger passenger = new Passenger();
    	passenger.setInformation(name, dob, gender);
    	passenger.getInformation(); // should be under confirmation page
    	
    	FlightDetails flightDetails = new FlightDetails();
		System.out.println("Retrieving list of all flights");
		ArrayList<String> flightsList = buildFlights();
		Iterator<String> iterator = flightsList.iterator();
		while(iterator.hasNext()){
		
		    Flights flight1 = flightDetails.getFlights(iterator.next());
		    flight1.getFlights();
		}
		System.out.println("Enter flight number");
		String flightnumber = scanner.next();
		passenger.addFlightNumber(flightnumber);
		
		
	}
	
	public static ArrayList<String> buildFlights(){

        ArrayList<String> autos = new ArrayList<String>();

        autos.add("EMIRATES");
        autos.add("ETEHAD");

        return autos;
    }
}
