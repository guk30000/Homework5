public class Main {
    public static void main(String[] args) {

        //Задача 1

        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Задача 2

        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //Задача 3

        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        //Задача 4

        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //Задача 5

        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        //Задача 6

        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        //Задача 7

        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        //Задача 8

        int savingsPerMonth = 29000;
        int totalSavings = 0;

        System.out.println("Задача 8");
        for (int i = 1; i <= 12; i++) {
            totalSavings = totalSavings + savingsPerMonth;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSavings + " рублей");
        }

        //Задача 9

        totalSavings = 0;
        System.out.println("Задача 9");
        for (int i = 1; i <= 12; i++) {
            totalSavings = totalSavings + totalSavings/100;
            totalSavings = totalSavings + savingsPerMonth;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSavings + " рублей");
        }

        //Задача 10

        int a = 2;
        int b;
        System.out.println("Задача 10");
        for (int i = 1; i <= 10; i++) {
            b = a * i;
            System.out.println(a + "*" + i + "=" + b);
        }
    }
}