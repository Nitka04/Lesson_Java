package Lessons_Topic.OOP.lesson9.finalKeyWord;

public class ClassFinal {
    //final при константе не дает ее более изменить используют для использовании константі
    // метод со словом final так же нельзя переопределить
    // если класс final также нельзя наследование делать
    public final int finalInt =31;
    public  void finalMethod(){
        System.out.println("Final Method");
    }
}
