package Lessons_Topic.OOP.lesson9.staticles.StatikPeremIMetod;

public class Main {
    public static void main(String[] args) {
        //візваем статические классі на прямую их видит без обїекта класса
        System.out.println(JustClass.staticInt);
        // візов не статическогоо метода без обїекта класса не получиться відаст конфликт
        //System.out.println(JustClass.nonStaticInt);
        //необходимо создать обект класса для доступа не к статическому метода
        JustClass justClass = new JustClass();
        justClass.nonStaticMethod();
        justClass.staticMethod();
    }
}
