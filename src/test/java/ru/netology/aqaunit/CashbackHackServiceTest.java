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

    // Sorry, this is only for me. I'm a kettle!
    /*@Test
    void shouldAdd100IfAmountLowerThen1000Equals900() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int actual = cashbackHackService.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void shouldAdd0IfAmountIs1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void calculateShouldAdd375IfAmountEquals1625() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1625;
        int actual = cashbackHackService.remain(amount);
        int expected = 375;
        assertEquals(expected, actual);
    }*/
}