package Homerworks.Homerworks16;

import Lessons_Topic.IfElse;

import java.util.Objects;
import java.util.Scanner;

//)При помощи цикла while выполнить реализацию следующего алгоритма.
//Пользователь вводит строку с клавиатуры. Программа должна вывести на
//экран сколько символов "a", присутсвует в данной строке.
public class exercise2 {
    private static int String;

    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        System.out.println("Введите строку:");
        String str1=str.nextLine().toLowerCase();
        int k=0;
        int i=0;
        String str2="а";
        while(k<=str1.length()){
            if (str1.charAt(k)==str2.charAt(0)) {
                k++;
                i=i+1;

            }
              else {
                k++;
               }
            System.out.println("Символ а встречается "+i+" раз");;
        }
       /* String[] words = str.split("a");
        System.out.println("Символ а встречается "+(words.length-1)+" раз");*/

    }
}
