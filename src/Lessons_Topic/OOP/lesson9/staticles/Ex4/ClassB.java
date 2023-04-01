package Lessons_Topic.OOP.lesson9.staticles.Ex4;

public class ClassB extends ClassA {
    public ClassB(){
        System.out.println("Конструктор класса B");
    }

    {
        System.out.println("Динамический блок класса B");
    }

    static {
        System.out.println("Статический блок класса B");
    }
}
