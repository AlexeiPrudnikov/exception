import java.util.ArrayList;
import java.util.List;

public class Task03 {
    /*
    Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
    Метод должен пройтись по каждому элементу и проверить что он не равен null.
    А теперь реализуйте следующую логику:
    Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
    Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
    */
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 5, 6, 3};
        validArray(numbers);

    }

    public static void validArray(Integer[] numbers) {
        List<Integer> nullIndexes = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == null) {
                nullIndexes.add(i);
            }
        }
        if (!nullIndexes.isEmpty()) {
            throw new IllegalArgumentException("В массиве null значения на индексах: " + nullIndexes);
        }
    }
}
