import javax.swing.JOptionPane;

public class InputDialog {
    public static void main(String[] args) {
        //Enter how many minutes you want converted into seconds..showInputDialog method displays an input dialog.
        String minutesString = JOptionPane.showInputDialog("Enter how many minutes you want converted into seconds!:");

        //Convert string to double
        double minutes = Double.parseDouble(minutesString);

        //Convert minutes to seconds
        double seconds = minutes * 60;

        //Display results
        String output = "The amount of seconds is: " + seconds;
        //brings up dialog/display message box!
        JOptionPane.showMessageDialog(null, output);

    }
}