public class Main {
    public static void main(String[] args) {
        //Задание1
        System.out.println("Задание №1");
        int iOs = 0;
        int android = 1;
        int clientOS = 0;
        if (clientOS == iOs) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == android) {
            System.out.println("Установите версию приложения для Android по ссылке");
               }
        //Задание 2
        System.out.println("Задание №2");
        int years = 2018;
        int iOs1 = 0;
        int android1 = 1;
        int clientOS1 = 0;
        if (clientOS1 == iOs1 && years >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS1 == iOs1 && years < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS1 == android1 && years >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS1 == android1 && years < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        //Задание 3
        System.out.println("Задание №3");
        int year = 2022;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("год високосный");
        } else {
            System.out.println("год не високосный");
        }

        //Задание 4
        System.out.println("Задание №4");
        int deliveryDistance = 95;
        int a = 1;
        if (deliveryDistance > 20) {
            a++;
        }
        if (deliveryDistance > 60) {
            a++;
        }
        if (deliveryDistance > 100) {
            a++;
        }
        System.out.println("Потребуется " + a + " дня на доставку");

        //Задание 5
        System.out.println("Задание №5");
        int month = 12;
        switch (month) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
        }
    }
}