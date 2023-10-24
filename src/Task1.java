package src;

import java.util.Arrays;

/*
Найти количество различных элементов массива. Пример: для 1 4 5 1 1 3 ответ 4.
* Создать метод, который принимает массив и возвращает количество различных элементов.
*/
public class Task1 {

    public static void main(String[] args) {
        int[] numbers = {1, 4, 3, 5, 1, 1, 3, 9, 2};
        System.out.println(Arrays.toString(numbers));
        System.out.println(diffNumbers(numbers));
    }

    public static int diffNumbers(int[] set) {
        Arrays.sort(set);
        int counter = 1;
        for (int i = 1; i < set.length; i++) {
            if (set[i] == set[i - 1]) {
                continue;
            }
            counter++;
        }
        return counter;
    }
}
