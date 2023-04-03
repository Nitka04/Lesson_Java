package Lessons_Topic.OOP.lesson10.Ex23;

public class Main {
    public static void main (String[] args)/*throws NofriendsException*/{//прописати исключенія в назві метода,але буде помилка якщо це виключення спрацює.
        Person ivan=new Person(7000, "Иван",0);
       //якщо не писати виключення то видаст помилкуб
        // але пропишеть виключення яке здіснилося з приведенням виключень
        /*ivan.canIhaveParty(DaysOfWeek.SAT);*/

        //або кожен метод окремо виконуються вони по черзі як прописані в батківському методі
        try{
        ivan.canIhaveParty(DaysOfWeek.SAT);}
    /*catch (NotWeekEndsException e){
            System.out.println(e.getMessage());
        }catch (NofriendsException e){
            System.out.println(e.getMessage());
        } catch (LowSalaryException k){
        System.out.println(k.getMessage());}*/
            //можно прописати виключення через кому
            catch (LowSalaryException|NotWeekEndsException|NofriendsException e) {
                System.out.println(e.getMessage());
            }
    }
}
