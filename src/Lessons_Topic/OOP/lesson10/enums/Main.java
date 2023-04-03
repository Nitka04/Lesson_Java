package Lessons_Topic.OOP.lesson10.enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите платформу");
        String plat = in.nextLine();
        if (plat.equals(Platform.ANDROID.getName())){
            System.out.println("Стартанул Адроид");
        }
    }
}
