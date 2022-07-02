package exercise4; // Папка с четвёртым заданием

// публичный класс Subject
public class Subject { // Тело класса
    private String form; // Свойство
    private String name; // Свойтсво

    // Пустой конструктор
    public Subject() { // Тело конструктора

    } // Закрытие тела конструктора

    // Заполненный конструктор
    public Subject(String form, String name) { // Тело конструктора
        this.form = form;
        this.name = name;
    }  // Закрытие тела конструктора


    // геттеры и сеттеры
    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
} // Закрывает тело класса
