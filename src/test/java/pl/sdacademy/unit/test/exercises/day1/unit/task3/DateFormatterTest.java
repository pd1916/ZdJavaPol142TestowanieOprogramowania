package pl.sdacademy.unit.test.exercises.day1.unit.task3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DateFormatterTest {

    /*
    YYYY-MM-dd -> LocalDate
    String w formacie YYYY-dd-MM
     */
    @Test
    void shouldReturnCorrectDateAsString() {
        //given
        DateFormatter dateFormatter = new DateFormatter();
        LocalDate input = LocalDate.of(1970, 1, 13);
        String expectedResult = "1970-13-01";
        //when
        String result = dateFormatter.formatDate(input);
        //then
        assertEquals(expectedResult, result); //jUnit5
        assertThat(result).isEqualTo(expectedResult); //assertJ
    }

}