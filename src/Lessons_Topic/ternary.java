package Lessons_Topic;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        // критичный состоит из 2х значений
        //синтаксис:
        // условие ? выражение1 : выражение2
        // оператор будет возвращать выражение 1, если условие = true
        // оператор будет возвращать выражение 2, если условие = false
        // тернарный оператор должен пригимать значение.

        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int age = in.nextInt();
        System.out.println(age<18?"Вы несовершеннолетний гражданин":"Вы совершеннолетний гражданин");*/

        //Т.к. тернарный оператор возвращает значение, то при помощи него можно присваивать
        // значения переменным

       /* boolean isNew = false;
        int costOfAuto = isNew?2000:1000;
        System.out.println(costOfAuto);*/

        //Есть возможность использовать множественные тернарный оператор:
        //допустим нужно определить входит ли введенное число в
        // интервал от 5 до 100 включительно
        /*Scanner ch = new Scanner(System.in);
        System.out.println("Введите число");
        int num = ch.nextInt();
        String positive="Число "+num+" входит в диапазон от 5 до 100";
        String negat="Число "+num+" не входит в диапазон от 5 до 100";
        String result=num<5?negat:num>100?negat:positive;
        System.out.println(result);*/

        //При помощи тернарного оператора можно производить операции
        //Необходимо получить разность двух чисел введенных с клавиатуры,
        //и всегда отнимать от большего меньшее
       /* Scanner number = new Scanner(System.in);
        System.out.println("Введите 2 число");
        int num = number.nextInt();
        int num2=number.nextInt();
        System.out.println(num>num2?num-num2:num2>num?num2-num:0);*/

        //пользователь вводит с клавиатуры два числа и символ
        //- или + или % или / или *
        //На экран выводится резултат действия над двумя введенными числами.
        //Если пользователь ввел что-то кроме данных символов, то необходимо вывести 0.
        Scanner number = new Scanner(System.in);
        System.out.println("Введите 2 числа  и любой из данных символов -,+,%,/,*");
        int num = number.nextInt();
        int num2=number.nextInt();
        String sim=number.next();
       // или  trim уберет пробел в конце символа которій не считівался String sim=number.nextLine().trim();

        System.out.println(sim.equals("-")?num-num2:sim.equals("+")?num+num2:sim.equals("%")?
               num%num2:sim.equals("/")?num/num2:sim.equals("*")?num2*num:0);
    }
}
