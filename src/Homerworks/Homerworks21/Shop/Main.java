package Homerworks.Homerworks21.Shop;

public class Main {
    public static void main(String[] args) {
        Father Sergey = new Father("Сергій",40);
        try {
            System.out.println("Шановний "+Sergey.name+".");
            double summary=Father.IgoToSop(Products.potatoes, 2, Products.milk, 3);
            try {
                if (summary> Sergey.money){
                    throw new NotEnoughMoney();}
                //Уважаемый Валентин стоимость ваших покупок 150.
//Вы приобрели APPLE в количестве 3, и MILK в количестве 6.

            }catch (NotEnoughMoney e){
                System.out.println(e.getMessage());}
        } catch (CountOfProdNotDiv3 | PurchasedProhibitedProduct e) {
            System.out.println(e.getMessage());}
        }
}
