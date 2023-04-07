package Homerworks.Homerworks21.Shop;
//Отцу у которого есть имя и определенная сумма в кармане должен сходить в магазин.
//В магазине есть 5 типов продуктов: яблоко, картошка, молоко, пиво и табак.
//У каждого товара есть своя цена.
//Отцу необходимо сделать покупку, максимум он может купить только два типа продуктов.
//Но любой тип продуктов может быть куплен в любом количестве.
//Т.е. он может купить только молоко. Или купить 3 молока, и 2 яблока. Но он не может
//купить яблоко, три пива и две картофелины.
//Неприятная ситуация произойдет в нескольких ситуациях:
//1) Если сумма покупки превышает количество денег в кармане отца.
//2) Если он принесет домой пиво либо табак.
//3) Если количество хотябы одного из купленных товаров не будет делиться на три.
//(т.е. он не сможет поровну разделить купленный продукт между собой, женой и ребенком)
//
//Реализовать данную ситуацию при помощи объектно ориентированного подхода.
//Постараться использовать перечислительный тип данных Enum. А также исключения.
//Постараться обработать все исключения в стороннем методе, а не в теле метода созданного
//у отца.
//
//В случае если отцу удасться избежать неприятной ситуации на консоль должно вывестись сообщение
//примерно такого типа:
//Уважаемый Валентин стоимость ваших покупок 150.
//Вы приобрели APPLE в количестве 3, и MILK в количестве 6.
public class Father{
    public String name;
    public double money;


    public Father(String name, double money) {
        this.name = name;
        this.money = money;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }

    public static double IgoToSop(Products products1, int quantity1 , Products products2, int quantity2) throws CountOfProdNotDiv3, PurchasedProhibitedProduct {
        Shop k=new Shop();
        Shop.CountOfProductsDivs3(quantity1, quantity2);
        double price1=Shop.CostOfProducts(products1);
        double price2=Shop.CostOfProducts(products2);
        double TotalAmount=price1*quantity1+price2*quantity2;
        System.out.println("\nВаша сумма по чеку: "+TotalAmount+"\nВи купили "+products1+"у кількості: "+quantity1+"\n"+products2+"у кількості: "+quantity2);
        return TotalAmount;
    }
}

