package Homework.FindLengthOfLastWord;

import java.util.Scanner;

/*
 Найти длину последнего слова в строке. В строке только буквы и пробелы.
 "Hello world" - 5
 "    fly me    to the moon    " - 4
*/

public class LengthOfLastWord {
    /**
     * Метод "main" используется для запуска программы.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(textInput()));
    }

    /**
     * Метод "textInput" используется для ввода текста с клавиатуры в консоль
     * и его хранения в переменной "scanner".
     * @return
     */
    private static String textInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        return scanner.nextLine();
    }

    /**
     * Метод "lengthOfLastWord" вычиляет длину последнего слова в строке.
     * @param text
     * @return
     */
    private static Integer lengthOfLastWord(String text) {
        text = text.trim();
        int spaceIndex = -1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex = i;
            }
        }
        return text.length() - spaceIndex - 1;
    }
}