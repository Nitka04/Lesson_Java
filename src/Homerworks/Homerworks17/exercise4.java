package Homerworks.Homerworks17;

import java.util.Scanner;

//Имеется массив, размер которого должен быть четным числом и  этот размер вводится пользователем с клавиатуры.
//Значения элементов задаются случайным образом в диапазоне от 0 до 100.
//Отсортировать первую половину данного массива по возрастанию, а вторую по
//убыванию. Вывести на экран изначальный и отсортированный массив.
public class exercise4 {
    public static void main(String[] args) {
        int o=0;
        do {
            System.out.println("Введіть розмір массиву:");
            Scanner r = new Scanner(System.in);
            int raz = r.nextInt();
             if (raz%2!=0){
                 System.out.println("Розмір масиву не парний. Введіть інше значення");}
             else{
                 int[] array=new int[raz];
                 for (int i=0;i< array.length;i++){
                     array[i]=(int)(Math.random()*100);
                 }
                 for (int l = 0; l < array.length; l++){
                     System.out.print(array[l]+" ");}
                 for (int i =array.length/2-1; i>=0; i--) {
                     int max;
                     for (int m=i-1;m>=0;m--){
                         if(array[i]<array[m]) {
                             max = array[m];
                             array[m]=array[i];
                             array[i]=max;}
                     }
                 }
                 for (int j =array.length-1; j>array.length/2-1; j--) {
                     int min;
                     for (int n=j-1;n>array.length/2-1;n--){
                         if(array[j]>array[n]) {
                             min = array[n];
                             array[n]=array[j];
                             array[j]=min;}
                     }
                 }
                 System.out.println("");
                 for (int l = 0; l < array.length; l++){
                     System.out.print(array[l]+" ");}
                 System.out.println("\n");

                 o++;}
        }while (o==0);
    }
}
