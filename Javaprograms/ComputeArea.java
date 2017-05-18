//The import statement simply tells the compiler where to locate the classes.
import javax.swing.JOptionPane; //JOptionPane is imported to the program using import statement so that the compiler can locate the class without the full name javax.swing.JOptionPane!
//JOptionPane is one of the many predefined classes in the Java system that you can reuse rather than "reinventing the wheel"!
//Java's predefined classes are grouped into packages... JOptionPane is in the javax.swing package!
import java.util.Scanner; // Scanner class is in the java.util package 


public class ComputeArea {
    public static void main(String[] args) {
        double radius;  // Declare radius!
        double area;    //Declare area!

        // Assign a radius!
        radius = 20;    //New value is radius

        // Compute area!
        area = radius * radius * 3.14159;

        //Display results
        System.out.println("The area for the circle of radius " + radius + " is " + area);
        JOptionPane.showMessageDialog(null, "That was fun! Now it will be your turn to give it a shot!"); //showMessageDialog method in JOptionPlane class....this method you can use to display any text in a message dialog box!

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius2 = input.nextDouble();

        //Compute area
        double area2 = radius2 * radius2 * 3.14159;

        //Display result
        System.out.println("The area for the circle of radius: " + radius2 + " is " + area2);

        JOptionPane.showMessageDialog(null, "Good effort!");




    }





}