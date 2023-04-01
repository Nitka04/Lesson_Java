package Lessons_Topic;

public class StringMethods {
    public static void main(String[] args) {
        // valuof -возвращае  строковое представление значение примитивніх типов
        /*  int w =3;
        System.out.println(String.valueOf(w));
        System.out.println(w);
        //print -не переносит на новую строку
        System.out.print(w);
        System.out.print(w); */

        // символі єкранирования \n - перенос; \", \', \b/

        /*System.out.println("я тестирую \b как боженька");
        int a =12;
        int b =32;
        int c= 33;
        System.out.println (a+","+b+","+c+"."); */

        // все методі классса System.out.println класса стринг не изменяют строку, а возвращают ссілку на новій обїект
        //  concat  производит слияние строк
        String string="I love testing very much";
        String string2=string.concat(" today");
        String string3=string+" today";
        System.out.println("concat="+string2);
        System.out.println(string3);
        // сharAt - возвращает символ из строки по указанному символу
        // первій символ будет "0", java считает с 0
        String string22="";
        char ch =string.charAt(4);
        System.out.println("сharAt="+ch);
        // contains- возвращает истину если в строке хотябі
        // раз встречается указанная строка
        boolean result8=string.contains("love");
        System.out.println("contains="+result8);
        // length - возвращает количесство символов строки
       int x= string.length();
        System.out.println("length="+x);
        // isEmpty -если строка пустая возвращает истину если нет лож
         boolean result=string.isEmpty();
        System.out.println("isEmpty="+result);
        //starsWith- возвращает истину если указанній символ или строк
        // совпадают с началом строки
        //endsWith- аналогичтно,starsWith только наоборот
        boolean result2=string.startsWith("I love");
        boolean result3= string.endsWith("h");
        System.out.println(ch);
        System.out.println("startsWith="+ result2);
        System.out.println("endsWith="+result3);

// toLowerCase - возвращает строку в нижнем регистре
// toUpperCase- возвращает строку в верхнем решистре
        System.out.println("toLowerCase="+string.toLowerCase());          System.out.println(string);
        System.out.println("toUpperCase="+string.toUpperCase());
        // indexOf -ищет указанній символ начиная с начала строки
        // возвращает индекс первого найденого по порядку совпадающего символа
        // если совпадений нет , возвращает -1
        //  lastIndexOf ищет с конца
        int index=string.indexOf('w');
        System.out.println("indexOf="+index);
        //substring - вірезает указанній промежуток символов
        // возвращает новую строку
        String string31 =string.substring(7,20);
        System.out.println("substring="+string31);
        // replace- вовращает строку , заменяя указанніе символі и строки
        String string4 =string.replace("ch","ch because");
        System.out.println("replace="+string4);
        //split  разбивает на массив строк
String  i=string.split(" ")[0] ;
String love =string.split(" ")[1];
String testing =string.split(" ")[2];
        System.out.println("split="+i);
        System.out.println(love);
        System.out.println(testing);
        // trim убирает начальніе и конечніе пробелі
        System.out.println(string);
        System.out.println("trim="+string.trim());

        String String_1 = "I am testing like a god";
        String String_2 = " the best of the best.";
        char ch1=String_1.charAt(6);
        String ch2=String.valueOf(ch1);
        int index1=String_1.indexOf('e');
        boolean result_2=String_2.contains(ch2);
        System.out.println("index1="+index1);
        System.out.println("Строка\" "+String_2+ "содержит в себе символ "+ch+"и єто "+result_2+
                " символ 'е' находиться в строке под номером "+index1);


    }
}
