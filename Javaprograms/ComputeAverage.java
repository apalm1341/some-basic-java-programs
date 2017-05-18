import java.util.Scanner; // Scanner is in the java.util package...imports the Scanner class 

import javax.swing.JOptionPane; //JOptionPane is imported to the program using import statement so that the compiler can locate the class without the full name javax.swing.JOptionPane!
//JOptionPane is one of the many predefined classes in the Java system that you can reuse rather than "reinventing the wheel"!
//Java's predefined classes are grouped into packages... JOptionPane is in the javax.swing package!

public class ComputeAverage {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter three numbers
        JOptionPane.showMessageDialog(null, "Hey user! This program you are about to use/run will compute the average and display the result based off of 3 numbers you will input to the console!");
        System.out.print("Enter three numbers: ");
        JOptionPane.showMessageDialog(null, "Hey user! You may enter three numbers separated by spaces, then press the Enter key, or enter each number followed by a press of the Enter key!"); //showMessageDialog method in JOptionPlane class....this method you can use to display any text in a message dialog box!

        double number1 = input.nextDouble(); //double = indicated variable names are double-precision floating-point values stored in the computer!
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        //Compute average
        double average = (number1 + number2 + number3) / 3;

        //Display result
        System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);
    }
}






/*apalm1341 - Today at 8:22 PM
hey all
can someone plz explain double-precision floating-point values ?
in java coding
EKW - Today at 8:22 PM
hia
Ginger | Static - Today at 8:23 PM
basically just floats but with more precision
apalm1341 - Today at 8:23 PM
what does it do?
EKW - Today at 8:23 PM
Do you know what a normal floating point does?
apalm1341 - Today at 8:23 PM
not really
I know floats are decimal values right?(edited)
normal floating point?
can u give me some examples?
EKW - Today at 8:24 PM
yea, normal floating points are allowed to have fractional parts
which is a fancy way of saying they don't have to be integers
Ginger | Static - Today at 8:25 PM
Floating point numbers can have decimal values, like 127.01
Integers can only have integer values, like 127
EKW - Today at 8:26 PM
But you can't actually store EXACT values in floating points because they have a finite amount of space to store all their information
a double precision floating point just has double the space to store the information, meaning the values it can store are closer to the values you want
...I'm not explaining it very well
apalm1341 - Today at 8:29 PM
ok
I kinda see now
can u give me examples of instances where u use double and why?
NEW MESSAGES
EKW - Today at 8:30 PM
think of it like this: floats store numbers in scientific notation
for example, "0.2" is stored in the computer as: 2 * 10 ^ -1
the bold numbers are the ones that the computer stores
but because the computer is storing integers, and there's a maximum value that integers of a certain size can represent, normal floats can't represent ALL numbers
Double precision floats can't either, but they can represent a shitton more values than normal floats
anyway, to answer your question:
I use doubles when I need suuuper precisise non-integer values
...tbh, I use doubles all the time. Floats are for losers.(edited)

apalm1341 - Today at 8:36 PM
ok
I understand what u r saying
for the most part I think
I think technically you meant to say that the 2 and -1 bold values are only stores in your example you gave
EKW - Today at 8:37 PM
that's what I said
apalm1341 - Today at 8:37 PM
u made it sound like 2 *10^-1 all is stored
"0.2" is stored in the computer as: 2 * 10 ^ -1
EKW - Today at 8:37 PM
because floating points aren't perfectly precise, some... really strange rounding errors occur, which leads to 0.1 + 0.2 not being exactly 0.3
I bolded the 2 and the -1, I thought?
apalm1341 - Today at 8:39 PM
ok
I think I see
what would be an example of something like this written out in code ?
with using double versus normal floating points
?
EKW - Today at 8:40 PM
that sounds like a homework question
Fox - Today at 8:40 PM
http://vrtkl.no/blog/wp-content/uploads/2016/
apalm1341 - Today at 8:40 PM
are you talking about values being returned in console?
values user inputs?
Fox - Today at 8:41 PM
It is a very simple case of how those numbers are actually stored in memory
EKW - Today at 8:41 PM
fox, what's that link for?
Fox - Today at 8:41 PM
Strange it didn't copy right
apalm1341 - Today at 8:43 PM
?
ya I don't know what that is lol
EKW - Today at 8:45 PM
apalm, I'm talking about values in general
no matter where they are
i'm not sure I understand the question
apalm1341 - Today at 8:45 PM
no srry
I meant fox's pic
what did u mean to send fox?
Fox - Today at 8:48 PM
hm I Can't find it, I was on mobile
http://docs.oracle.com/cd/E19957-01/806-3568/ncg_goldberg.html Read this if you're just trying to explain the concept to yourself
apalm1341 - Today at 8:49 PM
holy moly
that is deep



*/
