package Lessons_Topic;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
         /*switch(переменная для сравнения)
    {
        case значение1:
            (код для выполнения при равенстве переменной и значения);
            break;
        case значение1:
            (код для выполнения при равенстве переменной и значения);
            break;
        default:
            (код для если не возникло ни одного совпадения);
    }*/

        //вывод вашей профессии на консоль в связи с тем, что вы укажете с клавиатуры
        Scanner sw= new Scanner(System.in);
        System.out.println("Введите профессию");
        String str=sw.nextLine();
        switch (str.toUpperCase()) {
            case ("QA"):
                System.out.println("Поздравляю ты тестировщик");
           break;
            case ("DEC"):
            case ("FRONT"):
                System.out.println("Поздравляю ты разработчик");
            break;
                case ("MAN"):
                System.out.println("Поздравляю ты менеджер");
            break;
                default:
                System.out.println("Поздравляю ты balbes");
        }

    }

}

