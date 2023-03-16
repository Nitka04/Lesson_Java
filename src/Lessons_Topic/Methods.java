package Lessons_Topic;

public class Methods {
    // прописуємо метод який під час программи можемо викликати  і не прописувати його знову
    static public int[] arraySort(int[] ar) {
        // метод сортування
     for (int i = ar.length - 1; i >= 0; i--) {
        int max;
        for (int a = i - 1; a >= 0; a--) {
            if (ar[i] < ar[a]) {
                max = ar[a];
                ar[a] = ar[i];
                ar[i] = max;
            }
        }
    }return ar;
}

    public static void main(String[] args) {
        int[] a = {12, 34, 1, 3, 234, 54, 3};
// викликаємо нижче метод для сортування нашого масиву
        for (int inta : Methods.arraySort(a)) {
            System.out.print(inta + " ");
        }
    }
}

