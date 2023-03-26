package Lessons_Topic.OOP.lesson9;


public class Telegram extends Messenger {
    public Telegram(int space){
        super("Telegram", 1.0, space);
    }
    public Telegram() {
        super();
    }
    @Override
    public void launch() {
        System.out.println("Ваш телеграм запущен");
    }

    public void shutDown() {
        System.out.println("Ваш телеграм закріт");
    }

    public boolean canMakeVideoCall(){
        System.out.println("Я не могу делать відео звонок");
        return true;
    }
    public void getInfo(){
        System.out.println("Имя преложения"+super.getName());
        System.out.println("Версия приложения " + super.getVersion());
        System.out.println("Размер приложения " + super.getSpace());
    }
}










