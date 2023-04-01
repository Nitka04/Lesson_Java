package Homerworks.Homerworks20;

public class Saler extends roles {
    private String name;
    private boolean honest;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getHonest() {
        return honest;
    }

    public void setHonest(boolean honest) {
        this.honest = honest;
    }

    public Saler(String name, boolean honest) {
        this.name = name;
        this.honest = honest;
    }

    @Override
    String role() {
        String role="Продавец";
        return role;
       /* System.out.println("Я Продавец");*/
    }

    }

