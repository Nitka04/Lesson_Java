package Homerworks.Homerworks19;

import java.util.Scanner;

//Создать класс калькулятор.
//   В нем создать методы:
//   summ, minus, multiply, division.
//   Сложение, вычитание, умножение и деление соответственно.
//   Каждый метод принимает в качестве параметров два значения типа double.
//   И выводит в консоль результат действия.
//
//   Также в классе есть метод старт. Который выводит сообщение в консоль, что
//   калькулятор запущен. И предлагает ввести действие в вашей консоли.
//
//   Калькулятор должен принимать только следующие типы действий:
//   2+4;    - пример синтаксиса сложения;
//   5-6;    - пример синтаксиса вычитания;
//   25*3;   - пример c умножения;
//   34/3;   - пример синтаксиса деления;
//   После ввода действия на консоль выводится ответ этого действия.
//   И после снова выводится сообщение о предложении ввести действие.
//
//   в случае ввода другого синтаксисана консоль возвращается сообщение:
//   "Введите корректное действие".
//   И после снова выводится сообщение о предложении ввести действие.
//
//   Программа закрывается после ввода команды Stop.
//   Перед закрытием на консоль должно выводится сообщение:
//   "Калькулятор закрыт".
public class Calculyator {
    double a;
    double b;
    double otvet;

    public  void StartCalc (){
        System.out.println("Калькулятор запущен");
    }

    public double summ(double a, double b){
        return otvet= a+b;
    }
    public double minus(double a, double b){
        return otvet= a-b;
    }
    public double multiply (double a, double b){
        return otvet= a*b;
    }
    public double division(double a, double b){
        return otvet= a/b;
    }

    public static void main(String[] args) {
        Calculyator calculyator=new Calculyator();
        int t=0;
        String p="+";
        calculyator.StartCalc();
       while (t==0){
           System.out.println("Введите віражение для расчета");
        Scanner c=new Scanner(System.in);
        String vvod= c.nextLine();
        vvod=vvod.toUpperCase();
        int i=-1;
        Integer ind=vvod.indexOf("+");
            if(vvod.indexOf("+")!=i){
                String rasdel=vvod.replace("+", " ");
                String[] r=rasdel.split(" ");
                System.out.println(calculyator.summ(Double.parseDouble(r[0]),Double.parseDouble(r[1])));
            }else if(vvod.indexOf("-")!=i){
                String rasdel=vvod.replace("-", " ");
                String[] r=rasdel.split(" ");
                System.out.println(calculyator.minus(Double.parseDouble(r[0]),Double.parseDouble(r[1])));}
            else if (vvod.indexOf("*")!=i){
                String rasdel=vvod.replace("*", " ");
                String[] r=rasdel.split(" ");
                System.out.println(calculyator.multiply(Double.parseDouble(r[0]),Double.parseDouble(r[1])));}
            else if (vvod.indexOf("/")!=i){
                String rasdel=vvod.replace("/", " ");
                String[] r=rasdel.split(" ");
                System.out.println(calculyator.division(Double.parseDouble(r[0]),Double.parseDouble(r[1])));}
        else if(vvod.equals("STOP")){
            t++;
        }else {
            System.out.println("Введите корректное действие");}
        }
    }
}
