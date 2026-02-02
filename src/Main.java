public class Main{
    public static void main(String[] args){
        System.out.println("==Simple Calculator==");

        //calculator object
        Calculator calc = new Calculator();

        // calculator variables
        double num1 = 10;
        double num2 = 5;
        System.out.println("value on num1: " + num1);
        System.out.println("value on num2: " + num2);
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





    }
}