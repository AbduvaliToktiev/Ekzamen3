package exercise4; // Папка с четвёртым заданием

// класс Person который нельзя унаследовать
final public class Person { // Тело класса
    private String FIO; // Свойство
    private int age; // Свойство
    private String country; // Свойство

    // Пустой конструктор
    public Person() { // Тело конструктора

    } // Закрытие тела конструктора

    // Заполненный конструктор
    public Person(String FIO, int age, String country) { // Тело конструктора
        this.FIO = FIO;
        this.age = age;
        this.country = country;
    } // Закрытие тела конструктора

    // Override для того чтобы вывести информацию когда будем вызывать через sout
    @Override
    public String toString() {
        return "Моё Фамилие Имя Отчество: " + FIO  + "\n" +
                "Мой возраст: " + age + " лет\n" +
                "Страна где я проживаю: " + country;
    } // Закрывает тело аннотации
} // Закрывает тело класса
