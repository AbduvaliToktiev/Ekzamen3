package exercise2; // Папка со вторым заданием

// Публичный класс с названием ExceptionClone который унаследуется от Exception для создания собственных исключений
public class ExceptionClone extends Exception { // Тело класса
    // Создание собственной ошибки с модификатором public и возможностью написать сообщение
    public ExceptionClone(String massage) { // Открывает тело конмтруктора
        super(massage); // Даёт возможность написать строку
    } // Закрывает тело конструктора
} // Закрывает тело класса
