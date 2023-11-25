package pl.sdacademy.unit.test.exercises.day2.parametrized.csvsource;

import pl.sdacademy.unit.test.exercises.day1.unit.task4.Person;

public class PalindromeChecker {
    static boolean isPalindrome(String inputString) {
        String inputWithoutSpaces = inputString.replace(" ", "");
        StringBuilder sbAfterReverse = new StringBuilder(inputWithoutSpaces).reverse();
        String stringAfterReverse = sbAfterReverse.toString();
        return stringAfterReverse.equalsIgnoreCase(inputWithoutSpaces);
    }

    static boolean isChild(PersonNew person) {
        return person.getAge() >= 0 && person.getAge() <= 18;
    }
}