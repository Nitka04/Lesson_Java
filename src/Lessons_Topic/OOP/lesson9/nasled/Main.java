package Lessons_Topic.OOP.lesson9.nasled;

public class Main {
    public static void main(String[] args){
        //заполнение родительского конструктору уже по условию класса наследника телеграм
        // ,задаем только один параметр
        Telegram tel = new Telegram(300);
        // візов какого  переопределенного метода родительского или наследовательно вібирать
        // решаеться по тому какой калсс мі создали.
        //tel.shutDown();
        Messenger mes = new Messenger("Messnger",1.8,250);
        System.out.println(mes.getName()+" "+mes.getVersion()+" "+mes.getSpace());
        //System.out.println(tel.canMakeVideCall());
        tel.getInfo();
        Telegram tel2 = new Telegram();
        //визов конструктора через класс наследника которій іл унаследован через словао super()
        tel2.getInfo();

    }
}
