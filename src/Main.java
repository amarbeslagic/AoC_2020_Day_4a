import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;


public class Main {
    public static void main(String[] args) throws IOException {

        Path fileName = Path.of("inputs//input_AoC_4a.txt");

        String s = Files.readString(fileName);

        String [] listOfStrings = s.split("\n\r");

        int numOfValidPassport = 0;

        boolean byr = false;
        boolean iyr = false;
        boolean eyr = false;
        boolean hgt = false;
        boolean hcl = false;
        boolean ecl = false;
        boolean pid = false;


        for(int i=0; i< listOfStrings.length; i++){
            if(listOfStrings[i].contains("byr")) byr = true;
            if(listOfStrings[i].contains("iyr")) iyr = true;
            if(listOfStrings[i].contains("eyr")) eyr = true;
            if(listOfStrings[i].contains("hgt")) hgt = true;
            if(listOfStrings[i].contains("hcl")) hcl = true;
            if(listOfStrings[i].contains("ecl")) ecl = true;
            if(listOfStrings[i].contains("pid")) pid = true;


            if(byr == true && iyr == true && eyr == true && hgt == true && hcl == true && ecl == true && pid == true) numOfValidPassport++;

            byr = false;
            iyr = false;
            eyr = false;
            hgt = false;
            hcl = false;
            ecl = false;
            pid = false;
        }

        System.out.println(numOfValidPassport);
    }
}