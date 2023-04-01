package Lessons_Topic.OOP.lesson9.staticles.Ex4;

public class ClassA {
    public ClassA(){
        System.out.println("Конструктор класса А");
    }
    {//динамический блок
        System.out.println("Динамический блок класса А");
    }
    static {
        System.out.println("Статический блок класса А");
    }
}
