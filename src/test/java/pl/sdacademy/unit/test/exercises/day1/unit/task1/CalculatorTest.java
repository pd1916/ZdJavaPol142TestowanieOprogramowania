package pl.sdacademy.unit.test.exercises.day1.unit.task1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    //private Calculator calculator;
    private static Calculator calculator;

//    @BeforeEach
//    void init() {
//        calculator = new Calculator();
//    }

    @BeforeAll
    static void init() {
        calculator = new Calculator();
    }

    @Test
    void shouldDivideTwoValues() {
        //given
        float expectedResult = 3;
        //when
        float result = calculator.divide(6, 2);
        //then
        assertEquals(expectedResult, result); //jUnit5
        assertThat(result).isEqualTo(expectedResult); // assertJ
    }

    @Test
    void shouldAddTwoValues() {
        //when
        int result = calculator.add(1, 2);
        //then
        assertEquals(3, result);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void shouldSubtractTwoValues() {
        //when
        int result = calculator.subtract(1, 2);
        //then
        assertEquals(-1, result);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void shouldMultiplyTwoValues() {
        //when
        int result = calculator.multiply(2, 3);
        //then
        assertEquals(6, result);
        assertThat(result).isEqualTo(6);
    }

}