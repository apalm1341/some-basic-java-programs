/* This application program displays Welcome to Java!
 * in a message dialog box!
 */ 
//The import statement simply tells the compiler where to locate the classes.
import javax.swing.JOptionPane; //JOptionPane is imported to the program using import statement so that the compiler can locate the class without the full name javax.swing.JOptionPane!
//JOptionPane is one of the many predefined classes in the Java system that you can reuse rather than "reinventing the wheel"!
//Java's predefined classes are grouped into packages... JOptionPane is in the javax.swing package!

public class WelcomeInMessageDialogBox {
	public static void main(String[] args) {
	//Display Welcome to Java! in a message dialog box
	JOptionPane.showMessageDialog(null, "Hey there user!");	//showMessageDialog method in JOptionPlane class....this method you can use to display any text in a message dialog box!
	JOptionPane.showMessageDialog(null, "Hope you are doing awesome today!");
	}
}