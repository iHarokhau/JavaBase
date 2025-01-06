package Homework.String;

/*
Перевернуть строку и вывести на консоль
String string = "I love Java"
 */

public class ReverseTheString {
    /**
     * Метод main используется для хранения начальных данных,
     * запуска программы и вывода в консоль наших результатов.
     * @param args
     */
    public static void main(String[] args) {
        String string = "I love Java";

        System.out.println(string + "\n" + reverseString(string));
    }

    /**
     * Метод reverseString реверсирует строку и возвращает результат.
     * @param string
     * @return
     */
    private static String reverseString(String string){
        return new StringBuilder(string).reverse().toString();
    }
}
