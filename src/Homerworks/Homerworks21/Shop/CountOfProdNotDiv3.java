package Homerworks.Homerworks21.Shop;

public class CountOfProdNotDiv3 extends Exception {
    public String getMessage(){
        return "Ти придбав невірну кількість товарів,вона не кратна 3м.";
    }
}
