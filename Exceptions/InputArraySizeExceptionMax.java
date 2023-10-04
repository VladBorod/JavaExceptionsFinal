package Exceptions;

public class InputArraySizeExceptionMax extends RuntimeException{
    public InputArraySizeExceptionMax(){
        super(" ---> Incorrect number of personal parameters, \n" +
                "excessively large amount of data, checkout and try agan!");
    }
}
