package Lessons_Topic.OOP.Lesson7.dostyp_modifier1;

public class Class1 {
    //public ДОСТУпен в любом месте прогламмі;
    public String publicString = "publicString";
    //private доступен только внутри данного класса.либо доступ через убличні методі геттери і сеттери;
    private String privateString = "privateString";
    //protected  доступен в данном классе,внутри пакета и вложенніх пакетах,а так же в классах наследниках
    public String protectedString = "protectedString";
    //default якщо не вказувати який класс то данний задається по умолчанію Доступен в данному классе,
    // усі класси усередині цього пакету(папки)
    String defaultString = "defaultString";

    public static void main(String[] args) {
        Class1 fedor = new Class1();
        System.out.println(fedor.privateString);
        System.out.println(fedor.defaultString);
    }
}
