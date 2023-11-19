package pl.sdacademy.unit.test.exercises.day1.unit.task4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PersonTest {

    /*
        age >= 0 && age <= 18

        0-18
        0
        18
        18+
     */

    @Test
    void thatPersonIsAChild() {
        //given
        Person person = new Person("Jan", "Kowalski", 3);
        //when
        boolean result = person.isChild();
        //then
        assertTrue(result); //jUnit5
        assertThat(result).isTrue(); //assertJ
    }

    @Test
    void thatPersonIsNotAChild() {
        //given
        Person person = new Person("Jan", "Kowalski", 99);
        //when
        boolean result = person.isChild();
        //then
        assertFalse(result); //jUnit5
        assertThat(result).isFalse(); //assertJ
    }

}