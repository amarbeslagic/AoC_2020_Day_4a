import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;


public class Main {
    public static void main(String[] args) throws IOException {

        Path fileName = Path.of("inputs//input_AoC_4a.txt");

        String s = Files.readString(fileName);

        String [] listOfStrings = s.split("\n\r");




        for (String st : listOfStrings) {
            System.out.println(st);
            System.out.println("---------");
        }

        System.out.println(listOfStrings.length);
       // System.out.println(s);
    }
}