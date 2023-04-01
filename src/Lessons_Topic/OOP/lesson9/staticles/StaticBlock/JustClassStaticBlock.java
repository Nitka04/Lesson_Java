package Lessons_Topic.OOP.lesson9.staticles.StaticBlock;

public class JustClassStaticBlock {
    static String day;



    static void thisISMonday(){
//        day= "Monday";
        System.out.println("But today is "+day);
    }
    //статический блок отрабатівается самій первій при запуске любого метода из данного класса
    // и отрабатівает только один раз.
    static {
        day = "Friday";
        System.out.println("I love " + day);
    }
    //статичекий блок візівается без создания об`eкта класс
    static {
        day = "Tuesday";
        System.out.println("I love " + day);
    }
}
