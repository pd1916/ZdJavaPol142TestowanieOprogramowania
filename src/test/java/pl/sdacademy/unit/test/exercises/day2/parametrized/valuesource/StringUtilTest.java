package pl.sdacademy.unit.test.exercises.day2.parametrized.valuesource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {
    
    /*
    true:
        ""
        " "
        "   "
        null
    
    false:
        "programowanie"
        "programowanie "
        " programowanie"
        " programowanie "
     */

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "  "})
    void shouldReturnTrueIfStringIsEmpty(String input) {
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertTrue(result); //jUnit
        assertThat(result).isTrue(); //assertJ
    }

    @ParameterizedTest
    @ValueSource(strings = {"programowanie", " java", "kurs ", " sda "})
    void shouldReturnFalseIfStringIsNotEmpty(String input) {
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertFalse(result); //jUnit
        assertThat(result).isFalse(); //assertJ
    }

    @Test
    void shouldReturnTrueIfStringIsNull() {
        //when
        boolean result = StringUtil.isBlank(null);
        //then
        assertTrue(result); //jUnit
        assertThat(result).isTrue(); //assertJ
    }

}