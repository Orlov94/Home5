package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServecTest {

    @ParameterizedTest
    @CsvSource(value = {"'sqrServiceRange1', 120, 180, 3",
            "'sqrServiceRange1', 220, 240, 1",
            "'sqrServiceRange2', 250, 290, 2"})
    void shouldSqrAreaQuantity(String testName, int first, int last, int expected) {
        SQRServec servec = new SQRServec();

        int actual = servec.sqrAreaQuantity(first, last);

        assertEquals(expected, actual);
    }
}