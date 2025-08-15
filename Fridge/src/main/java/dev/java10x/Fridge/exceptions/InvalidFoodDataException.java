package dev.java10x.Fridge.exceptions;

public class InvalidFoodDataException extends RuntimeException {
    public InvalidFoodDataException(String message) {
        super(message);
    }
}
