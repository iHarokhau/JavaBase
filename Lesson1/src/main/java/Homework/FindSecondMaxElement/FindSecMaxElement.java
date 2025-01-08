package Homework.FindSecondMaxElement;

/*
 Дан массив, заполненный уникальными значениями типа int.
 int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
 Необходимо найти элемент, который меньше максимума, но больше всех остальных.
*/

public class FindSecMaxElement {
    /**
     * Метод main хранит исходные данные, запускает метод findSecondMax.
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
        int max = 0;
        int secondMax = 0;

        findSecondMax(arr, max, secondMax);
    }

    /**
     * Метод findSecondMax находит максимальный "max" и предпоследний максимальный "secondMax" элементы,
     * и выводит их в консоль.
     * @param arr
     * @param max
     * @param secondMax
     */
    private static void findSecondMax (int[] arr, int max, int secondMax){
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
            if ((max > arr[i]) && (max > secondMax)){
                secondMax = arr[i];
            }
        }
        System.out.println("Maximal element in the array = " + max + "\n" +
                "Penultimate maximal element in the array = " + secondMax);
    }
}
