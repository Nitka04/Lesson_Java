package Lessons_Topic.OOP.Lesson7;

public class main {
    public static class Main {
        public static void main(String[] args) {
            Computer computer = new Computer();
            computer.name="Asus";
            System.out.println(computer.getName());
            computer.setName("Apple");// обїект змінив назву попередньої назви не існує
            System.out.println(computer.getName());

            Computer computer2 = new Computer();
            computer2.name="Asus";

            System.out.println(computer2.name+computer.name);
            System.out.println(computer.plus(4,5));
            System.out.println(computer2.plus(4,5));
            System.out.println(computer.helloWord());
            computer.setMouseInclude(true);
            System.out.println(computer.getMouseInclude());

        }
    }
}
