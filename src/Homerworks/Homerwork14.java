package Homerworks;

public class Homerwork14 {
    public static void main(String[] args) {
        // задание 1

        int a = 7;
        int b = 9;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        // задание 2
        double chislitel = 7.0;
        double znamenatel = 5.0;
        int d = (int) (chislitel / znamenatel);
        int o = (int) (chislitel % znamenatel);
        int k = (int) (znamenatel);
        System.out.println("Целая часть равна " + d);
        System.out.println("Остаток от деления равен " + o);
        System.out.println("Знаменатель равен " + k);

        // 3 задание
        String string1 = "This line that i want to cut, cause it is too long";
        String string2 = string1.substring(0, 35);
        String string3 = string2 + " it is perfect.";
        System.out.println("string1: " + string1);
        System.out.println("Длина string1:" + string1.length());
        System.out.println("string2: " + string2);
        System.out.println("Длина string2:" + string2.length());
        System.out.println("string3:" + string3);
        System.out.println("Длина string3:" + string3.length());
        // 4 задание
        String string5 = "Testing, is my favourite job";
        String word1 = string5.split(" ")[0];
        word1=word1.replace(",", "");
        String word2 = string5.split(" ")[1];
        String word3 = string5.split(" ")[2];
        String word4 = string5.split(" ")[3];
        String word5 = string5.split(" ")[4];
        boolean longer=(word1.length()>word2.length()&&word1.length()>word3.length()&&word1.length()>word4.length()&&word1.length()>word5.length());
        System.out.println("word1:" + word1);
        System.out.println("Длина word1:" + word1.length());
        System.out.println("word2:" + word2);
        System.out.println("Длина word2:" + word2.length());
        System.out.println("word3:" + word3);
        System.out.println("Длина word3:" + word3.length());
        System.out.println("word4:" + word4);
        System.out.println("Длина word4:" + word4.length());
        System.out.println("word5:" + word5);
        System.out.println("Длина word5:" + word5.length());
        System.out.println(longer);


        // 5 задание Зная из урока что при применении к массиву строк метода
        // length, можно узнать сколько
        //   элементов находится в массиве. Попробовать вывести на
        //экран какое количество раз
        //   символ 'a' встречается в данной строке:
        //   Completely random text in English. In it, we just
        // need to determine how many times the character 'a' occurs
        // there. And we can use the split method and the length method.
        //   Решить данную задачу с использованием метода split,
        //   а также с учетом верхнего и нижнего регистра символа 'a'.
        String string6 = "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there." +
                " And we can use the split method and the length method.";
        String str=string6.toLowerCase();
        String[] words = str.split("a");
        System.out.println("Символ а встречается "+(words.length-1)+" раз");



    }
}


