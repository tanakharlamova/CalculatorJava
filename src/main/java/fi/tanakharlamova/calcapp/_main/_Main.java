package fi.tanakharlamova.calcapp._main;

import fi.tanakharlamova.calcapp.service.ResultWriterService;
import fi.tanakharlamova.calcapp.util.Calculator;

public class _Main {

    public static String getNameSum(){
        return "Sum";
    }

    public static String getNameDiff(){
        return "Difference";
    }

    public static String getNameMultiplication(){
        return "Multiplication";
    }

    public static void main(String[] args){
       ResultWriterService.printResult(10, 6, Calculator.calculateSum(10,6), getNameSum());
        ResultWriterService.printResult(10, 6, Calculator.calculateDifference(10,6), getNameDiff());
        ResultWriterService.printResult(10, 6, Calculator.calculateMultiplication(10,6), getNameMultiplication());
    }
}
