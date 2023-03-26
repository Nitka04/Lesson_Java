package Lessons_Topic.OOP.lesson9;

public class Messenger {
    public String name;
    public double version;
    private int space;
    public  void launch() {
        System.out.println("Ваш мессенджер запущен");
    }
    public void  shutDown(){
        System.out.println("Ваш мессенджер закріт");
    }
    public boolean canMakeVideoCall(){
        System.out.println("Я не могу делать відео звонок");
        return false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public String getName() {
        return name;
    }

    public double getVersion() {
        return version;
    }

    public int getSpace() {
        return space;
    }

    public Messenger (String name,double version, int space){
        this.name=name;
        this.version=version;
        this.space=space;
    }


    public Messenger(){
        this.space=500;
    }
}
