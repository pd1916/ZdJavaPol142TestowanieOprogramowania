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

    @Test
    void shouldReturnTrueIfStringContainsOnlySpaces() {
        //given
        String input = " ";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertTrue(result);
        assertThat(result).isTrue();
    }

    @Test
    void shouldReturnFalseIfStringIsNotEmptyTest2() {
        //given
        String input = " java";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertFalse(result);
        assertThat(result).isFalse();
    }

    @Test
    void shouldReturnFalseIfStringIsNotEmptyTest3() {
        //given
        String input = "java ";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertFalse(result);
        assertThat(result).isFalse();
    }

    @Test
    void shouldReturnFalseIfStringIsNotEmptyTest4() {
        //given
        String input = " java ";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertFalse(result);
        assertThat(result).isFalse();
    }

}