package Homework.FindLengthOfLastWord;

/*
 Найти длину последнего слова в строке. В строке только буквы и пробелы.
 "Hello world" - 5
 "    fly me    to the moon    " - 4
*/

import java.util.Scanner;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(textInput()));
    }

    private static String textInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        return scanner.nextLine();
    }

    private static Integer lengthOfLastWord(String text) {
        int i;
        for (i = text.length() - 1; i >= 0; i--) {
            if (text.charAt(i) == ' ') {
                return i = text.length() - i - 1;
            }
            if (i == -1){
                i = text.length();
            }
        }
        return text.length();
    }
}