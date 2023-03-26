package Lessons_Topic.OOP.Lesson7;

public class Computer {
    //у класс могут бути:
    //1.  Данні (поля)
    //2. Дії які він може робити (методи);
    public String name;
    public int price;
    public int ram;
    public int video;
    public boolean mouseInclude;

    public int getPrice() {
        return price;
    }// повертає значення переменної

    public void setPrice(int price) {
        this.price = price;
    }// метод void нічого не возвращає він тільки назначає.

    public int getRam() {
        return ram;
    }// повертає значення переменної
    public void setRam(int ram) {
        this.ram = ram;
    }// метод void нічого не возвращає він тільки назначає.

    public int getVideo() {
        return video;
    }// повертає значення переменної

    public void setVideo(int video) {
        this.video = video;
    }// метод void нічого не возвращає він тільки назначає.

    public String getName(){ // метод которій ничего не принимает но возвращает значение
        return name;
    }// повертає значення переменної

    public void setName(String vasia){// метод не возвращает но принимает значение;
        this.name=vasia;
    }// метод void нічого не возвращає він тільки назначає.
    public int plus (int number1,int number2){//принимает параметрі и возвращает значения
        return number1+number2;
    }
    public String helloWord(){// ничего не принимает но возвращает сроку;
        String hello= "hello world";
        return hello;
    }
    public boolean getMouseInclude(){
        return mouseInclude;
    }
    public void setMouseInclude(boolean mouse){
        this.mouseInclude=mouse;
    }
}

