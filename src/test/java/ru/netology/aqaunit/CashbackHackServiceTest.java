package ru.netology.aqaunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
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
    void shouldAdd375IfAmountLowerThen2000Equals1625() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1625;
        int actual = cashbackHackService.remain(amount);
        int expected = 375;
        assertEquals(expected, actual);
    }

    @Test
    void shouldAdd0IfAmountIs2000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 2000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
}