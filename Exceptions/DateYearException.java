package Exceptions;

import java.io.IOException;

public class DateYearException extends IOException {
    public DateYearException(){
        super(" ---> Date format is incorrect, you are too yang or too old!");
    }
}
