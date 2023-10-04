import Exceptions.FileSysException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileHandler {
    public static String fileWriter(List<String> personalData) throws FileSysException {
        String fileName = "PersonalData\\" + personalData.get(1).toLowerCase() + ".txt";
        File file = new File(fileName);
        try (FileWriter fw = new FileWriter(file, true)) {
            if (file.length() > 0) {
                fw.write("\n");
            }
            fw.write(String.format("%s %s %s %s %s %s", personalData.get(0),
                    personalData.get(1),
                    personalData.get(2),
                    personalData.get(3),
                    personalData.get(4),
                    personalData.get(5)));
        } catch (IOException e){
            throw new FileSysException();
        }


        return "Person was added to file!";
//        return fileName;
    }
}
