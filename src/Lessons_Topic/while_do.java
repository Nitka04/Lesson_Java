package Lessons_Topic;

import java.util.Scanner;

public class while_do {
    public static void main(String[] args) {
         /*while(условие)
    {
        тело цикло выполняется до тех пор пока
        условие true
    }*/
        //break выходит из цикла
        //continue завершает итерацию и уходит на следующий круг
       /* int i=0;
        while (i<5){
            System.out.println("massage");
            i++;
        }*/
        int p=0;
       while (p<10) {
       System.out.println("massage "+p);
        p++;

       }


        //Пример у вас соц сеть в которую можно загружать фотографии
        //у пользователя с консоли спрашивают сколько фотографий
        //он хотел бы загрузить в свой альбом
        //но есть ограничение по размеру альбома в 100 фотографий
        Scanner c=new Scanner(System.in);
       int cPH=0;
        while (cPH<=100) {
           if((100-cPH)==0){
               break;}
            System.out.println("Сколько фото загрузить");
            int temp = c.nextInt();
            if ((cPH+temp)>100){
                System.out.println("такое количество не поместиться");
                System.out.println("Осталось мета на "+(100-cPH));
                continue;}
            cPH+=temp;
            if(cPH>100){
                System.out.println("такое количество не поместиться");
                continue;
            }
            System.out.println("Осталось мета на "+(100-cPH));
        }

        //do while даже если условие не віполняется то процесс пройдет один куруг до while
       /* int i=0;
    do {
        System.out.println("message");
    }
    while (i<0);*/

        //при помощи цикла while вывести на консоль все четные числа из
        //диапазона натуральных чисел, которые пользователь вводит с клавиатуры.
        //Тобишь пользователь с клавиатуры задает два числа, а на консоль выводится
        //все четные числа из этого диападзона.
       /* Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = in.nextInt();
        int b = in.nextInt();
        while (a<b){
            if(a%2==0){
                System.out.println(a);
                a++;
                continue;
            }
            a++;*/
        }
    }


