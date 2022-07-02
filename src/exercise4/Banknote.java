package exercise4; // Папка с четвёртым заданием

// Публичный класс Banknote который унаследуется от Subject
public class Banknote extends Subject{ // Тело класса
    private double length; // Свойство
    private double width; // Свойство
    private int denomination; // Свойство
    private String personality; // Свойство
    private int age; // Свойство
    private String color; // Свойство

    // Пустой конструктор
    public Banknote() { // Тело конструктора

    }

    // Заполненный конструктор
    public Banknote(String form, String name, double length, double width, int denomination, String personality, int age, String color) { // Тело конструктора
        super(form, name);
        this.length = length;
        this.width = width;
        this.denomination = denomination;
        this.personality = personality;
        this.age = age;
        this.color = color;
    } // Закрытие тела конструктора

    // геттеры и сеттеры
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getDenomination() {
        return denomination;
    }

    public void setDenomination(int denomination) {
        this.denomination = denomination;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //  Override для того чтобы вывести информацию когда будем вызывать через sout
    @Override
    public String toString() {
        return "Мой Правый карман: " + "\n" +
                "Название предмета = " + getName() + "\n" +
                "Форма купюры = " + getForm() + "\n" +
                "Длина купюры = " + length + " мм\n" +
                "Ширина купюры = " + width + " мм\n" +
                "Номинал на купюре = " + denomination + " сом\n" +
                "Кто изображен на купюре = " + personality + "\n" +
                "Год выпука купюры = " + age + " год\n" +
                "Цвет купюры = " + color;
    } // Закрываем тело аннотации
} // Закрывает тело класса
