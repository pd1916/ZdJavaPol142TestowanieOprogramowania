package pl.sdacademy.unit.test.exercises.day2.exceptions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorServiceTest {

    /*
    a, b
    null, "123"
    "456", null
    null, null
     */

    @ParameterizedTest
    @MethodSource("dataProviderForExceptions")
    void shouldThrowExceptionWhenAnyOfArgumentIsNull(String a, String b) {
        //when & then

        // jUnit
        IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> CalculatorService.add(a, b), "test message");
        assertEquals("Arguments 'a' and 'b' are required.", result.getMessage());

        //assertJ
        assertThatThrownBy(() -> CalculatorService.add(a, b))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Arguments 'a' and 'b' are required.");
    }

    private static Stream<Arguments> dataProviderForExceptions() {
        return Stream.of(
                Arguments.of(null, "123"),
                Arguments.of("456", null),
                Arguments.of(null, null),
                Arguments.of("abc", "def")
        );
    }

}