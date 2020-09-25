package ru.geekbrains.lesson1;

public class Main {
    //Целочисленные
    int tInt = 1000;
    byte tByte = 5;
    short tShort = 3355;
    long tLong = 333333;
    //С точкой
    double tDouble = 8.5;
    float tFloat = 1.2F;
    //Строковые
    String tString = "TestString";
    //Символьные
    char tChar = 102;
    //Логические
    boolean tBoolean = false;

    public static void main(String[] args){
        System.out.println(metod1(2, 4, 10, 5));
        System.out.println("metod2 : " + metod2(5, 7));
        metod3(4);
        System.out.println(metod4(3));
        metod5("Нафаня");
        VisocosYear(1989);
    }

    public static double metod1(int a, int b, int c, int d){
       double result;
       result = a * (b + (c / d));
       return result;
    }
    public static boolean metod2(int a, int b){
        int c = a + b;
        if ((c >= 10) && (c <= 20)) return true;
            else
                return false;
    }
    public static void metod3(int a){
        if(a < 0) System.out.println("Число является отрицательным");
            else
                System.out.println("Число является положительным");
    }
    public static boolean metod4(int a){
        if(a < 0) return true;
            else
                return false;
    }
    public static void metod5(String name){
        System.out.println("Привет, " + name +"!");
    }
    public static void VisocosYear (int year){
        if ((year % 4 == 0 && year % 100 != 0) | (year % 400 == 0)) System.out.println("Год является високосным");
            else System.out.println("Год не является високосным");
    }
}
