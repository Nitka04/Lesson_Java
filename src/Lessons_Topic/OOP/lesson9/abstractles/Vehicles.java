package Lessons_Topic.OOP.lesson9.abstractles;

public abstract class Vehicles {
    //если в классе есть хотябі один абстрактній метод то класс
    //должен біть тоже об'явлен абстрактнім
    String name;

    void takeFuel() {
        System.out.println("Я заправился");
    }
    abstract void move();
    //нет конфликта так как название метода совпадает с методам из интерфейса.
    abstract void inter();
}

