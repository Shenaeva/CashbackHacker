package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackerTest {

    @Test
    public void shouldReturn100IfAmountIs900() {
        CashbackHacker service = new CashbackHacker();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0IfIfAmountIs1000() {
        CashbackHacker service = new CashbackHacker();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn200IfIfAmountIs1800() {
        CashbackHacker service = new CashbackHacker();
        int amount = 1800;
        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(expected, actual);
    }
}