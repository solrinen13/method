import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void leapYearCheck(int a)
    {

        if ( a % 4 == 0 )
        {
            System.out.println( a+" високосный год");
        }

        else
        {
            System.out.println( a+" не високосный год");
        }
        System.out.println("===================");
    }

    public static void checkTypeOS_AndOldOS(int a,int b, int c)
    {
        if (a == 1 && b == c)
        {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
         else
             if (a == 1 && b < c)
         {
            System.out.println("Установите облегченную версию приложения для Android  по ссылке");

         }
        else
            if(a == 0 && b == c)
            {
                System.out.println("Установите версию приложения для IOS по ссылке");

            }
            else
                if(a == 0 && b < c)
                {
                    System.out.println("Установите облегченную версию приложения для IOS по ссылке");

                }
                else System.out.println("Ошибка ввода");

        System.out.println("===================");
    }
    public static void deliveryTime(int a)
    {
        if (a < 20)
        {
            int dayToDelivery = 1;
            System.out.println("Потребуется дней: " + dayToDelivery);
        }
        else
            if (a > 20 && a <= 60)
        {
            int dayToDelivery = 2;
            System.out.println("Потребуется дней: "+dayToDelivery);
        }
        else
            if (a > 60 && a < 100)
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




    public static void main(String[] args)
    {
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
         int currentYear = LocalDate.now().getYear();

        checkTypeOS_AndOldOS(clientOS,clientDeviceYear, currentYear);

        //task3
        Scanner inDeliveryDistance = new Scanner(System.in);
        System.out.println("Введите дистанцию доставки вашей банковской карты: ");
        int deliveryDistance = inDeliveryDistance.nextInt();

        deliveryTime(deliveryDistance);



    }

}