package Homerworks.Homerworks19;
//Создать класс Computer c конструктором принимающим параметры
//   Марка тип String, цена тип int, оперативная память тип int,
//   и видеокарта тип int.
//   Конструктор также выводит на консоль сообщение типа:
//   "Создан PC.
//    Имя = марка.
//    Цена = цена.
//    Видеокарта = объем видеокарты
//    ОЗУ = Объем оперативной памяти."
//
//   Все поля класса Computer должны быть приватными.
//   Также создайте публичные методы для получения информации о полях класса Computer.
//   А также методы для изменения его полей.
//
//   Создайте один метод для получения всей информации о объекте класса Computer.
//
//   В отдельном классе создайте объект класса компьютер, и выведите на экран его поля при использовании
//   одного созданного выше метода класса.
public class Computer {
    private String brand;
    private int price;
    private int ram;
    private int videoCard;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(int videoCard) {
        this.videoCard = videoCard;
    }

    public Computer(String brand, int price, int ram, int videoCard) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
        this.videoCard = videoCard;
        System.out.println("Создан PC.\n" +"Имя "+brand+"\n"+"Цена ="+price+"\n"+
                "Видеокарта ="+videoCard+"\n"+"ОЗУ ="+ram);
    }

    public void fullInfor (String brand, int price, int ram, int videoCard){
        System.out.println("Модель компьютера-"+getBrand());
        System.out.println("Цена"+getPrice());
        System.out.println("ОЗУ="+getRam());
        System.out.println("Видео карта об'ем="+getVideoCard());
    }
}
