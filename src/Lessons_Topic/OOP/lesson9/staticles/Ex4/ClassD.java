package Lessons_Topic.OOP.lesson9.staticles.Ex4;

public class ClassD extends ClassC {
    public ClassD(){
        System.out.println("Конструктор класса D");
    }
    {
        System.out.println("Динамический блок класса D");
    }
    static {
        System.out.println("Статический блок класса D");
    }
}
