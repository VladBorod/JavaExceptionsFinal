import Exceptions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Examinations {
//    arr length test
    public static void arrayLengthExamination(String[] dataArray){
        if (dataArray.length != 6){
            throw new InputArraySizeException();
        }
    }
    public static void nameExamination(String name) {
        if (!(name != null && name.chars().allMatch(Character::isLetter))) {
            throw new IncorrectNameFormatException();
        }
    }
    public static void surnameExamination(String surname) {
        if (!(surname != null && surname.chars().allMatch(Character::isLetter))) {
            throw new IncorrectNameFormatException();
        }
    }
    public static void patronymicExamination(String patronymic) {
        if (!(patronymic != null && patronymic.chars().allMatch(Character::isLetter))) {
            throw new IncorrectNameFormatException();
        }
    }
//     birthdate exam
    public static Date birthDateExamination(String birthDate){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.mm.yyy");
        Date parsedBirthDate;
        try {
            parsedBirthDate = dateFormat.parse(birthDate);
        } catch (NumberFormatException | ParseException e){
            throw new DateFormatException();
        }
        String[] dateTest = birthDate.split("\\.");
        String day = dateTest[0];
        String month = dateTest[1];
        String year = dateTest[2];
        int dayNum;
        int monthNum;
        int yearNum;
        try{
            dayNum = Integer.parseInt(day);
            if (dayNum < 1 || dayNum > 31){
                throw new DateDaysException();
            }
            monthNum = Integer.parseInt(month);
            if (monthNum < 1 || monthNum > 12){
                throw new DateMonthException();
            }
            yearNum = Integer.parseInt(year);
            if (yearNum < 1873 || yearNum > 2023){
                throw new DateYearException();
            }
        } catch (NumberFormatException | DateDaysException | DateMonthException | DateYearException e){
            throw new DateFormatException();
        }
        return parsedBirthDate;
    }
//    phone exam
    public static Integer phoneNumberExamination(String phoneNumber){
        int parsedPhoneNumber;
        try{
            parsedPhoneNumber = Integer.parseInt(phoneNumber);
            if (phoneNumber.length() < 5 || phoneNumber.length() > 11){
                throw new PhoneNumberException();
            }
        } catch (NumberFormatException e){
            throw new PhoneNumberException();
        }
        return parsedPhoneNumber;
    }
    public static void genderExamination(String gender){
        String[] genders = {"m", "f", "м", "ж", "M", "F", "М", "Ж"};

        boolean found = Arrays.asList(genders).contains(gender);
        if (!found){
            throw new GenderFailureException();
        }


    }
}
