package Homerworks.Homerwork17;
//Заполнить массив на 45 элементов случайными числами
//от -50 до +50. Найти минимальный элемент и вывести его
//на консоль. Найти максимальный элемент и вывести его на
//консоль.
public class exercise3 {
    public static void main(String[] args) {
        int[] array = new int[45];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 101) - 50);
        }
        for (int l = 0; l < array.length; l++) {
            System.out.print(array[l] + " ");
        }
        System.out.println("\n");
        int l=array.length;
        int max=array[l-1] ;
        int min=array[l-1];
        for (int i = (array.length - 1); i >= 0; i--) {
                if (array[i]>max) {
                        max = array[i];
                    }
                if (min<0){
                    if (array[i]<0) {
                        boolean k=(Math.abs(array[i]) > Math.abs(min));
                        if (k==true){
                            min=array[i];}
                    }
                }else {
                    boolean kk=(min>array[i]);
                            if (kk==true){
                              min=array[i];}
                        }
                }
        System.out.println("Максимальне значення массиву: " + max);
        System.out.println("Мінемальне значення массиву: " + min);
    }
}

