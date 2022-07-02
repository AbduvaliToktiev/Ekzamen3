package exercise4; // Папка с четвёртым заданием

// публичный класс Coins который унаследуется от Subject
public class Coins extends Subject{ // Тело класса
    private String theCountry; // Свойство
    private int age; // Свойство
    private double radius; // Свойство
    private String metal; // Свойство
    private int denomination; // Свойство

    // Пустой конструктор
    public Coins() { // Тело конструктора

    } // Закрытие тела конструктора

    // Заполненный конструктор
    public Coins(String form, String name, String theCountry, int age, double radius, String metal, int denomination) { // Тело конструктора
        super(form, name);
        this.theCountry = theCountry;
        this.age = age;
        this.radius = radius;
        this.metal = metal;
        this.denomination = denomination;
    } // Закрытие тела конструктора

    // геттеры и сеттеры
    public String getTheCountry() {
        return theCountry;
    }

    public void setTheCountry(String theCountry) {
        this.theCountry = theCountry;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public int getDenomination() {
        return denomination;
    }

    public void setDenomination(int denomination) {
        this.denomination = denomination;
    }

    //  Override для того чтобы вывести информацию когда будем вызывать через sout
    @Override
    public String toString() {
        return "Мой Левый карман: " +  "\n" +
                "Название предмета = " + getName() + "\n" +
                "Форма монеты = " + getForm() + "\n" +
                "Страна производитель = " + theCountry  + "\n" +
                "Год на монете = " + age + " год\n" +
                "Радиус монеты = " + radius + " мм" + "\n" +
                "Металл = " + metal + "\n" +
                "Номинал на монете = " + denomination + " cом";
    } // Закрытие тела аннотации
} // Закрытие тело класса
