package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {
//    public static int age = 15;
//    public static int temp = 20;

    public static void main(String[] args) {
        String myinfo = remove("Бактыяр ", 29 );
        System.out.println(myinfo);
 //       printText();
        // Задача №1
//        weather();
//        weather2();
//    }
//
//        public static void weather() {
//            if (age > 10 && age < 45 && temp > -20 && temp < 30) {
//                System.out.println("Можно идти гулять");
//            } else if (age < 10 && temp > 0 && temp < 8) {
//                System.out.println("Можно гулять но не долго");
//            } else if (age < 65 && temp > -10 && temp < 25) {
//                System.out.println("Можно гулять но не долго");
//            }
//        }
//            public static  String weather2(){
//                if (age > 10 && age < 45 && temp > -20 && temp < 30) {
//                    return ("Можно идти гулять");
//                }
//                else{
//                    return ("Остаться дома");
//
//                }
//            }

        //Задача №1/2

//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите имя: ");
//        String name = in.nextLine();
//        System.out.print("Введите возраст: ");
//        int age = in.nextInt();
//        System.out.println("Введите тепературу: ");
//
//        int temp = in.nextInt();
//
//        if (temp == 20)
//            System.out.println("Можно гулять, температура: " + temp);
//        else if (temp == 10)
//            System.out.println("Надеть свитер прохладно, температура:  " + temp);
//        else if (temp == 0)
//            System.out.println("Желательно остаться дома, температура: " + temp);
//        else
//            System.out.println("Оставайтесь дома, температура: ");
//
//        System.out.println("Имя: " + name);
//
//        System.out.print("Возраст: " + age);

          //Зачада №2 switch in String
//                String Word = "first";

//        switch (Word){
//            case "first":
//                System.out.println("Gold medal");
//                break;
//            case "Second":
//                System.out.println("Silver medal");
//                break;
//            case "Third":
//                System.out.println("Bronze medal");
//                break;
//            default:
//                System.out.println("error");}


//    }
//    public static void printText() {
//        System.out.println("Bart");
//        System.out.println("Liza");
//        System.out.println("Homer");
//        System.out.println("March");
//        System.out.println("Maggie");

//
//        String d1 = (" Бактыяр ");
//        int d2 = (29);
//        String e1 = (d1 + d2);
//        System.out.println(e1);
//
//    }
    }

    //Доп дз
    public static String remove(String name, int age){
        final String result = ("Меня зовут : " + name + " " + "Мне:" + age);
        return result;
    }

}
