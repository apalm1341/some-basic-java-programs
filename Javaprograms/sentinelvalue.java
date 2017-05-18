// This program will read and calculate the product of an unspecified number of integers. (all/any of the integers that the user types in except if 0!!!)

import java.util.Scanner;

public class sentinelvalue {
    /** Main method */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Read an initial data
        System.out.print("Enter an int value (the program exits if the input is 0): "); //int = whole number..
        int data = input.nextInt();

        // Keep reading data until the input is 0
        int product = 1;
        while (data != 0) {
            product *= data; // product = product * data 

            // Read the next data
            System.out.print("Enter an int value (the program exits if the input is 0): ");
            data = input.nextInt();
        }

        System.out.println("The product is " + product);
    }
}