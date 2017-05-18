// This program will read and calculate the total division of an unspecified number of integers. (all/any of the integers that the user types in except if 0!!!..this way, the user can exit the program this way if they choose to be done with it and to also get their total divided up number! in order to see the end result of what all the integers they typed in would be)

import java.util.Scanner;

public class sentinelvalue2 {
    /** Main method */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Read an initial data
        System.out.print("Enter an int value (the program exits if the input is 0): "); //int = whole number..
        int data1 = input.nextInt();
        

        // Keep reading data until the input is 0
        int totaldivision = data1;
        //int data2;
       // System.out.print("Enter an int value (the program exits if the input is 0): ");
        //int data2 = input.nextInt();
        while (data1 != 0) {
            //int data2;
            System.out.print("Enter an int value (the program exits if the input is 0): ");
            int data2 = input.nextInt();
            while (data2 != 0) {
            totaldivision /= data2; // totaldivision = totaldivision / data 
            System.out.print("Enter an int value (the program exits if the input is 0): ");
             input.nextInt();
             if (data2 == 0) {
                //break;
                return;

             }
            }

            // Read the next data
           // System.out.print("Enter an int value (the program exits if the input is 0): ");
            //data2 = input.nextInt();
        }

        System.out.println("The total division of all the numbers is " + totaldivision);
    }
}