package pl.sdacademy.unit.test.exercises.day2.parametrized.csvsource;

public class PalindromeChecker {
    static boolean isPalindrome(String inputString) {
        String inputWithoutSpaces = inputString.replace(" ", "");
        StringBuilder sbAfterReverse = new StringBuilder(inputWithoutSpaces).reverse();
        String stringAfterReverse = sbAfterReverse.toString();
        return stringAfterReverse.equalsIgnoreCase(inputWithoutSpaces);
    }
}