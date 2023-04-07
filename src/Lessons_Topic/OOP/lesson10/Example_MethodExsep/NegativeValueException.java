package Lessons_Topic.OOP.lesson10.Example_MethodExsep;

public class NegativeValueException extends Exception {
    public String getMessage() {
        return "Это отрицательное";
    }
}