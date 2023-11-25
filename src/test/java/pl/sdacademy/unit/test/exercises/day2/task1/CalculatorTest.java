package pl.sdacademy.unit.test.exercises.day2.task1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.lang.Math.round;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    /*
    6,3,2
    12,2,6
    0,5,0

    8,0,wyjątek
     */

    @ParameterizedTest
    @MethodSource("dataProviderForDivide")
    void shouldReturnCorrectValueForDivideMethod(double firstDigit, double secondDigit, double expectedResult) {
        //when
        double result = Calculator.divide(firstDigit, secondDigit);
        //then
        //assertEquals(expectedResult, result); //jUnit
        //assertThat(result).isEqualTo(expectedResult); //assertJ
        assertThat(result).isCloseTo(expectedResult, within(0.01)); // 3.32-3.34
    }

    @Test
    void shouldThrowExceptionWhenSecondDigitIsZero() {
        //when & then
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(8, 0)); //jUnit

        //assertJ
        assertThatThrownBy(() -> Calculator.divide(8, 0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Can't divide by 0!");
    }


    private static Stream<Arguments> dataProviderForDivide() {
        return Stream.of(
                Arguments.of(6, 3, 2),
                Arguments.of(12, 2, 6),
                Arguments.of(0, 5, 0),
                Arguments.of(10.5, 2, 5.25),
                Arguments.of(10, 3, 3.33)
        );
    }

}