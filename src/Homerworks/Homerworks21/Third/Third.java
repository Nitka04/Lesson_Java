package Homerworks.Homerworks21.Third;

import java.util.Arrays;
import java.util.Scanner;

// Создать метод, в котором создается одномерный массив типа int произвольного размера
//от 1 до 30, в котором каждому элементу массива присваивается произвольное значение от
//0 до 30.
//Данный метод спрашивает у пользователя ввести с клавиатуры индекс случайно сгенерированного массива.
//Метод возвращает значение типа double, которое получается при делении элемента с указанным
//индексом пользователя на первый элемент данного массива.
//
//Продумать все возможные исключительные ситуации, которые могут возникнуть в данном методе.
//Для каждой исключительной ситуации создать собственный класс checked исключения.
//Прописать в методе условия генерации данных исключений, а также указать их в сигнатуре данного
//метода.
//
//Обработку исключения осуществить в сторонеем классе Main в котором нужно вызвать данный метод.
public class Third {
    public class NegativeValueException extends Exception {
        public String getMessage() {
            return "Это отрицательное";
        }
    }
    public static int[] randomArray30() {
        int x = (int) (Math.random() * (30 - 1) + 1);
        int[] array = new int[x];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 30);
        }
        return array;
    }

    public static double DivisionArrayElem () throws ZeroExc, LengthOfArray {
       // int[] rand=Third.randomArray30();
        int[] rand={0,33,4,7,44,97,2,6,7,66};
        System.out.println(Arrays.toString(rand));
        System.out.println(rand.length);
        Scanner ch=new Scanner(System.in);
        System.out.println("Введіть число");
        int delit= ch.nextInt();
        if (rand[0]==0) {
            System.out.println("Hello");
            throw new ZeroExc();
        }
        if (rand.length-1<delit){
            throw new LengthOfArray();
        }
        double div=rand[delit]/rand[0];
        return div;
      /* int firsEl =randomArray30()[0]; // виклик єлементу рандомного массиву через його метод.
        int delit = randomArray30()[d];*/
    }

}
