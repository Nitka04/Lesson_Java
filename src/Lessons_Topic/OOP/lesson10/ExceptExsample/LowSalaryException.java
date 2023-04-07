package Lessons_Topic.OOP.lesson10.ExceptExsample;

public class LowSalaryException extends Exception {
    public String getMessage(){
        return "У тебя маленькая зарплата";
    }
}
