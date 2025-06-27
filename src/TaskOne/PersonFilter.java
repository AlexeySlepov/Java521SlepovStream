package TaskOne;

import java.util.List;
import java.util.stream.Collectors;

//TODO: Создайте список объектов Person с полями name, age и gender.
//	Используя Stream, отфильтруйте только женщин старше 18 лет.
//	Соберите их имена в новый список
public class PersonFilter {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Инна", 25, "женский"),
                new Person("Сергей", 30, "мужской"),
                new Person("Виктория", 17, "женский"),
                new Person("Виктор", 22, "мужской"),
                new Person("Илья", 16, "мужской"),
                new Person("Екатерина", 19, "женский")
        );


        List<String> adultWomenNames = people.stream()
                .filter(p -> p.getGender().equals("женский"))
                .filter(p -> p.getAge() > 18)
                .map(Person::getName)
                .collect(Collectors.toList());


        System.out.println("Совершеннолетнии женщины:");
        adultWomenNames.forEach(System.out::println);
    }
}
