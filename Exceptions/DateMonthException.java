package Exceptions;

import java.io.IOException;

public class DateMonthException extends IOException {
    public DateMonthException(){
        super(" ---> Date format is incorrect, this month doesn't exists");
    }
}
