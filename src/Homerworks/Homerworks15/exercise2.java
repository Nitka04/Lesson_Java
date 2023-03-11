/*Пользователь вводит с клавиатуры три целочисленных значения
На экран выводится информация можно ли из этих сторон
построить треугольник.*/
package Homerworks.Homerworks15;

import java.util.Scanner;
public class exercise2 {
    public static void main(String[] args) {
        System.out.println("Введите первую сторону треугольника а=");
        Scanner t = new Scanner(System.in);
        float a=t.nextFloat();
        System.out.println("Введите вторую сторону треугольника b=");
        Scanner k=new Scanner(System.in);
        float b=k.nextFloat();
        System.out.println("Введите третью сторону треугольника с=");
        Scanner l=new Scanner(System.in);
        float c=l.nextFloat();
boolean tr= ((a+b)>c&&(a+c)>b&&(b+c)>a);
        System.out.println(tr);

    }
}
