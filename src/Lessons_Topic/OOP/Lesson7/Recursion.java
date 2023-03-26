package Lessons_Topic.OOP.Lesson7;

public class Recursion {
    //Рекурсия це визов методом самого себе(обов'язково приймає параметр)
    // рекурсія повинна бути в якомусь закінченному циклі.
    static void printAllNumbers(int number){
        if(number==0){
            System.out.println("Ввели 0");
        }else if (number<0){
            System.out.println("Ввели отриц");
        }else {
            System.out.println(number);
            number--;
            printAllNumbers(number);
        }

    }

    public static void main(String[] args) {
        printAllNumbers(7);
    }
}

