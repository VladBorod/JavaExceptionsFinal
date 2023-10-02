package Exceptions;

public class ConsoleErrorException extends Exception {
    public ConsoleErrorException(){
        super("Something goes wrong, please try agan");
    }
}
