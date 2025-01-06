package Homework.RemovingDuplicatesFromArray;

import java.util.Arrays;

/*
int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
Удалить дубликаты из массива и вывести в консоль
 */
public class RemovingDuplicates {
    /**
     * Метод main используется для запуска приложения, хранения исходных данных,
     * и выполнения метода remDuplicates с выводом результата в консоль.
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};

        System.out.println(Arrays.toString(arr) + "\n" +
                Arrays.toString(remDuplicates(arr)));
    }

    /**
     * Метод remDuplicates удаляет дублирущиеся значения в массиве,
     * в массиве остается только первое из нескольких повторяющихся значений.
     * @param arr
     * @return
     */
    private static int[] remDuplicates (int[] arr){
        return Arrays.stream(arr).distinct().toArray();
    }
}
