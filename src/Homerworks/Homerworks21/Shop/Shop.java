package Homerworks.Homerworks21.Shop;

public class Shop {
    double price;
    int countOfProducts1;
    int countOfProducts2;

    public int getCountOfProducts1() {
        return countOfProducts1;
    }

    public int getCountOfProducts2() {
        return countOfProducts2;
    }

    public double getPrice() {
        return price;
    }

    /*private Shop(int countOfProducts1, int countOfProducts2) {
        this.countOfProducts1 = countOfProducts1;
        this.countOfProducts2 = countOfProducts2;
    }*/

    public void setPrice(double price) {
        this.price = price;
    }

    public static double CostOfProducts(Products products) throws PurchasedProhibitedProduct {
          if (products.equals(Products.apple)){
              double price=1;
             return price;
          }else if (products.equals(Products.milk)){
              double price=2;
              return price;
          }else if (products.equals(Products.potatoes)){
              double price=3;
              return price;
          }
        throw new PurchasedProhibitedProduct();
          }
         public static double CountOfProductsDivs3 (int countOfProducts1, int countOfProducts2) throws CountOfProdNotDiv3 {
              int c1=countOfProducts1%3;
              int c2=countOfProducts2%3;
        if ((countOfProducts1%3==0&&countOfProducts2%3==0)==false){
                  throw new CountOfProdNotDiv3();
              }
              double k=countOfProducts2%3;
              return k;
          }
    }
