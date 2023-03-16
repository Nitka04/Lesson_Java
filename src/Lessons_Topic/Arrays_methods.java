package Lessons_Topic;

import java.util.Arrays;
import java.util.Collections;

//импортируем класс Arrays для доступа к его методам
public class Arrays_methods {
    public static void main(String[] args) {
        int[] ints = {1054, 2, 73, 4, 15, 6};
        //sort() - сортировка по возрастанию
        /*Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));*/
        //Для сортировки по убыванию массива примитивных типов данных прямого метода нет

        //можно воспользоваться методом класса Collections, но для этого нужно создать массив
        //из объектов соответствующего класса обертки
        /*Integer[] ints2 = new Integer[ints.length];
        for (int i = 0; i < ints.length; i++) {
            ints2[i] = ints[i];
        }
        Arrays.sort(ints2, Collections.reverseOrder());
        System.out.println(Arrays.toString(ints2));*/

        //toString() - приводим массив к строковому типу и можем отобразить его содержимое

        //fill() заполняет массив указанным элементом
        /*int[] ints3 = new int[4];
        Arrays.fill(ints3, 12);
        System.out.println(Arrays.toString(ints3));*/
        //также можно указать диапазон идексов, внутри которых будет назаначение
        //элементам массива какзанного значения.
        /*int[] ints4 = new int[4];
        Arrays.fill(ints4, 2, 3, 12);
        System.out.println(Arrays.toString(ints4));*/

        //binarySearch() - можно получить индекс элемента по его значению
        String[] strings = {"cast", "trust", "past"};
        /*System.out.println(Arrays.binarySearch(ints4, 12));
        System.out.println(Arrays.binarySearch(strings, "trust"));*/

        //equals() - есть возможность сравнивать массивы между собой. массиві разной
        // размерности будут разніе
        //з двомірними массивами Arrays.deepEquals();
        /*String[] strings2 = {"cast", "trust", "past"};
        boolean result = Arrays.equals(strings, strings2);
        System.out.println(result);*/

        //copyOf() метод возвращающий новый массив на основе массива переданного в параметры метода
       /* String[] strings3 = {"cast", "trust", "past", "last"};
        String[] strings4 = Arrays.copyOf(strings3, 4);// цифра вказує розмірність массиву
        String[] strings5 = Arrays.copyOf(strings3, 7);// якщо більши копіюючого массива значення інших елементів будуть "нуль"
        String[] strings6 = Arrays.copyOf(strings3, 2);//якщо менше копюючого массива то обріже его до нового массива
        System.out.println(Arrays.toString(strings6));*/

        /*int[] intsNext = {1, 234, 4, 66};
        int[] intsNextInnts = Arrays.copyOf(intsNext, 5);
        System.out.println(Arrays.toString(intsNextInnts));*/

        //System.arraycopy() - специальный метод для копирования массивов
        //первый параметр - это массив из которого нужно копировать данные,
        //второй параметр - индекс элемента массива с которого мы начинаем копирование
        //третий параметр - массив в который мы будем вставлять элементы
        //четвертый параметр -индекс элемента массива с которого мы начинаем вставлять скопированные данные
        //пятый параметр - количество копируемых элементов
        /*int[] systArrcopyOne = new int[10];
        int[] systArrcopyTwo = {2, 44, 12, 54, 333, 235, 1};
        //(звідки копіювати, з якого номера копіюєм , куди копіювати, з якого індикса починати копіювати в новому массиві, скільки єлементів копіювати
        System.arraycopy(systArrcopyTwo, 2, systArrcopyOne, 3, 4);
        System.out.println(Arrays.toString(systArrcopyOne));*/

        //deepToString() - позвлляет вывести на экран многомерные массивы
       /* String[][] doubleArray = {
                {"one", "two", "three"},
                {"four", "five", "six"},
                {"seven", "eight", "nine"}
        };
        System.out.println(Arrays.deepToString(doubleArray));
        int[][][] threeAr = {
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                },
                {
                        {10,11,12},
                        {13,14,15},
                        {16,17,18}
                },
                {
                        {19,20,21},
                        {22,23,24},
                        {25,26,27}
                }
        };
        System.out.println(Arrays.deepToString(threeAr));*/


    }
}






