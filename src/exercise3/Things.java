package exercise3; // Папка с третим заданием

// Публичный класс с названием Things(Предмет)
public class Things { // Тело класса
    private String flat;  // свойство класса
    private String bottle; // свойство класса
    private String circle; // свойство класса
    private String circle2; // свойство класса
    private int count; // свойство класса
    private int count2; // свойство класса

    // Пустой конструктор
    public Things() { // Тело конструктора

    } // Закрытие тела конструктора

    // Создание заполненного конструктора со сваойствами
    public Things(int count, String circle, String flat, String bottle) { // Тело конструктора
        this.circle = circle;
        this.flat = flat;
        this.bottle = bottle;
        this.count = count;
    } // Закрывает тело конструктора

    // В этом конструкторе мы вызываем конструктор созданный ранние
    public Things(int count, String circle2, int count2, String circle, String flat, String bottle) { // Тело конструктора
        this(count, circle, flat, bottle);
        this.circle2 = circle2;
        this.count2 = count2;
    } // Закрывает Тело конструктора

    // Override для того чтобы вывести информацию когда будем вызывать через sout
    @Override
    public String toString() { // Тело аннотации
        return count + " "  + circle + ", " + count2 + " " + circle2 + " " + flat + " и " + bottle;
    } // Закрытие тела аннотации
} // Закрытие тела класса
