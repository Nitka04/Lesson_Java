package Homerworks.Homerworks18;
//Написать перегруженный метод, который может:
//  - не принимать никаких значений, тогда он будет выводить на консоль
// сообщение типа:"Я пустой".
//  - Принимать в качестве параметров String, тогда он будет выводить
// на консоль это сообщение.
//  - Принимать в качестве параметров массив строк, тогда он будет выводить
// на консоль все его значения через пробел.
//  - Принимать в качестве параметра массив чисел, тогда он будет выводить
// на консоль сумму элементов массива.
//  - Принимать в качестве параметров число и строку, тогда он будет
//выводить на консоль сообщение типа:
//    "Ваше сообщение - "%%%%%%%%", ваше число -  $",
//    где "%%%%%%%%" и $ ваши введенные строка и число соответственно.
public class exercise4 {

    public static void vivod (){
        System.out.println("Я пустой");
    }
    public static void vivod (String str){
        System.out.println(str);
    }
    public static void vivod (String[] masiv){
        for (int l = 0; l < masiv.length; l++){
            System.out.print(masiv[l]+" ");}
    }
    public static void vivod (int[] masivch){
        int sum=0;
        for (int l = 0; l < masivch.length; l++){
           sum+=masivch[l];
        }
        System.out.println(sum);
    }
    public static void vivod (int ch, String str){
        System.out.println("Ваше сообщение - \""+str+"\""+", ваше число - \""+ch+"\"");
    }
    public static void main(String[] args) {
        vivod(14,"Я молодець");
    }
}
