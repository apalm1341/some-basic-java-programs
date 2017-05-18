//This is a simple (GUI) Confirmation Dialog Box program!

import javax.swing.JOptionPane;

public class confirmbox {
    public static void main(String[] args) {
        int option1 = JOptionPane.showConfirmDialog(null, "Hello! This is my first program I made that uses GUI confirmation dialogs to display messages to users running/using this program! but also will allow you to answer the program questions! Do you wish to Continue???");
        //int option2;

        if (option1 == JOptionPane.YES_OPTION) {//if user clicks Yes, print message below with good job....etc
         int option2 = JOptionPane.showConfirmDialog(null, "Good Job! You chose to continue! Did you have a good day?");
            //int option2;
            if (option2 == JOptionPane.YES_OPTION)
            JOptionPane.showConfirmDialog(null, "AWESOME!");

            if (option2 == JOptionPane.NO_OPTION)
            JOptionPane.showConfirmDialog(null, "I am very sorry to hear that :()");

         
        }

        
         if (option1 == JOptionPane.NO_OPTION) //if user clicks No, print message below with....etc
         JOptionPane.showConfirmDialog(null, "OK! sorry you chose to stop the program! Goodbye!");
         

        // int option2 = JOptionPane.showConfirmDialog(null, "Hello! This is my first program I made that uses GUI confirmation dialogs to display messages to users running/using this program! but also will allow you to answer the program questions! Do you wish to Continue???");
         
         //if (option2 == JOptionPane.YES_OPTION) 
        // JOptionPane.showConfirmDialog(null, "Good Job! You chose to continue! Did you have a good day?");

         //if (option2 == JOptionPane.NO_OPTION) 
         //JOptionPane.showConfirmDialog(null, "Good Job! You chose to continue! Did you have a good day?");
        
        }
    }
