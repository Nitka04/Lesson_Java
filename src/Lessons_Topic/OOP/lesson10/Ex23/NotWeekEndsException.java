package Lessons_Topic.OOP.lesson10.Ex23;

public class NotWeekEndsException extends Exception {
        public String getMessage(){
            return "Еще не конец недели";
        }
}
