package Homerworks.Homerworks18;

import java.util.Scanner;

//Используя рекурсию напишите метод, который будет выводить введенное число в обратном порядке, так чтобы каждая
//  цифра писалась два раза, после ставился пробел, и вторая цифра тоже писалась два раза и после ставился пробел...
//  Пример: вы вводите 563
//  вывод будет следующий 33 66 55
public class exercise3 {

   static void recurciay (int ch){
       System.out.print(ch%10+""+ch%10+" ");
        if(ch/10==0){}
        else{
            ch=ch/10;
            recurciay(ch);
        }
    }
    public static void main(String[] args) {
        System.out.println("Введіть число для рекурсіі:");
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        recurciay(n);



    }
}
