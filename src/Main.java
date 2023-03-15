public class Main {
    public  static void leapYear (int year) {
        String x= (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)?year + "-год является високосным":year + "-год не является високосным";
        System.out.println(x);
    }
    public  static void checkingModel (String os, int modelYear, int currentYear, int newVersionAppYear) {
        String ios="IOS";
        String android ="Android";
        boolean iosModel=os.equalsIgnoreCase(ios);
        boolean androidModel = os.equalsIgnoreCase(android);

        if (iosModel){
            if (modelYear>=newVersionAppYear&&modelYear<=currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (modelYear < newVersionAppYear && modelYear>2005) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else { System.out.println("Для года выпуска вашего телефона наше приложения не подходит");
        }
        }
        else if (androidModel){
            if (modelYear>=newVersionAppYear&&modelYear<=currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (modelYear < newVersionAppYear && modelYear>2005) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else { System.out.println("Для года выпуска вашего телефона наше приложения не подходит");
            }
        }
        else {
            System.out.println("Для операционной системы вашего телефона наше приложение не подходит");

    }

    }

    public static void main(String[] args) {
        System.out.println("     Задача 1");
        int year = 2100;
        leapYear(year);
        System.out.println("     Задача 2");
        String os="android";
        int phoneYear = 2023;
        int currentYear = 2023;
        int newVersionAppYear = 2015;
        checkingModel(os, phoneYear, currentYear, newVersionAppYear);


    }

}