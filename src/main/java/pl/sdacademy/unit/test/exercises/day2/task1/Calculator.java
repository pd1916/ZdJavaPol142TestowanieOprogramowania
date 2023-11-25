package pl.sdacademy.unit.test.exercises.day2.task1;

public class Calculator {
    public static double divide(double firstDigit, double secondDigit) {
        if(secondDigit == 0) {
            throw new IllegalArgumentException("Can't divide by 0!");
        }
        return firstDigit / secondDigit;
    }
}