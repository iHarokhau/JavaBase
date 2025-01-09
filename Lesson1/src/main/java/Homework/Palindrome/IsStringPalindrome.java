package Homework.Palindrome;

import java.util.Scanner;

/*
 Определить, что строка является палиндромом
 Сложность по памяти O(1), не создавать новые String, StringBuilder
 Примеры:
 abc - false
 112233 - false
 aba - true
 112211 - true
*/

public class IsStringPalindrome {

    /**
     * Method "main" runs the program and output the result to the console.
     * @param args
     */
    public static void main(String[] args) {
        if (!isPalindrome(inputValue())){
            System.out.println("The string isn't palindrome!");
        } else{
            System.out.println("The string is palindrome!");
        }
    }

    /**
     * Method "inputValue" reads the value from the keyboard
     * and saves it to the variable "scanner".
     * @return
     */
    private static String inputValue (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value: ");
        return scanner.nextLine();
    }

    /**
     * Method "isPalindrome" divides the length of the string in half
     * and calculates matching values on the left and right.
     * @param value
     * @return
     */
    private static boolean isPalindrome(String value){
        boolean result = false;

        for (int i = 0; i < (value.length() / 2); i++) {
            if (value.charAt(i) != value.charAt(value.length() - i - 1)){
                result = false;
            }
            else result = true;
        }

        return result;
    }
}
