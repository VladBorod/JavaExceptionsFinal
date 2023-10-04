package Exceptions;

public class InputArraySizeExceptionMin extends RuntimeException{
    public InputArraySizeExceptionMin(){
        super(" ---> Incorrect number of personal parameters, \n" +
                "excessively small amount of data, checkout and try agan!");
    }
}
