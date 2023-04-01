package Lessons_Topic.OOP.lesson9.interfaceles.ex1;

public class main {
    public static void main(String[] args) {
        Child child = new Child();
        Student student = new Student();
        child.read();
        student.read();
        child.breathe();
        student.breathe();//визов  default  метод без прописівання его у классі чайлд
    }
}
