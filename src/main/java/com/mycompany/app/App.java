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

        // Perform the chosen operation
        double result = 0;
        boolean validOperation = true;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
                validOperation = false;
        }

        // Display the result if the operation was valid
        if (validOperation) {
            System.out.println("Result: " + result);
        }
        
        scanner.close();
    }
}

