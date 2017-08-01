
public class SeatContext {
	   private State state;

	   public SeatContext(){
	   	AvailableState availableState = new AvailableState();
	      state = availableState;
	   }

	   public void setState(State state){
	      this.state = state;		
	   }

	   public State getState(){
	      return state;
	   }
	}