/*У вас есть строка "Я тестирую замечательно. Что еще нужно?",
Которую нужно ввести с клавиатуры в консоль.
Необходимо при помощи только  метода next() класса Scanner
(не используем метод nextLine())
присвоить перемнным типа String следующие значения:
string1 = Я
string2 = тестирую
string3 = замечательно
string4 = Что еще нужно?
Помимо string1, string2, string3, string4 новых переменных
создавать нельзя.*/
package Homerworks.Homerworks15;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        System.out.println("Ведите: Я тестирую замечательно. Что еще нужно?");
        Scanner input = new Scanner(System.in);
        /*String string1=input.next();
        String string2=input.next();
        String string3=input.next();
        String string4=input.nextLine();
        System.out.println("string1="+string1);
        System.out.println("string2="+string2);
        System.out.println("string3="+string3);
        System.out.println("string4="+string4);*/

        //input.useDelimiter(".");
        while (input.hasNext())
        {
           String str = input.next();

           System.out.println(str); }
            //String [] strings=str.split(".");
            //int i=2;
           // for (i=1;i<strings.length;i++);
          //  System.out.println(strings);
            input.close();

    }
}
