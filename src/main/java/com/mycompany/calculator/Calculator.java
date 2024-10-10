/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;
import javax.swing.*;
/**
 *
 * @author RC_Student_lab
 */
public class Calculator {
    
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    
    public int divide(int num1, int num2) {
        return num1 / num2; 
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int num1, num2;
        String input;
        
        input = JOptionPane.showInputDialog("Enter the first number:");
        num1 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Enter the second number:");
        num2 = Integer.parseInt(input);

        int option;

        do {
            
            String menu = "Choose an operation:\n" +
                          "1. Add\n" +
                          "2. Subtract\n" +
                          "3. Multiply\n" +
                          "4. Divide\n" +
                          "0. Exit";

            input = JOptionPane.showInputDialog(menu);
            option = Integer.parseInt(input);

            int result = 0;

            switch (option) {
                case 1:
                    result = calculator.add(num1, num2);
                    JOptionPane.showMessageDialog(null, "Result: " + result);
                    break;
                case 2:
                    result = calculator.subtract(num1, num2);
                    JOptionPane.showMessageDialog(null, "Result: " + result);
                    break;
                case 3:
                    result = calculator.multiply(num1, num2);
                    JOptionPane.showMessageDialog(null, "Result: " + result);
                    break;
                case 4:
                    switch (Integer.compare(num2, 0)) {
                        case 0:
                            JOptionPane.showMessageDialog(null, "Error: Division by zero is not allowed.");
                            break;
                        default:
                            result = calculator.divide(num1, num2);
                            JOptionPane.showMessageDialog(null, "Result: " + result);
                    }
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Exiting...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option. Please try again.");
                    break;
            }

        } while (option != 0);
    }
}


    
        
    



