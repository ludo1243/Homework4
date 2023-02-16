import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько вам лет? ");
        int vozrast = scanner.nextInt();
        if (vozrast >= 18) {
            System.out.println("Вам " + vozrast + " вы совершеннолетний");
        }
        else {
            int a = 18 - vozrast;
            System.out.println("Вам " + vozrast + " вы не совершеннолетний, нужно подождать еще " + a + " лет\n");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какая на улице температура?");
        int temperatura = scanner.nextInt();
        if (temperatura <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else if (temperatura > 5) {
            System.out.println("На улице тепло, можно идти без шапки\n");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какая скорость машины?");
        int scorost = scanner.nextInt();
        if (scorost > 60) {
            int a = scorost - 60;
            System.out.println("Ваша скорость " + scorost + "км/ч, придется заплатить штраф, вы превысили на " + a + "км/ч");
        } else if (scorost < 60) {
            System.out.println("Ваша скорость " + scorost + "км/ч, можно ездить спокойно \n");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько вам лет?");
        int vozrast = scanner.nextInt();
        if (vozrast > 2 && vozrast < 6) {
            System.out.println("Если возраст человека равен " + vozrast + " то ему нужно ходить в садик");
        } else if (vozrast > 7 && vozrast < 18) {
            System.out.println("Если возраст человека равен " + vozrast + " то ему нужно ходить в школу");
        } else if (vozrast > 18 && vozrast < 24) {
            System.out.println("Если возраст человека равен " + vozrast + " то ему нужно ходить в университет");
        } else if (vozrast > 24) {
            System.out.println("Если возраст человека равен " + vozrast + " то ему нужно ходить на работу\n");
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько вам лет?");
        int vozrast = scanner.nextInt();
        if (vozrast < 5) {
            System.out.println("Если возраст ребенка равен " + vozrast + " то ему нельзя кататься на аттракционе");
        } else if (vozrast > 5 && vozrast < 13) {
            System.out.println("Если возраст ребенка равен " + vozrast + " можно кататься на аттракционе в сопровождении взрослого");
        } else if (vozrast > 13) {
            System.out.println("Если возраст ребенка равен " + vozrast + " можно кататься на аттракционе без сопровождения взрослого\n");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько сидячих мест?");
        int sidMesto = scanner.nextInt();
        System.out.println("Сколько стоячих мест?");
        int stayMesto = scanner.nextInt();

        int zanMesta = sidMesto + stayMesto;
        int swobondoMest = 102 - zanMesta;
        if (sidMesto == 60 || stayMesto == 42) {
            System.out.println("В вагоне нет мест");
        } else if (sidMesto < 60 || stayMesto < 42) {
            System.out.println("В вагоне есть " + swobondoMest + " свободных места\n");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите перво число");
        int one = scanner.nextInt();
        System.out.println("Введите второе число");
        int two = scanner.nextInt();
        System.out.println("Введите третье число");
        int three = scanner.nextInt();

        if ( one > two || one > three) {
            System.out.println(one + " наибольшее значение");
        } else if (two > one) {
            System.out.println(two + " наибольшее значение");
        } else if (three > one) {
            System.out.println(three + " наибольшее значение");
        }
    }
}