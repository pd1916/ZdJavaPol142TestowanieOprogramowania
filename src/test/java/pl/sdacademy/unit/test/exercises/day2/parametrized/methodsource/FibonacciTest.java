package pl.sdacademy.unit.test.exercises.day2.parametrized.methodsource;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pl.sdacademy.unit.test.exercises.day2.parametrized.csvsource.PersonNew;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    /*
    input, expectedResult
    0, 0
    1, 1
    4, 3
    6, 8
    8, 21
     */

    @ParameterizedTest
    @MethodSource("dataProvider")
    void shouldReturnCorrectValue(int input, int expectedResult) {
        //when
        int result = Fibonacci.getValueFromIndex(input);
        //then
        assertEquals(expectedResult, result); //jUnit
        assertThat(result).isEqualTo(expectedResult); //assertJ
    }

    private static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(1, 1),
                Arguments.of(4, 3),
                Arguments.of(6, 8),
                Arguments.of(8, 21)
        );
    }

    @ParameterizedTest
    //@MethodSource("pelnaSciezkaDoKlasy + nazwaKlasy + # + nazwaMetody")
    @MethodSource("pl.sdacademy.unit.test.exercises.day2.parametrized.methodsource.dataprovider.FibonacciDataProvider#dataProvider2")
    void shouldReturnCorrectValueWithSourceAsExternalClass(int input, int expectedResult) {
        //when
        int result = Fibonacci.getValueFromIndex(input);
        //then
        assertEquals(expectedResult, result); //jUnit
        assertThat(result).isEqualTo(expectedResult); //assertJ
    }
}