package Homerworks.Homerworks19;
//Необходимо создать класс конвертер, который будет иметь методы конвертации примитивных типов данных:
//   метод convertToInt; (конвертирует byte, short, int, long, char, float, double, String).
//   При вводе boolean выводит сообщение, что введен тип boolean.
//   convertToDouble;    (конвертирует byte, short, int, long, char, float, double, String).
//   При вводе boolean выводит сообщение, что введен тип boolean.
//   converToString;     (конвертирует byte, short, int, long, char, boolean, float, double, String).
//   У данного класса должен быть только один конструктор, в параметрах которого можно указать его имя.
//   А также только один метод геттер для получения информации о названии данного конвертра.
public class Convector {
    private String nameConvector;
   public int i;
   public double d;
   public byte b;
   public short s;
   public long l;
   public char c;
   public float f;
   public boolean b1;
   public String str;

    public Convector(String nameConvector) {
        this.nameConvector = nameConvector;
    }

    public String getNameConvector() {
        return nameConvector;
    }

    public int  convertToInt (boolean b1){
        System.out.println( "Веден тип boolean. Змініть свою відповіть.");
        return 0;
    }
    public int  convertToInt (){
        return (int) b;
    }
    public int  convertToInt (short s){
        return (int) s;
    }
    public int  convertToInt (long l){
        return (int) l;
    }
    public int  convertToInt (char c){
        return (int) c;
    }
    public int  convertToInt (float f){
        return (int) f;
    }
    public int  convertToInt (double d){
        return (int) d;
    }
    public int  convertToInt (String str){
        int str1 =Integer.parseInt(str);
        return str1;
    }
    public double convertToDouble(boolean b1){
        System.out.println( "Веден тип boolean. Змініть свою відповіть.");
        return 0;
    }
    public double convertToDouble(byte b){
        return (double) b;
    }
    public double convertToDouble(short s){
        return (double) s;
    }
    public double convertToDouble(int i){
        return (double) i;
    }
    public double convertToDouble(long l){
        return (double) l;
    }
    public double convertToDouble(char c){
        return (double) c;
    }
    public double convertToDouble(float f){
        return (double) f;
    }
    public double convertToDouble(String str){
        double str1 =Double.parseDouble(str);
        return str1;
    }
    public String converToString(boolean b){
        System.out.println( "Веден тип boolean. Змініть свою відповіть.");
        return str="";
    }
    public String converToString(int i){
       return str=Integer.toString(i);
    }
    public String converToString(byte b){
        convertToInt(b);
        return str=Integer.toString(b);
    }
    public String converToString(short s){
        convertToInt(s);
        return str=Integer.toString(s);
    }
    public String converToString(long l){
        return str=Integer.toString((int) l);
    }
    public String converToString(char c){
        convertToInt();
        return str=Integer.toString(c);
    }
    public String converToString(float f){
        return str=Integer.toString((int) f);
    }
    public String converToString(double d){
        return str=Integer.toString((int) d);
    }

}
