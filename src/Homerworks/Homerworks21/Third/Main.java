package Homerworks.Homerworks21.Third;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws LengthOfArray, ZeroExc {
        Third third = new Third();
        System.out.println(Arrays.toString(Third.randomArray30()));
        System.out.println(Third.randomArray30().length);
        try {
            System.out.println(Third.DivisionArrayElem());
        }catch (ZeroExc|LengthOfArray e){
            System.out.println(e.getMessage());
        }

    }
}
