package Lessons_Topic.OOP.Lesson8.constructor_task;

public class Human {
    private String name;
    private Auto auto;//т.к. класс авто уже создан то его можно використовувати як обїкт

    public Human(String name, Auto auto) {
        this.name = name;
        this.auto = auto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }
}
