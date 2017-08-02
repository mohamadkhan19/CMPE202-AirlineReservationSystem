package com.sparkplug.cmpe202.food.decoratorpattern;

/**
 * Created by MeghShrey on 8/1/2017.
 */
public class Non_Vegetarian extends MealDecorator implements Meal {

   public Non_Vegetarian(Meal c){ super(c);}

    @Override
    public String getMealType() {

        return " Non_Vegetarian burger";
    }



}
