import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Simple Calculator ===");

        // Create Scanner
        Scanner scanner = new Scanner(System.in);

        // Get numbers from user
        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();

        // Ask user which operation they want
        System.out.println();
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        System.out.println();

        // Create calculator
        Calculator calc = new Calculator();

        // Perform chosen operation
        double result = 0;

        if (choice == 1) {
            result = calc.addition(number1, number2);
            System.out.println("Result: " + number1 + " + " + number2 + " = " + result);
        } else if (choice == 2) {
            result = calc.subtraction(number1, number2);
            System.out.println("Result: " + number1 + " - " + number2 + " = " + result);
        } else if (choice == 3) {
            result = calc.multiplication(number1, number2);
            System.out.println("Result: " + number1 + " * " + number2 + " = " + result);
        } else if (choice == 4) {
            result = calc.division(number1, number2);
            System.out.println("Result: " + number1 + " / " + number2 + " = " + result);
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}