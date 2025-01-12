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
        ArrayList<String> name = new ArrayList<>();

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
        System.out.println(getElementNumber(name, 5));
        removeElement(name,2);
        naturalSortMyArray(name);
        reverseSortMyArray(name);
        clearMyArray(name);
    }

    /**
     * The method "addElement" adds the element to the end "ArrayList<> name".
     * @param name - the name our ArrayList's name.
     * @param anyName - the String value.
     * @return "ArrayList<> name".
     */
    public static ArrayList<String> addElement(ArrayList<String> name, String anyName) {
        name.add(anyName);
        return name;
    }

    /**
     * The method "addElementWithIndex" adds the string value by item number.
     * @param index - the number of index.
     * @param anyName - the string's value.
     * @param name - the name our ArrayList's name.
     * @return "ArrayList<String> name".
     */
    private static ArrayList<String> addElementWithIndex(int index, String anyName, ArrayList<String> name) {
        name.add(index, anyName);
        return name;
    }

    /**
     * The method "getElementNumber" returns the string value "ArrayList<String> name" by element index.
     * @param name - the name our ArrayList's name.
     * @param index - the number of index.
     * @return the string value of "ArrayList<String> name".
     */
    private static String getElementNumber(ArrayList<String> name, int index) {
        return name.get(index);
    }

    /**
     * The method "removeElement" deletes a string value by index value
     * and outputs the value to the console.
     * @param name - the name our ArrayList's name.
     * @param index - the index ArrayList's value.
     */
    private static void removeElement(ArrayList<String> name, int index) {
        name.remove(index);
        System.out.println(name);
    }

    /**
     * The method "clearMyArray" clears all values in "ArrayList<String> name"
     * and outputs "ArrayList" to the console.
     * @param name - the name our ArrayList's name.
     */
    private static void clearMyArray(ArrayList<String> name) {
        name.clear();
        System.out.println(name);
    }

    /**
     * The method "naturalSortMyArray" sorts all values in ascending order
     * and outputs "ArrayList" to the console.
     * @param name - the name our ArrayList's name.
     */
    private static void naturalSortMyArray(ArrayList<String> name) {
        name.sort(Comparator.naturalOrder());
        System.out.println(name);
    }

    /**
     * The method "reverseSortMyArray" sorts all values in  descending oder
     * and outputs "ArrayList" to the console.
     * @param name - the name our ArrayList's name.
     */
    private static void reverseSortMyArray(ArrayList<String> name) {
        name.sort(Comparator.reverseOrder());
        System.out.println(name);
    }
}