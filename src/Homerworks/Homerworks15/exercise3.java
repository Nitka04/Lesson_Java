/*Пользователь вводит с клавиатуры свой год рождения.
На консол выводится информация о его возрасте.
(P.s пока не затрагиваем момент месяца рождения,
останавливаемся только на разнице годов. Если вам
вдруг понадобится преобразовать тип String в int,
то можете воспользоватьсятакой конструкцией
Integer.parseInt(строка для преобразования).*/
package Homerworks.Homerworks15;

import java.util.Date;
import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        System.out.println("Введите свой год рождения");
        Scanner god=new Scanner(System.in);
        int g=god.nextInt();
        Date date=new Date();
        String d = String.format("%1$tY", date);
        int d2=Integer.parseInt(d);
        System.out.println("Ваш возраст "+(d2-g));
    }
}
