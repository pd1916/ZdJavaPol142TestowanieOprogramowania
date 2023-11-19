package pl.sdacademy.unit.test.exercises.day1.tdd.task6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilTest {
    @Test
    void shouldRemoveAllDuplicates() {
        //given
        String[] array = {"Java", "Pyhton", "Java", "C", "C#", "C"};
        //when
        String result[] = ArrayUtil.removeDuplicates(array);
        //then
        assertArrayEquals(new String[]{"Java", "Pyhton", "C", "C#"}, result);
        assertThat(result).isEqualTo(new String[]{"Java", "Pyhton", "C", "C#"});
    }
}