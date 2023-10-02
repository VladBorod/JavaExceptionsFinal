package Exceptions;

public class GenderFailureException extends RuntimeException{
    public GenderFailureException(){
        super("There are only two genders, male (m/м) and female (f/ж)");
    }
}
