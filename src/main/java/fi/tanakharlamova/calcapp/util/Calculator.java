package fi.tanakharlamova.calcapp.util;

public class Calculator {



    public static int calculateSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static String getNameSum(){
        return "Sum";
    }
    public static int calculateDifference(int num1, int num2){
        int difference = num1 - num2;
        return difference;
    }
    public static String getNameDiff(){
        return "Difference";
    }

    public static int calculateMultiplication(int num1, int num2){
        int multiplication = num1 * num2;
        return multiplication;
    }
    public static String getNameMultiplication(){
        return "Multiplication";
    }
}
