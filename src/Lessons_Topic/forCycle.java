package Lessons_Topic;

import java.awt.*;
import java.util.Scanner;

public class forCycle {
    public static void main(String[] args) {
        //Цикл for также называют циклом со счётчиком.
        // В случае, когда вам известно какое количество
        // раз необходимо выполнить одно и тоже действие
        // необходимо использовать цикл for.
        /*for (int a = 1; a <= 5; a++) {
            System.out.println("Итерация под номером " + a);
        }*/

        //вывести на консоль отдельными строками все слова из текста,
        //который введет пользователь
        /*Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] words = text.split("\\s");
        for (int i = 0; i< words.length; i++){
            System.out.println(words[i].toLowerCase()
                    .replace(",","")
                    .replace(".",""));
        }*/

        //Ввести с клавиатуры несколько предложений.
        //Вывести в консоль среднюю длину слова в каждом предложении.
        //Вывести на экран среднее количество слов в данных предложениях.
         Scanner vod=new Scanner(System.in);
         System.out.println("Введите предложения:");
         String v=vod.nextLine();
         String[] mp=v.split("\\.");
         double k=mp.length;
         double countotWord=v.replace(".", "")
                 .replace(".", "").split("\\s").length;
        System.out.println("Общее кол-во слов в предложениях "+countotWord/k);
        for(int i=0;i<k;i++){
           int coutwords=mp[i].split("\\s").length;
           int countchar=v.split("\\.")[i].replace(" ", "")
                   .replace(",", "").length();
            System.out.println("Средняя длина слова в предложении :"+(i+1)+" "+(countchar/coutwords));
        }


    }

}

