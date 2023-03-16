package Homerworks.Homerworks16;

import java.util.Scanner;

//1)Используя оператор switch написать программу, которая выводит на
//консоль ссылку для скачивания программы.
//Из выбора программ взять: IntelliJ IDEA, Git, Java.
//Из выбора ОС взять: Linux, macOS, Windows.
//Программа должна спросить пользователя какая программа ему интересна,
//также спросить какую ОС он использует, а после вывести в консоль
// необходимую ссылку.
//Если программа с таким названием не существует выводит сообщение
// в консоль, о том
//что такой программы не существует.
//Если указанной пользователем ОС нет, то выводится сообщение в
//консоль, о том
//что такой ОС не существует.
public class exercise1 {
    public static void main(String[] args) {
        System.out.println("Какая у вас операционная система");
        Scanner op = new Scanner(System.in);
        String op1 = op.nextLine().toUpperCase();
        System.out.println("Какую программу вы хотели бы установить");
        Scanner pr = new Scanner(System.in);
        String pr2 = pr.nextLine().toUpperCase();
        String itog = op1 + pr2;
        switch (op1) {
            case ("LINUX"):
            case ("MACOS"):
            case ("WINDOWS"):
                switch (itog) {
                    case ("LINUXINTELLIJ IDEA"):
                        System.out.println("https://www.jetbrains.com/ru-ru/idea/download/#section=linux");
                        break;
                    case ("LINUXGIT"):
                        System.out.println("https://git-scm.com/download/linux");
                        break;
                    case ("LINUXJAVA"):
                        System.out.println("https://www.java.com/ru/download/ie_manual.jsp?locale=ru");
                        break;
                    case ("MACOSINTELLIJ IDEA"):
                        System.out.println("https://www.jetbrains.com/ru-ru/idea/download/#section=mac");
                        break;
                    case ("MACOSGIT"):
                        System.out.println("https://git-scm.com/download/mac");
                        break;
                    case ("MACOSJAVA"):
                        System.out.println("https://www.java.com/ru/download/help/mac_install.html");
                        break;
                    case ("WINDOWSINTELLIJ IDEA"):
                        System.out.println("https://www.jetbrains.com/ru-ru/idea/download/#section=windows");
                        break;
                    case ("WINDOWSGIT"):
                        System.out.println("https://git-scm.com/download/win");
                        break;
                    case ("WINDOWSJAVA"):
                        System.out.println("https://www.java.com/ru/download/ie_manual.jsp?locale=ru");
                        break;
                    default:
                        System.out.println("Такой программы не существует.");
                    break;
                }
                break;
            default:
             System.out.println("Такой операционная система не существует");
        }
        }
    }

