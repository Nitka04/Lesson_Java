package Homerworks.Homerworks15;

import java.util.Date;
import java.util.Scanner;

//5)Написать алгоритм, где у пользователя просят ввести спецификатор формата для нынешнего времени либо даты.
//И в зависимости от ввода этого спецификатора на консоль
//будет выводится дата либо время в указанном формате.
public class exercise5 {
    public static void main(String[] args) {
        System.out.println("Введите спецификатор формата в виде %1$t...");
        Scanner time=new Scanner(System.in);
        String t= time.nextLine();
        Date date= new Date();
        System.out.printf(t,date);


    }
}
