package it.canTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExc {

    public static void main(String[] args) {
        
    }

    public static void readFile(String path)  {
        try {
            FileReader file = new FileReader(path);
        } catch (FileNotFoundException e) {
            System.out.println("Ojoj");
        }
    }

}
