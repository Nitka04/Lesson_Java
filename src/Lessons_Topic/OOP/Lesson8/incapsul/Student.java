package Lessons_Topic.OOP.Lesson8.incapsul;

public class Student {
    private String name;
    private int age;
    private  boolean isMale;
    private String courseName;
    //нижче приведен конструктор.конструктори пишутсья з великої букви.
    // співпадає з назвою класса.
    public Student(String name, int age, boolean isMale, String courseName){
        this.name=name;
        this.age = age;
        this.isMale= isMale;
        this.courseName= courseName;
    }
    //нижче приклади перегрузки конструкторів тобто, зміна параметрів вводу.
    public Student(String name, String courseName, int age, boolean isMale){
        //this з визовом конструктора повинно бути на першому місці.
        this(name,age,courseName);//викликає кнструктор в середені конструктора.
        this.isMale= isMale;
    }
    public Student(String name, int age,  String courseName){
        this.name=name;
        this.age = age;
        this.courseName= courseName;
    }
    public Student(){//приклад пустого конструктора
        this.name="Я пустий";
    }

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    private String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    //Якщо методи такж приватні,то ми робимо новий публічний метод  в якому використовиваємо
    // ці приватні методи які доступні тільки в цьому классі. А цей публічний метод буде доступний за межіми
    // цього классу.
    public void getInfo(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(isMale());
        System.out.println(getCourseName());
    }
}
