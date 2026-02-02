import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("==Simple Calculator==");

        //create a scanner object
        Scanner scanner = new Scanner(System.in);

        //enter the first number
        System.out.println("Enter your first number: ");
        double num1 = scanner.nextInt();

        //enter your second number
        System.out.println("Enter your next number: ");
        double num2 = scanner.nextInt();

        System.out.println("You entered: "+ num1 + "and"+ num2);

        //calculator object
        Calculator calc = new Calculator();
        System.out.println();


        //addition
        double sum = calc.addition(num1 , num2);
        System.out.println("Addition: " + num1 + " + " + num2  +" = " + sum);

        //Subtraction
        double difference = calc.subtraction(num1,num1);
        System.out.println("Subtraction: " + num1 + "-" + num2 + "=" + difference);

        //Multiplication
        double product = calc.multiplication(num1,num2);
        System.out.println("Multiplication: " + num1 + "*" + num2 + "=" + product);

        //Division
        double division = calc.division(num1,num2) ;
        System.out.println("Multiplication: " + num1 + "/" + num2 + "=" + division);

        scanner.close();





    }
}