
public class FlightDetails {
	public Flights getFlights(String flights){

        
        if(flights == "EMIRATES")
            return new Emirates();
        else if(flights == "ETEHAD")
            return new Etehad();
        else
        	return null;


    }
	
	public void setFlights(){}
}
