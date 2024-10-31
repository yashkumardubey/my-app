package com.mycompany.app;

import java.util.Scanner;

/**
 * Simple Calculator
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Calculator!");
        
        // Input: First number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // Input: Operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Input: Second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Perform the chosen operation and display the result
        double result = performOperation(num1, num2, operator);
        
        if (result != Double.NaN) {
            System.out.println("Result: " + result);
        }
        
        scanner.close();
    }

    // Method to perform the calculation
    public static double performOperation(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return Double.NaN; // Return NaN for invalid operation
                }
            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
                return Double.NaN; // Return NaN for invalid operation
        }
    }
}
