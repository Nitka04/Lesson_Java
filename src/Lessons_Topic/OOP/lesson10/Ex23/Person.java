package Lessons_Topic.OOP.lesson10.Ex23;

public class Person {
    int salary;
    String name;
    int countOfFriends;
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountOfFriends() {
        return countOfFriends;
    }

    public void setCountOfFriends(int countOfFriends) {
        this.countOfFriends = countOfFriends;
    }

    public Person(int salary, String name, int countOfFriends) {
        this.salary = salary;
        this.name = name;
        this.countOfFriends = countOfFriends;
    }

    private void isDayOFF(DaysOfWeek daysofWeek) throws NotWeekEndsException {
        if (daysofWeek.equals(DaysOfWeek.SAT)||daysofWeek.equals(DaysOfWeek.SUN)){
            System.out.println("Ура вихідні!");
        }else {
            throw new NotWeekEndsException();
        }
    }
    private void isSalaryEnough() throws LowSalaryException {
        if (salary<5000){
            throw new LowSalaryException();
        }else {
            System.out.println("Грошей повинно вистачити");
        }
    }
private void doYuHaveFriends() throws NofriendsException {
        if(countOfFriends<=0){
            throw new NofriendsException();
        }else {
            System.out.println("C друзьями все добре.");
        }
}
public void canIhaveParty(DaysOfWeek daysOfWeek) throws NotWeekEndsException, LowSalaryException, NofriendsException {
        isDayOFF(daysOfWeek);
        isSalaryEnough();
        doYuHaveFriends();
    System.out.println("Ура, святу бути!");
}
}
