package Homerworks.Homerworks15;

import java.util.Date;
import java.util.Scanner;
//6)Написать программу, где пользователю на консоль выводитсяследующее сообщение:
//Уважаемый X, Вы выполняете задание номер Y, и делаете это в Z часов W минут в V.
//После пользоватею предложат ввести свое имя, номер задания.
//А также ввести спицификаторы формата вместо X, Y, Z, W, V.
//где X - это имя пользователя,
//Y - порядковый номер ДЗ,
//Z - время в часах в момент выполнения программы,
//W - время в минутах в момент выполнения программы,
//V - день недели.
//Необходимо написать алгоритм, который вставит необходимые
// спецификаторы формата вместо X, Y, Z, W, V. И выведет в консоль отформатированное сообщение типа:
//Уважаемый Сергей, Вы выполняете задание номер 15, и делаете это в 10 часов 20 минут в Среду.
public class exercise6 {
    public static void main(String[] args) {
        String S = "Уважаемый X, Вы выполняете задание номер Y, и делаете это в Z часов W минут в V.";
        System.out.println(S);
        System.out.println("Введите свое имя");
        Scanner x = new Scanner(System.in);
        String X = x.next();
        System.out.println("Введите номер выполняемого задания");
        Scanner y = new Scanner(System.in);
        int Y = y.nextInt();
        Date date = new Date();
        String s2 = S.replace("X", "%1$s").replace("Y", "%2$d")
                .replace("Z", "%3$s").replace("W", "%4$s").replace("V", "%5$s");
        System.out.printf(s2,X,Y,String.format("%1$tH", date),String.format("%1$tM", date),String.format("%1$ts", date));



    }

}
