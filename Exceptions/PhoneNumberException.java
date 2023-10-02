package Exceptions;

public class PhoneNumberException extends NumberFormatException {
    public PhoneNumberException(){
        super(" ---> Incorrect phone number, use only numbers!\n" +
                "Length of the phone number has to be more than 5 and less 11 symbols!");
    }
}
