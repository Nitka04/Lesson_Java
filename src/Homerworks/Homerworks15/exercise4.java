package Homerworks.Homerworks15;

import java.util.Scanner;

//4)Вывести следующие сообщения в отформатированном виде (необходимо добавить спецификаторы формата):
//    а) Строка: Чтобы написать код нам нужны
//1)Язык программирования 2)Среда разработки 3)Воодушевление
//       Вывод: Чтобы написать код нам нужны
//              1)Язык программирования
//              2)Среда разработки
//              3)Воодушевление
//
//    б) Строка: Число {X} больше {Y}, и это {True/False}
//       Для аргументов создаем отдельно переменные.
//       Вместо {X},{Y},{True/False} вставляем необходимые
//спецификаторы формата.
//       Вывод: Число 5 болшье 7, и это false.
public class exercise4 {
    public static void main(String[] args) {
        System.out.printf("Чтобы написать код нам нужны %n1)Язык программирования %n2)Среда разработки %n3)Воодушевление%n");
        System.out.printf("Введите число Х");
        String u="Число {X} больше {Y}, и это {True/False}";
        Scanner x=new Scanner(System.in);
        int X=x.nextInt();
        System.out.printf("Введите число Y");
        Scanner y=new Scanner(System.in);
        int Y= y.nextInt();
        boolean k=X>Y;
        String u2=u.replace("{X}", "%1$d").replace("{Y}", "%2$d")
                        .replace("{True/False}","%3$b");
        System.out.printf(u2,X,Y,k);

    }
}
