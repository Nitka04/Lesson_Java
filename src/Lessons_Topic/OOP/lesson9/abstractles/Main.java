package Lessons_Topic.OOP.lesson9.abstractles;

public class Main {
    public static void main(String[] args) {
        //абстрактній класс не может біть реализован мі не можем создать
        //об'ект абстрактного класа
        //Vehicles vehicles = new Vehicles();
        Ship ship = new Ship();
        ship.inter();
        ship.move();
    }
}
