package Homerworks.Homerworks16;

import java.util.Arrays;
import java.util.Scanner;

//5)Написать программу в которой пользователь вводит с клавиатуры число,
//а программа определяет, является она полиндромом или нет.
//И выводит данную информацию на экран.
public class exercise5 {
    public static void main(String[] args) {
        System.out.println("Введіть число:");
        Scanner c=new Scanner(System.in);
        String cc=c.nextLine();
        int l=cc.length();
        int i=0;
        if (cc.charAt(i)!=cc.charAt(l-i-1)){
            i++;
            System.out.println("Не полиндром");}
        else {
            System.out.println("Так, це число полиндром.");}

    }
}


