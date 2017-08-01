
public class AvailableState implements State {

	   public void doAction(SeatContext context) {
	      System.out.println("This seat is in available state");
	      context.setState(this);	
	   }

	   public String toString(){
	      return "Available State";
	   }
	}