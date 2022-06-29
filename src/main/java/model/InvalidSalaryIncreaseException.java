package model;


public class InvalidSalaryIncreaseException extends Exception {

    private static final String exceptionMessage = "Has to be a integer and a positive number ";


    public InvalidSalaryIncreaseException() {
        super(exceptionMessage);
    }
}
