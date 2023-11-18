package pl.sdacademy.unit.test.exercises.day2.parametrized.methodsource;

public class Fibonacci {

    public static int getValueFromIndex(int index) {
        if(index == 0 || index == 1) {
            return index;
        }
        return getValueFromIndex(index - 1) + getValueFromIndex(index - 2);
    }
}