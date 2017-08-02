package com.sparkplug.cmpe202.food.decoratorpattern;

/**
 * Created by MeghShrey on 8/1/2017.
 */
public abstract class MealDecorator implements Meal {
    protected final Meal decoratedMeal;

    public MealDecorator(Meal c){ this.decoratedMeal = c;};

    public String getMealType() {
        return decoratedMeal.getMealType();
    }


}
