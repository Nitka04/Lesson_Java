package Lessons_Topic.OOP.lesson9.nasled;


public class Telegram extends Messenger {
    // создаем конструктор чтобі избежать конфликта. Но можно создавать конструкторі
    //либо заполнить по родительскому методу либо задать частично параметрі
    // иніе оставить свободніми для дальнейшегго заполнения

    public Telegram(int space){
        super("Telegram", 1.0, space);
    }
   //візов родительского конструктора через словао  super().

    public Telegram() {
        super();
    }
    // @Override-указівается при определения  родительского метода
    @Override
    //переопределение родительского метода
    public void launch() {
        System.out.println("Ваш телеграм запущен");
    }
    //переопределение родительского метода
    public void shutDown() {
        System.out.println("Ваш телеграм закріт");
    }
    //переопределение родительского метода
    public boolean canMakeVideoCall(){
        System.out.println("Я не могу делать відео звонок");
        return true;
    }
    public void getInfo(){
        //super. візівает родительский метод.
        System.out.println("Имя преложения "+super.getName());
        System.out.println("Версия приложения " + super.getVersion());
        System.out.println("Размер приложения " + super.getSpace());
    }
}










