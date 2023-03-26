package Homerworks.Homerworks18;
//) Написать метод, принимающий в качестве параметров два числа,
//   который будет выводить на консоль сумму этих двух чисел.
//
//   Написать второй метод, который будет возвращать сумму двух чисел,
//   которые он будет принимать в параметре метода.
//Вывести на консоль сумму двух любых чисел при помощи первого и второго метода.
public class exercise1 {

    int sum;
    int n;
    int n2;

    void slogenie(int n, int n2){
        sum=n+n2;
        System.out.println(n+n2);
    }
    public int vosvratSymmu (int n, int n2){
        sum=n+n2;
        return sum;
    }

    public static void main(String[] args){
    exercise1 doIt  =new exercise1();
        int k=doIt.vosvratSymmu(16, 15);
        System.out.println("Возвращенное значение k="+k);
        doIt.slogenie(1, 5);
    }
}
