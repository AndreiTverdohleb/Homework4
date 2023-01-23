public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();

    }


    public static void task1() {
        System.out.println("задача 1");
        for (int r = 1; r < 11; r++) {
            System.out.println(r);
        }
        System.out.println(" ");
    }


    public static void task2() {
        System.out.println("задача 2");
        for (int r = 10; r > 0; r--) {
            System.out.println(r);
        }
        System.out.println(" ");
    }


    public static void task3() {
        System.out.println("задача 3");
        for (int r = 0; r < 17; r += 2) {
            System.out.println(r);
        }
        System.out.println(" ");
    }


    public static void task4() {
        System.out.println("задача 4");
        for (int r = 10; r > -11; r -= 1) {
            System.out.println(r);
        }
        System.out.println(" ");
    }


    public static void task5() {
        System.out.println("задача 5");
        for (int r = 1904; r < 2097; r += 4) {
            System.out.println(r + " год является високосным");
        }
        System.out.println(" ");
    }


    public static void task6() {
        System.out.println("задача 6");
        for (int r = 7; r < 99; r += 7) {
            System.out.println(r);
        }
        System.out.println(" ");
    }


    public static void task7() {
        System.out.println("задача 7");
        for (int r = 1; r < 513; r *= 2) {
            System.out.println(r);
        }
        System.out.println(" ");
    }


    public static void task8() {
        System.out.println("задача 8");
        int salary = 0;
        for (int r = 1; r < 13; r++) {
            salary += 29000;
            System.out.println("Месяц " + r + " сумма накоплений равна-" + salary + "рублей.");
        }
        System.out.println(" ");
    }


    public static void task9() {
        System.out.println("задача 9");
        int salary = 0;
        for (int r = 1; r < 13; r++) {
            salary += 29000 + salary * 0.01;


            System.out.println("Месяц " + r + " сумма накоплений равна-" + salary + "рублей.");
        }
        System.out.println(" ");
    }


    public static void task10() {
        System.out.println("задача 10");
        for (int t = 1; t < 11; t++) {
            System.out.println("2*" + t + "=" + 2 * t);}
    }

}