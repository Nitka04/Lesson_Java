package Lessons_Topic;

import java.util.Scanner;

public class forEach {
    public static void main(String[] args) {
        //Цикл for each это разновидность цикла for,
        // который используется для перебора массива
        // или коллекции без ручного изменения переменной
        // шага для перебора. Цикл for each выполняет эту работу автоматически.


     String[] strings={"one", "two", "three","four"};
     for (String x:strings){
         System.out.println(x);
     }

        //Вывести все элементы массива используя цикл for
        //Заполнить одномерный массив из 10 элементов случайными числами из
        //диапазона от -10 до 10.
        /*int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 21)-10);//вводит рандомное число 21 указівает количество чисел генерировать, по умолчанию от нуля
        }// -10 смещает константу с нуля до -10
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }*/
         //Пользователь задает размерность двумерного массива с клавиатуры.
        //Массив заполняется случайными числами от 0 до 1000.
        //Необходимо создать одномерный массив, состоящий из максимальных значений
        //каждого отдельного массива входящего в двумерный.
        //Новый полученный массив вывести на экран.
        Scanner in=new Scanner(System.in);
        System.out.println("Введіть два числа");
        int first=in.nextInt();
        int second=in.nextInt();
        int [][]firstarray=new int[first][second];
        for (int[] ints:firstarray){
            for(int i=0;i<ints.length;i++){
                ints[i]=((int) (Math.random()*1001));
            }
        }
        /*for (int[]ints:firstarray){
            for (int number:ints){
                System.out.println(number+" ");
            }
            System.out.println("");
        }*/
        int[] finalarray=new int[first];
         // получение максимального числа из массива
           for (int i=0; i<firstarray.length;i++){
               int max=firstarray[i][0];
               for (int numbers:firstarray[i]){
                   if(numbers>max){
                       max=numbers;
                   }
                   finalarray[i]=max;
               }

           }


    }
}
