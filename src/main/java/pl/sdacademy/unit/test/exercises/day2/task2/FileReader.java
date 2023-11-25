package pl.sdacademy.unit.test.exercises.day2.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static int counterCharacters(File file) {
        validate(file);
        //logika
        int counter = 0;
        try(Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextLine()) {
                counter += scanner.nextLine().length();
            }
        } catch(FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return counter;
    }

    private static void validate(File file) {
        if(file != null && file.exists()) {
            String fileName = file.getName();
            if(!fileName.matches("(.)+.csv")) {
                throw new IllegalArgumentException("wrong extension");
            }
        } else {
            throw new IllegalArgumentException("file not found");
        }
    }
}