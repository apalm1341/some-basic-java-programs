// This program deals with nested loops...This program will use nested for loops to print a subtraction table!

public class SubtractionTable {
    /** Main method */
    public static void main(String[] args) {
        // Display the table heading
        System.out.println("            Addition Table");

        // Display the number title
        System.out.print("    "); //creates space before 1 in first horizontal row under table title Addition Table!
        for (int j = 1; j<=9; j++)
            System.out.print("   " + j); //creates space in between every/each number in 1st row of numbers under Addition Table 
            System.out.println("\n-------------------------------------------------------"); // (-)this displays all the dashes under the number title!!! // \n moves all the stuff after it under it to the next line below it!!!

            // Print table body!!!

            for (int i = 1; i <= 9; i ++) {
                System.out.print(i + " | ");
                for (int j = 1; j <= 9; j++) {
                    // Display the product and align properly
                    System.out.printf("%4d", j - i);
                }
                System.out.println();  //moves everything down basically to make everything look like table...1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | <--THIS PRINT CODE MOVES ALL THIS DOWN SO NUMBERS STACKED ON TOP OF EACH OTHER IN VERTICAL LINE/COLUMN!!!SO MAKES WHOLE ROW INTO COLUMN!!!
            }
    }
}