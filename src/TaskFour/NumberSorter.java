package TaskFour;

import java.util.List;
import java.util.Comparator;

//TODO: 4.	Сортировка и поиск:
// 	Создайте список целых чисел.
//  Отсортируйте его по убыванию.
// 	Найдите первые 3 элемента после сортировки.

public class NumberSorter {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(2, 66, 16, -23, 0, 20, 7, 99, 66);


        List<Integer> topThree = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();


        System.out.println("Первые 3 элемента после сортировки:");
        topThree.forEach(System.out::println);
    }
}
