package com.company;

public class Main {

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        //подготавливаем данные:
        int amount = 1000_60;
        boolean registered = true;
        long expected = 300;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PASS
        // если false - то FAIL
        boolean passed = expected == actual;

        // выводим результат:
        System.out.println(passed);
    }
}
