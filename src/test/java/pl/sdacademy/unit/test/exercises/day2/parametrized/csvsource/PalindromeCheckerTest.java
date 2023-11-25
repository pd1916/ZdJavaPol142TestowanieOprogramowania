package pl.sdacademy.unit.test.exercises.day2.parametrized.csvsource;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {
    /*
    true:
    kajak
    sedes
    potop
    kobyla ma maly bok

    false:
    java
    programowanie
     */

    @ParameterizedTest
    @CsvSource({"kajak, true",
                "sedes, true",
                "potop, true",
                "kobyla ma maly bok, true",
                "'kobyla ma, maly bok', false",
                "java, false",
                "programowanie, false"})
    void shouldVerifyIfStringIsPalindrome(String input, boolean expectedResult) {
        //when
        boolean result = PalindromeChecker.isPalindrome(input);
        //then
        assertEquals(expectedResult, result); //jUnit
        assertThat(result).isEqualTo(expectedResult); //assertJ
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/palindrome.csv")
    void shouldVerifyIfStringIsPalindromeUsingFile(String input, boolean expectedResult) {
        //when
        boolean result = PalindromeChecker.isPalindrome(input);
        //then
        assertEquals(expectedResult, result); //jUnit
        assertThat(result).isEqualTo(expectedResult); //assertJ
    }

    @ParameterizedTest
    @CsvFileSource(
            resources = "/palindrome2.csv",
            delimiter = ';',
            lineSeparator = "|",
            numLinesToSkip = 1
    )
    void shouldVerifyIfStringIsPalindromeUsingStrangeFile(String input, boolean expectedResult) {
        //when
        boolean result = PalindromeChecker.isPalindrome(input);
        //then
        assertEquals(expectedResult, result); //jUnit
        assertThat(result).isEqualTo(expectedResult); //assertJ
    }

    @ParameterizedTest
    @CsvSource({
            "Kowalski, 25, false",
            "Nowak, 7, true"
    })
    void test1(String name, int age, boolean expectedResult) {
        //given
        PersonNew person = new PersonNew(name, age);
        //when
        boolean result = PalindromeChecker.isChild(person);
        //then
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @MethodSource("dataProviderForPerson")
    void test1(PersonNew person, boolean expectedResult) {
        //when
        boolean result = PalindromeChecker.isChild(person);
        //then
        assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> dataProviderForPerson() {
        return Stream.of(
          Arguments.of(new PersonNew("Nowak", 8), true),
          Arguments.of(new PersonNew("Kowalski", 20), false),
          Arguments.of(null, false)
        );
    }

}