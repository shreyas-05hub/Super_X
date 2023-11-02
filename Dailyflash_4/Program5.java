/*
Que 5: WAP to toggle the String to uppercase or lowercase
Input: Java output: jAVA
Input: data output: DATA
*/


import java.util.Scanner;

class ToggleCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();
        input.close();

        String result = convertLowerCaseToUpperCaseToLower(inputString);
        System.out.println("Output: " + result);
    }

    public static String convertLowerCaseToUpperCaseToLower(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (Character.isLowerCase(ch)) {
                chars[i] = Character.toUpperCase(ch);
            } else if (Character.isUpperCase(ch)) {
                chars[i] = Character.toLowerCase(ch);
            }
        }
        return new String(chars);
    }
}