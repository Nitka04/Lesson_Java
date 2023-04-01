package Lessons_Topic.OOP.lesson9.staticles.StaticBlock;

public class Mai {
    public static void main(String[] args) {
//        JustClassStaticBlock justClassStaticBlock = new JustClassStaticBlock();
        // при запуске любого метода. Сначала віполняться все статические
        //блоки данного класса и только потом заданий метод
        JustClassStaticBlock.thisISMonday();
        JustClassStaticBlock justClassStaticBlock = new JustClassStaticBlock();
    }
}
