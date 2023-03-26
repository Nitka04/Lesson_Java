package Homerworks.Homerworks17;

import java.util.Scanner;

//Необходимо вывести на экран перевернутый прямоугольный треугольник прямым углом сверху в левой части.
//Для вывода использовать условные операторы, циклы.
//Команду System.out.println(); System.out.print(); и можно использовать толькос одним символом *.
//Пользователь вводит с клавиатуры число, которое будет считаться основанием треугольника,mа программа выводит сам треугольник.
//Пример с числом 7:
//*******
//*    *
//*   *
//*  *
//* *
//*
//Необходимо написать программу для вывода вначале заполненного, а потом и пустого треугольника.
public class exercise5 {
    public static void main(String[] args) {
        System.out.println("Введіть розмір основанія трикутника:");
        Scanner o = new Scanner(System.in);
        int osn = o.nextInt();
//полий трикутник
        /*for (int i = osn; i > 0; i--) {
            for (int j=0; j<i; j++) {
                if (j==0||j==i-1||i==osn) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }*/
        // заповнений  зірочками трикутник
        for (int i = osn; i > 0; i--) {
            for (int j=0; j<i; j++) {
                if (j==0||j==i-1||i==osn) {
                    System.out.print("*");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
