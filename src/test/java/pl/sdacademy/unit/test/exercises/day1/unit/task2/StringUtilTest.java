package pl.sdacademy.unit.test.exercises.day1.unit.task2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    /*
    gdy true:
    null
    " "
    ""
    "  "

    gdy false:
    "java"
    " java"
    "java "
    " java "
     */

    @Test
    void shouldReturnTrueIfStringIsEmpty() {
        //when
        boolean result = StringUtil.isBlank("");
        //then
        assertTrue(result); //jUnit5
        assertThat(result).isTrue(); //assertJ
    }

    @Test
    void shouldReturnFalseIfStringIsNotEmpty() {
        //when
        boolean result = StringUtil.isBlank("java");
        //then
        assertFalse(result); //jUnit5
        assertThat(result).isFalse(); //assertJ
    }

}