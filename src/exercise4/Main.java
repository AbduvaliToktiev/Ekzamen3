package exercise4; // Папка с четвёртым заданием

// Публичный класс Main
public class Main { // Тело класса
    // Метод для основной работы программы
    public static void main(String[] args) { // Тело метода
        Person person = new Person("Токтиев Абдували Азизджанович", 27, "Кыргызстан"); // Создал Человека
        System.out.println(person + "\n"); // Вывод информации в консоль

        // Создание левого кармана и заполнили его свойствами
        Coins leftPocket = new Coins();
        leftPocket.setName("Монета Кыргызский сом");
        leftPocket.setForm("Круглая");
        leftPocket.setTheCountry("Кыргызстан");
        leftPocket.setAge(2008);
        leftPocket.setRadius(19);
        leftPocket.setMetal("Сталь покрытая никелем");
        leftPocket.setDenomination(1);
        System.out.println(leftPocket + "\n"); // Вывод в консоль информации и пробел между строками для красоты

        // Сдесь всё тоже самое только для левого кармана
        Banknote rightPocket = new Banknote();
        rightPocket.setName("Бумажная купюра сом");
        rightPocket.setForm("Прямоугольная");
        rightPocket.setLength(138);
        rightPocket.setWidth(66);
        rightPocket.setDenomination(200);
        rightPocket.setPersonality("Алыкула Осмонов");
        rightPocket.setAge(2017);
        rightPocket.setColor("Желтый");
        System.out.println(rightPocket); // Вывод в консоль информации
    } // Закрывает тело метода
} // Закрывает тело класса
// Реализовал в четвёртой задачи такие принципы как инкапсуляция и унаследование, в классе Coins(Монеты) 5 свойств + 2 свойства из класса Subject(Предмет).
//А в классе Banknote(Купюра) указал 6 свойств + 2 свойства из класса Subject(Предмет), интересно от чего вы будете отталкивать при выстовлении баллов.
//А инкапсуляция в классе Banknote, Coins, Person, Subject.

