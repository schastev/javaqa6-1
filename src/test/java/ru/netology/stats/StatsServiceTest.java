package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void calcSumTest() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        StatsService calculation = new StatsService();
        int actual = calculation.calcSum(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calcAvgTest() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        StatsService calculation = new StatsService();
        int actual = calculation.calcAvg(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calcMax() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        StatsService calculation = new StatsService();
        int actual = calculation.calcMax(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calcMin() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        StatsService calculation = new StatsService();
        int actual = calculation.calcMin(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calcBelowAvg() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        StatsService calculation = new StatsService();
        int actual = calculation.calcBelowAvg(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calcAboveAvg() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        StatsService calculation = new StatsService();
        int actual = calculation.calcAboveAvg(sales);
        assertEquals(expected, actual);
    }
}