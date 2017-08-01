
public class OccupiedState implements State {

	   public void doAction(SeatContext context) {
	      System.out.println("This seat is in occupied state");
	      context.setState(this);	
	   }

	   public String toString(){
	      return "Occupied State";
	   }
	}