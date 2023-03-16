package Homerworks.Homerworks16;

import java.util.Scanner;

//Написать программу, которая будет считывать введенные пользователем
//слова с клавиатуры слова, и склеивать их в одно предложение до тех пор,
//пока пользователь не введет с клавитуры слово STOP.
//Все слова введенные до этого должны отобразится в консоли одним предложением.
public class exercise4 {
    public static void main(String[] args) {
        String prov="STOP";
        String prov2="";
        String itog = "";
        while (prov2.equals(prov)==false) {
        System.out.println("Напишить слово,а якщо вам набридло то слово \"STOP\": ");
        Scanner sl = new Scanner(System.in);
            String slovo = sl.nextLine();
                itog=itog+" "+slovo;
                prov2=slovo.toUpperCase();
                System.out.println(itog);}

        }

    }

