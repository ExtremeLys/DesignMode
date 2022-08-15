package pers.adapter.practiceCode;

import java.io.IOException;

/**
 * @author LiYongSheng
 */
public class Main {
    public static void main(String[] args) {
        FileIO fileIO = new FileProperties();
        try {
            fileIO.readFromFile("file.txt");
            fileIO.setValue("year","2022");
            fileIO.setValue("month","08");
            fileIO.setValue("day","04");
            fileIO.writeToFile("newFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
