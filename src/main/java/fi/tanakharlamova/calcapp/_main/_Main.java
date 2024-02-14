package fi.tanakharlamova.calcapp._main;

import fi.tanakharlamova.calcapp.service.ResultWriterService;
import fi.tanakharlamova.calcapp.util.Calculator;

public class _Main {
    public static void main(String[] args){
        System.out.println(ResultWriterService.printResult(11, 7, Calculator.calculateSum(11,7), Calculator.getNameSum()));
        System.out.println(ResultWriterService.printResult(12, 2, Calculator.calculateDifference(12,2), Calculator.getNameDiff()));
        System.out.println(ResultWriterService.printResult(10, 3, Calculator.calculateMultiplication(10,3), Calculator.getNameMultiplication()));
    }


}
