package Lessons_Topic.OOP.lesson10.Ex23;

public class LowSalaryException extends Exception {
    public String getMessage(){
        return "У тебя маленькая зарплата";
    }
}
