package com.company;
public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        CheckSumSign();
        printColor();
        compareNumbers();
    }
    public static void CheckSumSign(){
        int a;
        int b;
        a=10;
        b=5;
        if(a+b>0)
                System.out.println("Сумма положительная");
        if(a+b<0)
                System.out.println("Сумма отрицательная");
    }
    public static void printThreeWords() {
            System.out.println(" Orange");
            System.out.println(" Banana");
            System.out.println(" Apple");
        }
        public static void printColor() {
            int value;
            value = 10;
            if (value <= 0) {
                System.out.println("Красный");
            }
            if (value > 0) {
                System.out.println("Жёлтый");
            }
            if (value > 100) {
                System.out.println("Зелёный");
            }

        }
    public static void compareNumbers(){
int a;
int b;
a=110;
b=115;
if(a>=b)
    System.out.println("a>=b");
else
    System.out.println("a<b");
    }

}
