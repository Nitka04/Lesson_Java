package Lessons_Topic.OOP.lesson9.abstractles;

public  class Ship extends Vehicles implements Inter1,Inter2{
    //класс являющийся наследником абстрактного класса должен
    //либо реализовать все абстрактние методі либо об'явлен абстрактним классом
    @Override
    //если в нескольких интерфейсах находиться один и тот же метод без реализации(одинаковое названиие)
    //то мі прописиваем его один раз
    public void inter(){
        System.out.println("inter");
    }

    @Override
    void move() {
        System.out.println("Лодочка плыви");
    }
}

