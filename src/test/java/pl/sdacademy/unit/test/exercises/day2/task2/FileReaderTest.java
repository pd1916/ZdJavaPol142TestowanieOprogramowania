package pl.sdacademy.unit.test.exercises.day2.task2;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class FileReaderTest {
    private static final String PATH = "src/test/resources/";

    @Test
    void shouldCountCharactersInProvidedFile() {
        //given
        File file = new File(PATH + "file_correct.csv");
        int expectedResult = 23;
        //when
        int result = FileReader.counterCharacters(file);
        //then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldCountCharactersInProvidedEmptyFile() {
        //given
        File file = new File(PATH + "file_empty.csv");
        int expectedResult = 0;
        //when
        int result = FileReader.counterCharacters(file);
        //then
        assertThat(result).isEqualTo(expectedResult);
    }


    @Test
    void shouldThrowExceptionWhenFileNotExist() {
        //given
        File notExistedFile = new File(PATH + "file2.csv");
        //when & then
        assertThatThrownBy(() -> FileReader.counterCharacters(notExistedFile))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("file not found");
    }

    @Test
    void shouldThrowExceptionWhenFileHasWrongExtension() {
        //given
        File notExistedFile = new File(PATH + "file.txt");
        //when & then
        assertThatThrownBy(() -> FileReader.counterCharacters(notExistedFile))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("wrong extension");
    }

    @Test
    void shouldThrowExceptionWhenFileHasNotExtension() {
        //given
        File notExistedFile = new File(PATH + "file_without_extension");
        //when & then
        assertThatThrownBy(() -> FileReader.counterCharacters(notExistedFile))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("wrong extension");
    }
}