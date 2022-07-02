package exercise2; // Папка со вторым заданием

// Создаём публичный класс Person
public class Person { // Тело класса
    private String name; // Даём свойство имя
    private String surname; // Даём свойство фамилия
    private String patronymic; // Даём свойство отчество

    // Создание пустого конструктора
    public Person() { // Тело конструктора

    } // закрытие тело конструктора

    // Создание заполненного конструктора с именем, фамилией и отчеством
    public Person(String name, String surname, String patronymic) { // Тело конструктора
        this.name = name; // имя
        this.surname = surname; // фамилие
        this.patronymic = patronymic; // отчество
    } // Закрытие тела конструктора

    // Создание геттеров и сеттеров
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    // Override для того чтобы вывести информацию когда будем вызывать через sout
    @Override
    public String toString() { // Тело аннотации
        return "Имя = " + name + " | Фамилия = " + surname + " | Отчество = " + patronymic + "\n";
    } // Закрытие тела аннотации
} // Закрытие тела класса
