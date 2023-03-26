package Lessons_Topic;

import java.util.Scanner;

public class arraysMASSIV {
    public static void main(String[] args) {
        //Массив – это структура данныx, хранящее определенное количество элементов одного типа.
        //По умолчанию все значения массива 0, либо null в зависимости от типа объекта
        //Способы инициализации массива:

        //1)Вручную:
        /*int[] array=new int[4];
        array [0]=14;
        array [1]=3;
        array [2]=13;
        array [3]=16;
        for(int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }*/

        //2)for
        /*int[] array=new int[4];
        for(int i=0;i<array.length;i++) {
            array[i]=i*2;
            System.out.println(array[i]); }*/

        //3){}-прямое указание массива;
        /*int[]array={12, 3, 4, 66};
        System.out.println(array.length);

        String[]arrayString={"first", "Second", "Third"};
        arrayString[1]="не  Second";
        System.out.println(arrayString[1]);*/

        //Пользователь вводит строку с клавиатуры. Все цифры из данной строки
        //должны быть помещены в массив. Массив необходимо отсортировать по возрастанию
        //и вывести на экран.
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String st = in.nextLine();
        String result = "";
        //System.out.println(st.split("\\d").length);
        //проверяем что в данном массиве есть хоть одно числовое значение
        if (st.split("\\d").length <= 1) {
            System.out.println("В данной строке нет цифр");
        } else {
            //проходимся по всем символам строки.
            for (int i = 0; i < st.length(); i++) {
                if (Character.isDigit(st.charAt(i))) {
                    result = result + st.charAt(i);
                    if (i + 1 != st.length() && Character.isDigit(st.charAt(i + 1))) {
                        while ((i + 1 != st.length()) && Character.isDigit(st.charAt(i + 1))) {
                            i = i + 1;
                            result = result + st.charAt(i);
                        }
                    }
                    result = result + " ";
                }
            }
        }
        //System.out.println(result);
        String[] numbers = result.split("\\s");
        int[] finalarray = new int[result.split("\\s").length];
        for (int w = 0; w < numbers.length; w++) {
            finalarray[w] = Integer.valueOf(numbers[w]);
            System.out.println(finalarray[w] + " ");
        }
        for (int i = finalarray.length - 1; i >= 0; i--) {
            int max;
            for (int a = i - 1; a >= 0; a--) {
                if (finalarray[i] < finalarray[a]) {
                    max = finalarray[a];
                    finalarray[a] = finalarray[i];
                    finalarray[i] = max;
                }
            }
        }
        System.out.println("");
        for (int i = 0; i < finalarray.length; i++) {
            System.out.println(finalarray[i] + " ");
        }
*/
        // поиск максимального значения массива
        int[] array={2, 4, 8, 12, 45,2,55};
        int max=array[0];
        for(int x:array){
            if(x>max){
                max=x;
            }
        }
        System.out.println(max);


        // Многомерные массивы.
        // Двумерный массив – это массив массивов.
            String[][] numbers = {{"1afs", "2asf", "3af"}, {"4af", "5af", "6afa"}, {"7asf", "8afs", "9assaf"}};
           //цикл foreach прописівает для каждого єлемента массива
            for (String[] arraynumbers : numbers) {
                for (String number : arraynumbers) {
                    System.out.print(number + " ");
                }
                System.out.println("");
            }
            int[][] x = new int[3][6];
            int[][] numbers2 = {
                    {1, 2, 3, 4, 5},
                    {6, 7},
                    {8, 9, 10, 11, 13}

            };
            for (int[] arraynumbers : numbers2) {
                for (int number : arraynumbers) {
                    System.out.print(number + " ");
                }
                System.out.println("");
            }


        //Пользователь задает размерность двумерного массива с клавиатуры.
        //Массив заполняется случайными числами от 0 до 1000.
        //Необходимо создать одномерный массив, состоящий из максимальных значений
        //каждого отдельного массива входящего в двумерный.
        //Новый полученный массив вывести на экран.
            /*Scanner in = new Scanner(System.in);
            System.out.println("Введите две цифры");
            int a = in.nextInt();
            int b = in.nextInt();
            int[][] array = new int[a][b];
            //foreach не может быть использован для внесений изменений в массив.
        for(int[] ints:array){
            for(int single:ints){
                single = (int) (Math.random() * 1000);
            }
        }
            for (int[] ints : array) {
                for (int i = 0; i < ints.length; i++) {
                    ints[i] = (int) (Math.random() * 1000);
                }
            }

            int[] finalArray = new int[a];
            for (int i =0; i<a;i++){
                int max= array[i][0];
                for(int c=0;c<array[i].length;c++){
                    if(array[i][c]>max){
                        max=array[i][c];
                    }
                }finalArray[i]=max;
            }

            for (int[]ints:array){
                for (int single:ints){
                    System.out.print(single+" ");
                }
                System.out.println("");
            }
            System.out.println("");
            for (int single:finalArray){
                System.out.print(single+" ");
            }
            System.out.println("\n");

            System.out.println(Arrays.deepToString(array));
            System.out.println(Arrays.toString(finalArray));*/
        }
    }






