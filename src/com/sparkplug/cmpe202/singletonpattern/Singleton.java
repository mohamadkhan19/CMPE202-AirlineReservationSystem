package com.sparkplug.cmpe202.singletonpattern;
import java.util.ArrayList;
import java.util.Scanner;

public class  Singleton{

   private static Singleton instance = new Singleton();
   AirlineReservationSystem ars = new AirlineReservationSystem();
    public Singleton(){
       // System.out.println("Calling Private Constructor from Member Instantiation: " + this.toString());
    	while(true){
    	ars.execute();
    	}
    }

    public static Singleton getInstance(){

        return instance;
    }
}
