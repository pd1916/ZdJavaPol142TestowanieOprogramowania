package pl.sdacademy.unit.test.exercises.day1.tdd.task1;

public class Fibonacci {

    public int getValueFromIndex(int index) {
        if(index == 0 || index == 1) {
            return index;
        }
        return getValueFromIndex(index - 1) + getValueFromIndex(index - 2);
    }
}