package com.pluralsight;
import java.util.*;

public class BasicCalculator {
    public static void main (String[] args){

        // Declare variables and inputs with Scanner
        
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        double number1 = myScanner.nextDouble();

        System.out.print("Enter you second number: ");
        double number2 =  myScanner.nextDouble();
        myScanner.nextLine();


        // Declaring possible outcomes

        System.out.print("Possible calculations:\n(A)dd \n(S)ubtract \n(M)ultiply \n(D)ivide \nPlease select an option: ");
        String calc = myScanner.nextLine();

        //Possible Calculation Options Using If

        if (calc.equalsIgnoreCase(("Add")) || calc.equalsIgnoreCase(("A"))) {
            System.out.println(number1 + number2);
        } else if (calc.equalsIgnoreCase(("Subtract")) || calc.equalsIgnoreCase(("S"))) {
            System.out.println(number1 - number2);
        } else if (calc.equalsIgnoreCase(("Multiply")) || calc.equalsIgnoreCase(("M"))) {
            System.out.println(number1 * number2);
        } else if (calc.equalsIgnoreCase(("Divide")) || calc.equalsIgnoreCase(("D"))) {
            System.out.println(number1 / number2);
        } else {
            System.out.println("Please choose one of the 4 calculations: (A)dd, (S)ubtract, (M)ultiply, (D)ivide");
        }
    }
}
