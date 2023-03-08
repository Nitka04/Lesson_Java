package Lessons_Topic;

import java.util.Date;
import java.util.Scanner;

public class ScannerDAN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      /*  System.out.println("Введите строку");
        String string = input.nextLine();
        System.out.println(string);
        String string2 = input.nextLine();
        System.out.println(string2.trim());
        System.out.println(string2);
        String string3 = input.next();
        System.out.println(string3);*/
       /* int x = input.nextInt();
        System.out.println(x);*/
       /* double y = input.nextDouble();
        System.out.println(y);*/

//Пользователь вводит с клавиатуры произвольную строку.
//   Необходимо чтобы вместо второго слова введенной строки
//   выводилось слово "конечно". И это слово должно писаться отдельной строкой.
//   Ну и после добавлялась фраза типа:
//   Напечатано сегодня в {день недели вывода этого сообщения},
//   в {время вывода сообщения формата 22:22}. (В верхнем регистре.)
        System.out.println("Введите строку");
        String string = input.nextLine();
        String[] words=string.split(" ");
        String word2=words[1];
        String word3=words[2];
        String str2=string.replace(word2, "\nКонечно\n").replace(word3, "\b"+word3);
        System.out.println(str2);
        Date date= new Date();
        String str4=String.format("Напечатано сегодня в %1$tA, в %1$tH:%1$tm",date).toUpperCase();
        System.out.println(str4);


    }
}