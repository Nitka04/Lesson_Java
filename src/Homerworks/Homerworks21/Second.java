package Homerworks.Homerworks21;

import java.util.ArrayList;

// Написать метод в котором будет создан бесконечный цикл по заполнению
//саморасширяющегося массива с типом Integer. Первое значение элемента массива должно быть 2147483638,
//и с каждой итерацией цикла значение элемента массива должно увеличиваться на 1.
//Т.е. значение второго элемента массива 2147483639, третьего 2147483640 и т.д.
//
//Исключительная ситуация должна возникать когда значение элемента массива будет превышать максимально
//допустимое значение типа int.
//Генерация этого типа исключения в теле бесконечного цикла должно помочь выйти из данного цикла.
//
//Обработку исключительной ситуации необходимо также осуществить в теле данного метода.
//
//Данный метод должен в любом случае выводить в консоль данный саморасширяющися массив.
public class Second {
    private static class RuntimeException extends Exception{
        public String getMessage(){
            return "Значення Integer перевищело свій допустимий розмір.";
        }
    }
    public static void main (String[] args) {
        ArrayList <Integer> dins=new ArrayList<>();
        dins.add(2147483638);
       /*for(int i =1; i<11; i++) */ //цикл аповненя дінаміческого массиву.
        int i=0;
        while (true){
               int k=dins.get(i)+1;
           if (k==-2147483648){
               try {
                   throw new RuntimeException();
               }catch (RuntimeException e ){
                   System.out.println(e.getMessage());
               }
               break;
           }
           dins.add(k);
          i++;
        }
        System.out.println(dins);
    }
}
