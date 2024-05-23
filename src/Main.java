import java.time.LocalDate;

public class Main {
    public static String checkLeapYear(int year) {
        String checkLeapYear = " год не является високосным";
        if (year < 1584) {
            checkLeapYear = " год должен быть больше, чем 1584";
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            checkLeapYear = " год является високосным";
        }
        return checkLeapYear;
    }

    public static String suggestAppVersionBasedOnYearAndOS(int year, int clientOS) {
        int currentYear = LocalDate.now().getYear();
        String suggestAppVersionBasedOnYearAndOS = "";
        if (year <= 2015) {
            if (clientOS == 1 && currentYear > 2015) {
                suggestAppVersionBasedOnYearAndOS = "Установите облегченную версию приложения для iOS по ссылке";
            } else {
                suggestAppVersionBasedOnYearAndOS = "Установите облегченную версию приложения для Android по ссылке";
            }
        } else {
            if (clientOS == 0) {
                suggestAppVersionBasedOnYearAndOS = "Установите версию приложения для iOS по ссылке";
            } else {
                suggestAppVersionBasedOnYearAndOS = "Установите версию приложения для Android по ссылке";
            }
        }
        return suggestAppVersionBasedOnYearAndOS;
    }

    public static int amountOfDays(int distance) {
        int deliveryTime = 0;
        if (distance < 20) {
            deliveryTime = 1;
        } else if (distance >= 20 && distance < 60) {
            deliveryTime = 2;
        } else if (distance >= 60 && distance <= 100) {
            deliveryTime = 3;
        }
        return deliveryTime;
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 2024;
        System.out.println(year + checkLeapYear(year));
        System.out.println("Задание 2");
        int clientDeviceYear = 2015;
        int clientOS = 0;
        System.out.println(suggestAppVersionBasedOnYearAndOS(clientDeviceYear, clientOS));
        System.out.println("Задание 3");
        int distance = 95;
        String days = "день";
        String message = "Срок доставки:%d %s\n";
        if (amountOfDays(distance) > 1 && amountOfDays(distance) < 5) {
            days = "дня";
        } else if (distance > 100) {
            message = "Доставка не осуществляется";
        }
        System.out.printf(message, amountOfDays(distance), days);
    }
}

