package ArrayList;

import java.util.ArrayList;
import java.util.Comparator;

/*
Реализовать MyArrayList.
 Методы, обязательные к реализации:
- добавить элемент: add(T element),
- добавить элемент по индексу: add(int index, T element),
- получить элемент: get(int index),
- удалить элемент remove(int index),
- очистить всю коллекцию: clear(),
- отсортировать коллекцию: sort(Comparator<T> comparator)
 */



public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();

        name.add("Petya");
        name.add("Polina");
        name.add("Dmitry");
        name.add("Valentin");
        name.add("Sergey");
        name.add("Natalia");
        name.add("Mihail");
        name.add("Grigory");
        name.add("Vladislav");
        name.add("Katrin");
        System.out.println(name);

        System.out.println(addElement(name, "Ihar"));
        System.out.println(addElementWithIndex(3, "Vladimir", name));
        getElementNumber(name, 5);
        removeElement(name,2);
        naturalSortMyArray(name);
        reverseSortMyArray(name);
        clearMyArray(name);
    }

    public static ArrayList<String> addElement(ArrayList<String> name, String anyName) {
        name.add(anyName);
        return name;
    }

    private static ArrayList<String> addElementWithIndex(int index, String anyName, ArrayList<String> name) {
        name.add(index, anyName);
        return name;
    }

    private static void getElementNumber(ArrayList<String> name, int number) {
        System.out.println(name.get(number));
    }

    private static void removeElement(ArrayList<String> name, int index) {
        name.remove(index);
        System.out.println(name);
    }

    private static void clearMyArray(ArrayList<String> name) {
        name.clear();
        System.out.println(name);
    }

    private static void naturalSortMyArray(ArrayList<String> name) {
        name.sort(Comparator.naturalOrder());
        System.out.println(name);
    }

    private static void reverseSortMyArray(ArrayList<String> name) {
        name.sort(Comparator.reverseOrder());
        System.out.println(name);
    }
}