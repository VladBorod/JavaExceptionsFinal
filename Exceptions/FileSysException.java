package Exceptions;

import java.io.IOException;

public class FileSysException extends IOException {
    public FileSysException(){
        super("File error!");
    }
}
