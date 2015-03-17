package calculate2;

/**
 *
 * @author Velyana
 */// Lab 2: Calculate2.java
// Perform simple calculations on three integers.
import java.util.Scanner;

public class Calculate2 {

    public static void main(String args[]) {
        String firstNumber;  // first string entered by user
        String secondNumber; // second string entered by user
        String thirdNumber;  // third string entered by user

        int number1; // first number
        int number2; // second number
        int number3; // third number

        int average;  // average of the numbers 
        int largest;  // largest number
        int product;  // product of the numbers
        int smallest; // smallest number
        int sum;      // sum of the numbers

        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);

        System.out.print("Input firstNumber: ");
        firstNumber = input1.next();
        System.out.print("Input secondNumber: ");
        secondNumber = input2.next();
        System.out.print("Input thirdNumber: ");
        thirdNumber = input3.next();

        number1 = Integer.parseInt(firstNumber);
        number2 = Integer.parseInt(secondNumber);
        number3 = Integer.parseInt(thirdNumber);

        // initialize largest and smallest
        largest = number1;
        smallest = number2;

        // determine smallest and largest
        if (number1 < number2) {
            largest = number2;
        }
        if (largest < number3) {
            largest = number3;
        }
        if (number3 < number2) {
            smallest = number3;
        }
        if (number1 < smallest) {
            smallest = number1;
        }

        // perform calculations
        sum = number1 + number2 + number3;
        // calculate product
        product = number1 * number2 * number3;
        //calculate average
        average = sum / 3;

        // create result string
        String result;

        result = "number1: " + Integer.toString(number1) + "\nnumber2: " + Integer.toString(number2)
                + "\nnumber2: " + Integer.toString(number3) + "\nlargest: " + Integer.toString(largest)
                + "\nsmallest: " + Integer.toString(smallest) + "\nsum: " + Integer.toString(sum)
                + "\nproduct: " + Integer.toString(product) + "\naverage: " + average;
        // Write a statement to output results
        System.out.println(result);
    }

} // end class Calculate2
