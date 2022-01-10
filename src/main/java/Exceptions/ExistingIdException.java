package Exceptions;

public class ExistingIdException extends Exception{
    public ExistingIdException(String errorMessage){
        super(errorMessage);
    }
}
