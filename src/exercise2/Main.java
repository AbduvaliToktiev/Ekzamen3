package exercise2;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ExceptionClone {
        List<Person> people = new LinkedList<>();
        Person person1 = new Person("Abduvali", "Toktiev", "Azizdzanovich");
        Person person2 = new Person("Azamat", "Erlanov", "Erlanovich");
        Person person3 = new Person("Kurban", "Kurbanov", "Ruslanovich");
        people.add(person1);
        people.add(person2);
        people.add(person3);
        System.out.println("Список людей до добавления! " + people);
        addPerson(people);
        System.out.println("Список людей после добавления! " + people);
    }

    private static void addPerson(List<Person> people) throws ExceptionClone {
        Person person4 = new Person("Abduvali", "Toktiev", "Azizdzanovich");
        people.add(person4);
        if (person4.getName().equals(people) && person4.getSurname().equals(people) && person4.getPatronymic().equals(people)) {
            throw new ExceptionClone(" {Такой человек уже есть!}");
        }
    }
}
