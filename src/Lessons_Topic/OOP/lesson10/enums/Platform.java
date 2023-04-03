package Lessons_Topic.OOP.lesson10.enums;

public enum Platform {IOS("IOS"),ANDROID("ANDROID");
    String name;

    Platform(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
