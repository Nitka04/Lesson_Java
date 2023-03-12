package Lessons_Topic;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
         /*   if(условие){
          (этот блок выполнится
          если условие = true);
    } else {
          (этот блок выполнится
          если условие = false);
          }*/

        /* int x = 25;
        if (x < 10) {
            System.out.println(" block if");
        } else if (x > 20) {
            System.out.println("block elseIf");
        } else System.out.println("Block else"); */


        //Стоимость билета задана
// в зависимости от возраста дает скидку
       /* double cost = 500;
        Scanner in = new Scanner(System.in);
        System.out.println("Age");
        int age=in.nextInt();
        if (age<18){
        if(age==13){
                cost = cost*0.5;
                System.out.println("цена "+ cost);
            }
            cost=cost*0.75;
            System.out.println("Cost ticket"+cost);
        }
                else if (age > 65)
        {
            cost=cost*0.85;
            System.out.println("Cost ticket"+cost);
        }
        else {
            System.out.println("Cost ticket"+cost);
        }*/


        //Ползователь вводит с клавиатуры предложение.
        //Если количество слов в нем больще трех но меньше девяти и это
        //количество четное,
        //то в консоль выводится сообщение "выполнилось первое условие".
        //Если количество слов больше двенадцати но меньше двадцати,
        // и это количество
        //не делится на три, то в консоль выводится сообщение "выполнилось
        // второе условие".
        //Если колтчество слов в предложении равно трем,  то в консоль
        // выводится сообщение
        //"выполнилось третье условие".
        //В противном случае вывести сообщение "Не выполнилось ни одно
        // условие".
        System.out.println("Введите предложение: ");
        Scanner prd = new Scanner(System.in);
        String str=prd.nextLine();
        int k=str.split(" ").length;
        if(k==3) {
            System.out.println("выполнилось третье условие");
        }
        else if (k>3&&k<9&&k%2==0)
        {
            System.out.println("выполнилось первое условие");
        }
           else if (k>12&&k<20&&k%3!=0)
        {
               System.out.println("выполнилось первое условие");
        }
        else {
            System.out.println("Не выполнилось ни одно условие");
        }


    }
}
