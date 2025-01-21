package ArrayList;

public class QuickSortMyArrayList {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();

        myArrayList.add(9);
        myArrayList.add(8);
        myArrayList.add(15);
        myArrayList.add(3);
        myArrayList.add(2);
        myArrayList.add(1);
        myArrayList.add(0);
        myArrayList.add(22);
        myArrayList.add(13);
        myArrayList.add(4);

        /*
         * Вывод списка элементов до сортировки.
         */
        System.out.println("\nДо сортировки: ");
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.print(myArrayList.get(i) + " ");
        }

        myArrayList.quickSort();

        /*
         * Вывод списка после сортировки.
         */
        System.out.println("\n\nПосле сортировки: ");
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.print(myArrayList.get(i) + " ");
        }

        /*
         * Вывод списка после добавления элемента.
         */
        myArrayList.add(10);
        System.out.println("\n\nСписок после добавления 10 элемента: ");
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.print(myArrayList.get(i) + " ");
        }

        /*
         * Вывод списка после добавления элемента по индексу.
         */
        myArrayList.add(2, 66);
        System.out.println("\n\nСписок после добавления 66 элемента по индексу 2: ");
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.print(myArrayList.get(i) + " ");
        }

        /*
         * Вывод элемента по указанному индексу.
         */
        System.out.println("\n\nЭлемент по индексу 3: \n" + myArrayList.get(3));

        /*
         * Вывод списка после удаления элемента по индексу.
         */
        myArrayList.remove(4);
        System.out.println("\nЭлементы после удаления элемента по индексу 4: ");
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.print(myArrayList.get(i) + " ");
        }

        myArrayList.clear();
        System.out.println("\n\nЭлементы после очистки коллекции: ");
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.print(myArrayList);
        }
    }
}
