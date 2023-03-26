package Homerworks.Homerworks18;

import java.util.Arrays;

//Написать метод, принимающий в качестве параметра массив целых чисел.
// И выводит на экран все четные числа списком,
//   а также нечетные числа списком.
public class exercise2 {

    public static void masiv (int[] cherNeCet){
        int l=cherNeCet.length;
        int[] chet=new int[l];
        int[] necht=new int[l];
        int j=0;
        int n=0;
        for(int i=0; i<= cherNeCet.length-1; i++){
            if (cherNeCet[i]%2==0){
                chet[j]=cherNeCet[i];
                j++;
               /* System.out.println("Четні числа масиву:"+cherNeCet[i]+" ");*/
            }else {
                necht[n]=cherNeCet[i];
                n++;
                /*System.out.println("Нечетні числа масиву:"+cherNeCet[i]);*/
            }
        }
        System.out.println("Четні числа масиву:");
        for (int i = 0; i < cherNeCet.length; i++) {
            if (chet[i]!=0){
            System.out.print(chet[i] +",");}
        }
        System.out.println("\b");
        System.out.print("Нечетні числа масиву:");
        for (int i = 0; i < cherNeCet.length; i++) {
            if(necht[i]!=0){
            System.out.print(necht[i]+",");}
           /* String k1= Arrays.toString(necht);
            System.out.println(k1);*/
        }
        System.out.println("\b");
    }
    public static void main(String[] args) {

        masiv(new int[] {3, 4, 2 ,5, 1 });
    }
}
