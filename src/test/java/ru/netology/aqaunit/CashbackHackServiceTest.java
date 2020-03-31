package ru.netology.aqaunit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldReturnIllegalArgumentExceptionIfAmountLessOrEquals0() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = -1;
        assertThrows(IllegalArgumentException.class, () -> cashbackHackService.remain(amount));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/CashbackData.csv", numLinesToSkip = 1)
    void shouldCalculatecashbackHackTest(int amount, int expected) {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);
    }
}