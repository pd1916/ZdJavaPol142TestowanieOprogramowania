package pl.sdacademy.unit.test.exercises.day1.unit.task1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

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

}