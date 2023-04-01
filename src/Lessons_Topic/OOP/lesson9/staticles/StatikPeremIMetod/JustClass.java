package Lessons_Topic.OOP.lesson9.staticles.StatikPeremIMetod;

public class JustClass {
    public static String staticString;
    public static int staticInt;

    public String nonStaticString;
    public  int nonStaticInt;

    public static void staticMethod(){
        System.out.println("Static method");
        //візов нестатического метода внутри статического не возможно
        //nonStaticMethod();
        //System.out.println(staticInt+" "+nonStaticInt);
    }
    public void nonStaticMethod(){
        System.out.println("NonStatic method");
        // внутри нестатического класс можно візвать статический.наоборот нельзя
        staticMethod();
        System.out.println(staticInt+" "+nonStaticInt);
    }

}
