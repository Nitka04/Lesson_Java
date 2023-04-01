package Homerworks.Homerworks20;

import java.util.SortedMap;

public class Shop implements FinalCost {
    private String name;
    private Saler saler;
    private Customer customer;
    private Product Product;

    public Shop(String name) {
        this.name = name;
    }

    @Override
    public void costOfProduct(Saler saler, Customer Customer, Product Product) {
        if ((saler.getHonest() == true&&Customer.getDiscount()==true
                &&Customer.getAge()>=18&&Product.getAlcohol()==true)==true) {
            System.out.print(Customer.role()+", "+Customer.getName()+". "+"Магазин "+name+" вітає вас.\nВас обслуговував "+saler.role()+" "+saler.getName()+".\n"+
                    "Ви хочете купити "+Product.getName()+" це алкогольний товар і ви маєте дісконтну картку. \nВаша ітогова ціна по чеку: "+Product.getPrice()*0.9+".\n"+
                    "Ваша знижка:"+Product.getPrice()*0.1+"\nДякуємо за покупку. Чекаємо вас ще.");

        }else if ((saler.getHonest() == true&&Customer.getAge()>=18&&Product.getAlcohol()==true)==true){
            System.out.print(Customer.role()+", "+Customer.getName()+". "+"Магазин "+name+" вітає вас.\nВас обслуговував "+saler.role()+" "+saler.getName()+".\n"+
                    "Ви хочете купити "+Product.getName()+" це алкогольний товар. \nВаша ітогова ціна по чеку: "+Product.getPrice()+".\n"+
                    "У вас немає дісконтної картки"+"\nДякуємо за покупку. Чекаємо вас ще.");
        }else if ((saler.getHonest()==true&&Customer.getAge()<18&&Product.getAlcohol()==true)==true) {
            System.out.print(Customer.role()+", "+Customer.getName()+". "+"Магазин "+name+" вітає вас.\nВас обслуговував "+saler.role()+" "+saler.getName()+".\n"+
                    "Ви хочете купити "+Product.getName()+" це алкогольний товар, але нажаль вам немає 18 років.\n Тому ми не можемо вам його продати.\n Ви можете обрати інший товар."+
                    "\nЧекаємо вас ще.");}
        else if ((saler.getHonest() == false&&Customer.getDiscount()==true
                &&Product.getAlcohol()==true)==true) {
            System.out.print(Customer.role()+", "+Customer.getName()+". "+"Магазин "+name+" вітає вас.\nВас обслуговував "+saler.role()+" "+saler.getName()+".\n"+
                    "Ви хочете купити "+Product.getName()+" це алкогольний товар і ви маєте дісконтну картку. \nВаша ітогова ціна по чеку: "+Product.getPrice()*0.9+".\n"+
                    "Ваша знижка:"+Product.getPrice()*0.1+"\nДякуємо за покупку. Чекаємо вас ще.");
        } else if ((saler.getHonest() == false&&Product.getAlcohol()==true)==true) {
            System.out.print(Customer.role()+", "+Customer.getName()+". "+"Магазин "+name+" вітає вас.\nВас обслуговував "+saler.role()+" "+saler.getName()+".\n"+
                    "Ви хочете купити "+Product.getName()+" це алкогольний товар. \nВаша ітогова ціна по чеку: "+Product.getPrice()+".\n"+
                    "У вас немає дісконтної картки"+"\nДякуємо за покупку. Чекаємо вас ще.");
        } else if((Customer.getDiscount()==true&&Product.getAlcohol()==false)==true){
            System.out.print(Customer.role()+", "+Customer.getName()+". "+"Магазин "+name+" вітає вас.\nВас обслуговував "+saler.role()+" "+saler.getName()+".\n"+
                    "Ви хочете купити "+Product.getName()+", і ви маєте дісконтну картку. \nВаша ітогова ціна по чеку: "+Product.getPrice()*0.9+".\n"+
                    "Ваша знижка:"+Product.getPrice()*0.1+"\nДякуємо за покупку. Чекаємо вас ще.");
        }else {
            System.out.print(Customer.role()+", "+Customer.getName()+". "+"Магазин "+name+" вітає вас.\nВас обслуговував "+saler.role()+" "+saler.getName()+".\n"+
                    "Ви хочете купити "+Product.getName()+". \nВаша ітогова ціна по чеку: "+Product.getPrice()+".\n"+
                    "У вас немає дісконтної картки"+"\nДякуємо за покупку. Чекаємо вас ще.");
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
