package five;

import java.util.Scanner;

// Lab 3: Five.java
// Program breaks apart a five-digit number
public class Five {

    public static void main(String args[]) {
        int originalNumber;
        int number;
        String inputString;

        // read five-digit number from standard input and store in var originalNumber
        Scanner input = new Scanner(System.in);
        System.out.print("Input originalNumber: ");
        originalNumber = input.nextInt();

        // determine the 5 digits
        int digit1; // first digit of number
        int digit2; // second digit of number
        int digit3; // third digit of number
        int digit4; // fourth digit of number 
        int digit5; // fifth digit of number

        digit1 = originalNumber / 10000; // get leftmost digit
        number = originalNumber % 10000; // get rightmost four digits

        digit2 = number / 1000;
        number %= 1000;
        digit3 = number / 100;
        number %= 100;
        digit4 = number / 10;
        number %= 10;
        digit5 = number;

        // create the result string
        String resultString;
        resultString = "digit1:" + digit1
                + "   digit2:" + digit2
                + "   digit3:" + digit3
                + "   digit4:" + digit4
                + "   digit5:" + digit5;
        // output  results on standard output
        System.out.println(resultString);

    }
} // end class Five

