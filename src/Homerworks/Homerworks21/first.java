package Homerworks.Homerworks21;

import java.util.Scanner;

//Создайте метод, который просит у пользователя ввести с клавиатуры число
//и делит данное число на другое случайно сгенерированное число в диапазоне от -10
//до 10.
//Исключительная ситуация должна возникать, если сгенерированное число равно нулю,
//а также если полученное частное двух чисел принимает отрицательное значение.
//Если сгенерированное число не равно нулю, то в любом случае данный метод
//выводит в консоль информацию о том какое число было введено пользователем, какое число было
//сгенерировано, и какое число получится при делении одного числа на другое.
//Все исключительные ситуации обработать внутри метода.
public class first {
    public static class DivisionNegative extends Exception {
        public String getMessage() {
            return "Часне приймає негативне значення";
        }
    }

    public static void main(String[] args) throws /*ArithmeticException,*/ DivisionNegative {
        System.out.println("Введить число:");
        Scanner ch = new Scanner(System.in);
        int chislo = ch.nextInt();
        int x = (int) ((Math.random() * (10 - (-10)) - 10));
        if (x==0){
            try {
                throw new ArithmeticException();
            }catch (ArithmeticException k){
                System.out.println("На нуль ділити не можна.");
            }}else {
            int div=chislo/x;
          try{
              if (div<0){
                  throw new  DivisionNegative();}
          } catch (DivisionNegative e){
               System.out.println(e.getMessage());}
           finally {
              System.out.println("Ділене ="+chislo+"\nДільник="+x+"\nЧастное="+div);
          }}

    }
}
