package ArrayList;

/*
Реализовать алгоритм quicksort для реализованного вами MyArrayList.
Ваш QuickSort должен принимать список любого типа и сортировать его.

Использовать:
○ Java generics
○ Comparable, Comparator
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class QuickSortMyArrayList {
    public static void main(String[] args) {

        System.out.println(intArray());
        System.out.println(quickSort(intArray(), 0, );
    }

    private static void quickSort (int[] arr, int low, int high){
        if (low < high){
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition (int[] arr, int low, int high){
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        int temp = arr[middle];
        arr[middle] = arr[high];
        arr[high] = temp;

        int i = low -1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot){
                i++;

                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

//    protected static class NumberContainer <N>{
//        private N number;
//
//        protected NumberContainer(N number){
//            this.number = number;
//        }
//
//        protected void print(){
//            System.out.println(number);
//        }
//    }

    private static ArrayList<?> intArray(){
        Random random = new Random();
        Integer[] randomValue = new Integer[100];
        for (int i = 0; i < randomValue.length; i++) {
            randomValue[i] = random.nextInt(100);
        }
        return new ArrayList<>(Arrays.asList(randomValue));
    }

}
