import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void leapYearCheck(int yearValue) {

        if (yearValue % 4 == 0 && yearValue % 100 != 0 || yearValue % 400 == 0) {
            System.out.println(yearValue + " високосный год");
        } else {
            System.out.println(yearValue + " не високосный год");
        }
        System.out.println("===================");
    }

    public static void checkTypeOS_AndOldOS(int typeOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (typeOS == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (typeOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android  по ссылке");

        }
        else if (typeOS == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для IOS по ссылке");

        }
        else if (typeOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");

        } else System.out.println("Ошибка ввода");

        System.out.println("===================");
    }

    public static void deliveryTime(int deliveryDistance)
    {
        if (deliveryDistance < 20)
        {
            int dayToDelivery = 1;
            System.out.println("Потребуется дней: " + dayToDelivery);
        }
        else
            if (deliveryDistance > 20 && deliveryDistance <= 60)
        {
            int dayToDelivery = 2;
            System.out.println("Потребуется дней: "+dayToDelivery);
        }
        else
            if (deliveryDistance > 60 && deliveryDistance < 100)
            {
                int dayToDelivery = 3;
                System.out.println("Потребуется дней:"+dayToDelivery);
            }
             else
             {
                System.out.println("Дистанция слишком велика для доставки");
             }

        System.out.println("===================");
    }



    public static void main(String[] args) {
        //task1
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = in.nextInt();

        leapYearCheck(year);

        //task2
        Scanner inOS = new Scanner(System.in);
        System.out.println("Android = 1, IOS = 0, введите тип вашей операционной системы: ");
        int clientOS = inOS.nextInt();

        Scanner inAgeOS = new Scanner(System.in);
        System.out.println("Введите год выпуска вашего устройства: ");
        int clientDeviceYear = inAgeOS.nextInt();

        checkTypeOS_AndOldOS(clientOS, clientDeviceYear);

        //task3
        Scanner inDeliveryDistance = new Scanner(System.in);
        System.out.println("Введите дистанцию доставки вашей банковской карты: ");
        int deliveryDistance = inDeliveryDistance.nextInt();

        deliveryTime(deliveryDistance);



    }

}