
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
	
	public void getInformation(){
			System.out.println("name, dob, gender: "+ name+" "+dob+" "+ gender);
		}

}
