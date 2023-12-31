package pl.sdacademy.unit.test.exercises.day2.exceptions;

public class CalculatorService {
    public static int add(String a, String b) {
        if(a == null || b == null) {
            throw new IllegalArgumentException("Arguments 'a' and 'b' are required.");
        }
        return Math.addExact(Integer.parseInt(a), Integer.parseInt(b));
    }
}
