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
    }

    private ArrayList<String> addElement(ArrayList<String> name) {
        name.add("Ihar");
        System.out.println(name);
        return name;
    }

    private ArrayList<String> addElementWithIndex(int index, ArrayList<String> name) {
        name.add(3, "Vladimir");
        System.out.println(name);
        return name;
    }

    private ArrayList<String>
        System.out.println(name.get(6));

        name.remove(4);
        System.out.println(name);

        name.clear();
        System.out.println(name);

        name.sort(Comparator.naturalOrder());
        System.out.println(name);

        name.sort(Comparator.reverseOrder());
        System.out.println(name);
}
