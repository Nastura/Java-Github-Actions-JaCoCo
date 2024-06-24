package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void findEqualValue() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12, 13};
        long expected = 13;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);

    }

@Test
    void textEquality() {  // text Equality - равенство текста
        Main service = new Main();
        String text = "JaCoCo";
        String expected = "JaCoCo";
        String actual = service.test(text);
        Assertions.assertEquals(expected, actual);
}

    @Test
    void textNotEqual() { // textNotEqual Не равенство текста
        Main service = new Main();
        String text = "NotJaCoCo";
        String expected = "Not JaCoCo";
        String actual = service.test(text);
        Assertions.assertEquals(expected, actual);
    }



}