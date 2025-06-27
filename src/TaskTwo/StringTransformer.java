package TaskTwo;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

// TODO: 2.	Трансформация данных:
// 	 Создайте список строк, представляющих числа в виде строк.
// 	 Преобразуйте этот список в список целых чисел.
//	 Отфильтруйте только четные числа.
//	 Преобразуйте их в строковое представление.
//	 Соберите их в строку, разделенную запятыми.

public class StringTransformer {
    public static void main(String[] args) {

        List<String> stringNumbers = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");


        String result = stringNumbers.stream()
                .map(s -> {
                    try {
                        return Integer.parseInt(s);
                    } catch (NumberFormatException e) {
                        return null;
                    }
                })
                .filter(Objects::nonNull)
                .filter(n -> n % 2 == 0)
                .map(Object::toString)
                .collect(Collectors.joining(", "));


        System.out.println("Четные числа: " + result);
    }
}
