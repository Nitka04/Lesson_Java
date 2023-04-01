package Lessons_Topic.OOP.lesson9.interfaceles.ex1;

public class Student implements GetInfo{
    //реалізація усіх методів інтерфейсів
    public void read() {
        System.out.println("Читает быстро");
    }
    public void listen(){
        System.out.println("Слушает внимательно");
    }
    public void watch(){
        System.out.println("Смотрит дискавери");
    }
}
