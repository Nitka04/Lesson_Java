package Lessons_Topic.OOP.Lesson8.nasledovanie.ex2;

public class ChildChid extends ChildClas {
    private String child2;
    public ChildChid(String a, String b, int x, String childString, String child2){
       //super визивает методи та поля родительского классу
        super(a,b,x,childString);
        this.child2=child2;
    }
    public void superVoid(){
        super.dosmthTwo();
        System.out.println(super.x);
        dosmthTwo();
    }
}
