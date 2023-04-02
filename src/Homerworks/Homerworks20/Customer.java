package Homerworks.Homerworks20;

public class Customer extends roles{
    private String name;
    private int age;
    private boolean discount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public Customer(String name, int age, boolean discount) {
        this.name = name;
        this.age = age;
        this.discount = discount;
    }

    String roles() {
        String roles="Покупець";
       /* System.out.println("Я Покупатель");*/
        return roles;
    }
}
