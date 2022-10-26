package CodeBookM12;

import javax.swing.*;

public class Suma {
    public static void main(String[] args) {



        String firstnumber= JOptionPane.showInputDialog("Enter the first integer:");
        String secondnumber = JOptionPane.showInputDialog("Enter the second integer:");

        int number1=Integer.parseInt(firstnumber);
        int number2=Integer.parseInt(secondnumber);

        int addition= number1+number2;

        JOptionPane.showMessageDialog(null, "result of the sum is "+addition);



    }
}
