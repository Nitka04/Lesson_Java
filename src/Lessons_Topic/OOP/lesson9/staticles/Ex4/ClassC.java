package Lessons_Topic.OOP.lesson9.staticles.Ex4;

public class ClassC extends ClassB {
    public ClassC(){
        System.out.println("Конструктор класса C");
    }
    {
        System.out.println("Динамический блок класса C");
    }
    static {
        System.out.println("Статический блок класса C");
    }
}
