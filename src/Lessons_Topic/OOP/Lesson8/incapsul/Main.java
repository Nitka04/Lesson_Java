package Lessons_Topic.OOP.Lesson8.incapsul;

public class Main {
    public static void main(String[] args) {
        Student ivan = new Student("Вася",33,true,"AQA");//використання конструктора.
        ivan.setName("Іван");//Задаем имя переменной через сеттер
        //System.out.println(ivan.getAge()+" "+ivan.getName());

        //System.out.println(ivan.getName());
        //System.out.println(ivan.getAge()+" "+ivan.getName());
        ivan.getInfo();//використовиваємо публічний метод,в середині якого приватні за межами класса.Це інкапсуляція.
        Student x = new Student();
        x.getInfo();
        //визов конструктора нижче
        Student alona = new Student("Alona","Developer",32,false);
        alona.getInfo();

    }
}
