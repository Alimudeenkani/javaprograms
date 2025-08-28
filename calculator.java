package javaclass;

import java.util.Scanner;
public class calculator {
	

	    // Method for Addition
	    public static int add(int a, int b) {
	        return a + b; // returns sum of a and b
	    }

	    // Method for Subtraction
	    public static int subtract(int a, int b) {
	        return a - b; // returns difference of a and b
	    }

	    // Method for Multiplication
	    public static int multiply(int a, int b) {
	        return a * b; // returns product of a and b
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Step 1: Take input from the user
	        System.out.print("Enter first number: ");
	        int num1 = sc.nextInt();  // read first number

	        System.out.print("Enter second number: ");
	        int num2 = sc.nextInt();  // read second number

	        // Step 2: Display menu of operations
	        System.out.println("\nChoose Operation:");
	        System.out.println("1. Addition (+)");
	        System.out.println("2. Subtraction (-)");
	        System.out.println("3. Multiplication (*)");
	        System.out.print("Enter choice (1-3): ");
	        int choice = sc.nextInt(); // user selects an option

	        // Step 3: Perform the operation using switch-case
	        switch (choice) {
	            case 1: // If user entered 1
	                System.out.println("Result: " + add(num1, num2));
	                break;
	            case 2: // If user entered 2
	                System.out.println("Result: " + subtract(num1, num2));
	                break;
	            case 3: // If user entered 3
	                System.out.println("Result: " + multiply(num1, num2));
	                break;
	            default: // If input is not 1–3
	                System.out.println("Invalid choice!");
	        }

	        sc.close(); // close scanner
	    
	}


