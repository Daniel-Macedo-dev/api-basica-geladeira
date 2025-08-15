package dev.java10x.Fridge.exceptions;

public class FoodNotFoundException extends RuntimeException{
    public FoodNotFoundException(String message){super(message); }
}
