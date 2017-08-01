
public class AvailableState implements State {

	   public static void doAction(SeatContext context) {
	      System.out.println("This seat is in available state");
	      context.setState(new AvailableState());
	   }

	   public String toString(){
	      return "Available State";
	   }
	}