package Lessons_Topic.OOP.lesson9.interfaceles.ex1;

public interface GetInfo {
    //в интерфейсе есть тільки перелік методів без їх реалізації
    void read();
    void listen();
    void watch();
// метод через  default  можно реализовать метод
    default void breathe(){
        System.out.println("Я умею дышать");
    }
}
