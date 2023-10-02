package Exceptions;

import java.io.IOException;

public class DateDaysException extends IOException {
    public DateDaysException(){
        super(" ---> Date format is incorrect, there is no such days quantity per month");
    }
}
