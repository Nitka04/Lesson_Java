package Lessons_Topic.OOP.lesson10.Exception.ex2;

class NoSuchMAilException extends Exception {
    public String getMessage() {
        return "Данный мейл занят";
    }
}
