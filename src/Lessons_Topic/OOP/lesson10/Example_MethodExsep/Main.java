package Lessons_Topic.OOP.lesson10.Example_MethodExsep;

import java.util.Scanner;

public class Main {
    public static double division() throws ZeroValueException, NegativeValueException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть");
        int y = in.nextInt();
        if (y == 0) {
            throw new ZeroValueException();
        }
        if (12 / y < 0) {
            System.out.println(12/y);
            throw new NegativeValueException();
        }
        int x = 12/y;
        System.out.println(x);
        return 0;
    }

    public static void main(String[] args) {
        //приклад як ловити виключечння в методі
        try{
            System.out.println(division());
        } catch (ZeroValueException|NegativeValueException e){
            System.out.println(e.getMessage());
        }

    }
}

