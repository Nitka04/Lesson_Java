package Homerworks.Homerworks17;

import java.util.Scanner;

//Есть одномерный массив из 10 элементов, заполнен-
//ный случайными числами. Пользователь вводит с клавиатуры
//число. Программа показывает есть ли такое число в созданном
//до этого массиве.
public class exercise2 {
    public static void main(String[] args) {
        int[] array=new int[10];
        for (int i=0;i< array.length;i++){
            array[i]=(int)(Math.random()*100);
        }
        for (int l = 0; l < array.length; l++){
            System.out.print(array[l]+" ");}
        System.out.println("\n");
        System.out.println("Введіть число для перевірки:");
        Scanner S=new Scanner(System.in);
        int s=S.nextInt();
        int count=0;
        for (int i = 0; i < array.length; i++){
             if(array[i]==s){
                      count++;
             break;}
                 /*System.out.println("Не знайдено збігу числа в масиві.");*/
             }
        if (count!=0){
            System.out.print("Таке число є в массиві.");}
            else {System.out.println("Не знайдено збігу числа в масиві.");}
    }
}
