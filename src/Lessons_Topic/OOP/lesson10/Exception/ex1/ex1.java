package Lessons_Topic.OOP.lesson10.Exception.ex1;

public class ex1 {
    public static void main(String[] args){
        int [] count=new int[5];
       // System.out.println(count[12]); це помилка яку не зможе виконанти програма
        try {
            System.out.println(count[12]);
            //дальше код не будет віполняться если в try поймайл исключение,он переходит в блок cach;
            System.out.println("виключень немає");
        } catch (ArrayIndexOutOfBoundsException name){
            System.out.println(name.getMessage());
        } finally {
            System.out.println("Блок finally");
        }

        System.out.println("сообщения");
    }
}
