package com.company;

public class BonusMilesServiceHWTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndLimit() {
        BonusMilesService service = new BonusMilesService();

        //подготавливаем данные:
        int amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusMilesService service = new BonusMilesService();

        //подготавливаем данные:
        int amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
}
