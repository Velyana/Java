/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Velyana
 */
public class TestTest {

    private static ObjectOutputStream output;

    //"E:\\Компютърни науки\\III курс\\Java\\Exercises\\Test\\grades.txt")
    public static void openFile() {
        try {
            output = new ObjectOutputStream(new FileOutputStream("grades.ser"));
            OutputStream buffer = new BufferedOutputStream(output);
            ObjectOutputStream out = new ObjectOutputStream(buffer);
        } catch (IOException ioException) {
            System.err.println("Error opening file.");
        }
    }

    public static void addToFile() {
        Test t;
        int[] grades = null;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Input grades: ");
        int i = 0;
        while (input.hasNext()) {
            try {
                grades[i] = input.nextInt();
                i++;
                t = new Test(grades);
                output.writeObject(t);
            } catch (IOException ioException) {
                System.err.println("Error writing to file.");
                return;
            }
        }
    }

    public static void closeFile() {
        try {
            if (output != null) {
                output.close();
            }
        } catch (IOException ioException) {
            System.err.println("Error closing file.");
            System.exit(1);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        //array of Test objects
//        int[] arr = new int[]{2, 3, 4, 5, 6};
//        Test t = new Test(arr);
//
//        Formatter output = null;
//        try {
//            output = new Formatter("grades.txt");
//        } catch (FileNotFoundException fileNotFoundException) {
//            System.err.println("Error creating file.");
//            System.exit(1);
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            output.format("%d\t", t.getGrades()[i]);
//        }
//        if (output != null) {
//            output.close();
//        }

        
        openFile();
        addToFile();
        closeFile();
    }

}
