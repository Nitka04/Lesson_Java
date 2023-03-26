package Homerworks.Homerworks18;
// Создать класс Конспект. Класс должен содержать следующие поля:
//    название предмета;
//    ФИО студента;
//    количество страниц;
//    год выпуска;
//    цвет обложки.
//    Название заведения, где учится студент;
//
//Создайте публичные методы для получения доступа к полям класса,
//а также методы для присваивания значений полям класса.
public class Conspectus {
    public  String nameOfSubject;
    public String FIO;
    public Integer counOfPages;
    public Integer yearOfIssue;
    public String colourOfCover;
    public String nameOfEducatInstitut;

    public String getNameOfSubject() {
        return nameOfSubject;
    }

    public void setNameOfSubject(String nameOfSubject) {
        this.nameOfSubject = nameOfSubject;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public Integer getCounOfPages() {
        return counOfPages;
    }

    public void setCounOfPages(Integer counOfPages) {
        this.counOfPages = counOfPages;
    }

    public Integer getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(Integer yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getColourOfCover() {
        return colourOfCover;
    }

    public void setColourOfCover(String colourOfCover) {
        this.colourOfCover = colourOfCover;
    }

    public String getNameOfEducatInstitut() {
        return nameOfEducatInstitut;
    }

    public void setNameOfEducatInstitut(String nameOfEducatInstitut) {
        this.nameOfEducatInstitut = nameOfEducatInstitut;
    }
}

