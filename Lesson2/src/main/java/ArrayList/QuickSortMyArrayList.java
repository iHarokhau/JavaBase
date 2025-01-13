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

        System.out.println(myArray());
    }

    private static ArrayList<Integer> myArray(){
        Random random = new Random();
        Integer[] randomValue = new Integer[1000];
        for (int i = 0; i < randomValue.length; i++) {
            randomValue[i] = random.nextInt(1000);
        }
        return new ArrayList<>(Arrays.asList(randomValue));
    }

}
