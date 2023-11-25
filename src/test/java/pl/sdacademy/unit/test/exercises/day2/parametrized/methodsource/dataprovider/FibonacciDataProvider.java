package pl.sdacademy.unit.test.exercises.day2.parametrized.methodsource.dataprovider;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class FibonacciDataProvider {
    static Stream<Arguments> dataProvider2() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(1, 1),
                Arguments.of(4, 3),
                Arguments.of(6, 8),
                Arguments.of(8, 21),
                Arguments.of(19, 4181)
        );
    }

    static Stream<Arguments> dataProvider3() {
        return Stream.of(
                Arguments.of(readFile("testDataForCase1.json"), true),
                Arguments.of(readFile("testDataForCase2.csv"), true),
                Arguments.of(readFile("testDataForCase3.csv"), true),
                Arguments.of(readFile("testDataForCase4.csv"), true),
                Arguments.of(readFile("testDataForCase5.csv"), true)
        );
    }

    private static String readFile(String fileToPath) {
        // odczyta plik
        // zwróc go jako string
        return null;
    }
}
