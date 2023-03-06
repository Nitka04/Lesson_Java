public class Homerwork13 {
    public static void main(String[] args) {
         // задание 1
        int first = 5;
        int second = first * 5;
        int third = second - first;
        first = first * third;
        System.out.println("first=" + first);
        System.out.println("seconf=" + second);
        System.out.println("third=" + third);

// задание 2
        String string1= "Казнить";
        String string2= "нельзя";
        String string3= "помиловать";
        String string4= ",";
        String string5= ".";

        System.out.println(string1+string4+string2+string3+string5);
        System.out.println(string1+string2+string4+string3+string5);
// задание 3
        System.out.println("Anyone who has never made \n a mistake has never tried \n anything new.\n Albert Einstein.");

        //Задание 4
        int number= 45;
        int two=2;
        boolean chert=number%two==0;
        System.out.println("Число number имеет значение "+number+"."+"\nЯвляется ли оно четным?\n"+ chert);



    }
}