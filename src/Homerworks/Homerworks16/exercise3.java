package Homerworks.Homerworks16;

import java.util.Scanner;

//3)(Использовать операторы if-else-if)
//Пользоватьель вводит с клавиатуры числа:
//Если число равно 1, то выводин на консоль "Понедельник";
//Если число равно 2, то выводин на консоль "Вторник";
//Если число равно 3, то выводин на консоль "Среда";
//Если число равно 4, то выводин на консоль "Четверг";
//Если число равно 5, то выводин на консоль "Пятница";
//Если число равно 6, то выводин на консоль "Суббота";
//Если число равно 7, то выводин на консоль "Воскресенье";
//В противном случае выводим текст:
//"Лучше бы сегодня была пятница".
public class exercise3 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner day=new Scanner(System.in);
        int d=day.nextInt();
        if (d==1){
            System.out.println("Понедельник");}
        else if (d==2){
            System.out.println("Вторник");}
            else if(d==3){
            System.out.println("Среда");}
                   else if(d==4){
                        System.out.println("Четверг");}
                        else if (d==5){
                            System.out.println("Пятница");}
                            else if (d==6){
                                 System.out.println("Суббота");}
                                 else if (d==7){
                                      System.out.println("Воскресенье");}
        else {
            System.out.println("Лучше бы сегодня была пятница");
        }
    }
}
