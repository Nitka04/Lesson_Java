package Lessons_Topic.OOP.lesson10.ExceptExsample;

public class NofriendsException extends Exception {
    public String getMessage(){
        return "У тебя нет друзей";
    }
}
