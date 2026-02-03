public class Calculator {

    //methods to be used to  calculate addition
    public double addition (double num1, double num2){
        return num1 + num2;
    }

    //methods to be used to  calculate subtraction
    public double subtraction (double num1, double num2) {
        return num1 - num2;
    }

    //methods to be used to  calculate multiplication
    public double multiplication (double num1, double num2) {
        return num1 * num2;
    }

    //methods to be used to  calculate division
    public double division (double num1, double num2) {
        if(num2==0){
            System.out.println("cannot divide by zero");
        }
        return num1 / num2;
    }


}
