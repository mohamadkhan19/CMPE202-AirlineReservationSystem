import java.util.ArrayList;
import java.util.Scanner;

public class  Singleton{

   private static Singleton instance = new Singleton();

    public Singleton(){
       // System.out.println("Calling Private Constructor from Member Instantiation: " + this.toString());
    	AirlineReservationSystem ars = new AirlineReservationSystem();
    	ars.execute();
    }

    public static Singleton getInstance(){

        return instance;
    }
}
