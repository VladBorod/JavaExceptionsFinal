import Exceptions.ConsoleErrorException;
import Exceptions.FileSysException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Recorder {


    public static List<String> registration() throws FileSysException {
        List<String> personalData = new ArrayList<>();
        System.out.println("Enter the data in next given order using space button");
        System.out.println("Name, Surname, Patronymic, Birth Date (format: dd.mm.yyyy), " +
                "Phone number, Gender (m or f)");
//    console input
        String data;
        try(BufferedReader personDataBR = new BufferedReader(new InputStreamReader(System.in))){
            data = personDataBR.readLine();
        } catch (IOException e){
            try {
                throw new ConsoleErrorException();
            } catch (ConsoleErrorException ex) {
                throw new RuntimeException(ex);
            }
        }
        String[] dataArray = data.split(" ");
        Examinations.arrayLengthExamination(dataArray);
        Examinations.nameExamination(dataArray[0]);
        Examinations.surnameExamination(dataArray[1]);
        Examinations.patronymicExamination(dataArray[2]);
        Examinations.birthDateExamination(dataArray[3]);
        Examinations.phoneNumberExamination(dataArray[4]);
        Examinations.genderExamination(dataArray[5].toLowerCase(Locale.ROOT));
        personalData.add(dataArray[0]);
        personalData.add(dataArray[1]);
        personalData.add(dataArray[2]);
        personalData.add(dataArray[3]);
        personalData.add(dataArray[4]);
        personalData.add(dataArray[5]);
        FileHandler.fileWriter(personalData);
        return personalData;
    }
}
