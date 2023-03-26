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
        Scanner o=new Scanner(System.in);
        int osn=o.nextInt();
        String[] osnov=new String[osn];
        /*osnov[0]= "*";
        osnov[1]= "*";
        osnov[2]= "*";
        osnov[3]= "*";*/
        for (int i=0;i<= osnov.length-1;i++){
            osnov[i]= "*";
        }
        for (int j=0;j<= osnov.length;j++){
        System.out.println(osnov[j]+"");}
    }
}
