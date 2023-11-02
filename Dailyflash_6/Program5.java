/*
Que 5: WAP to replace vowels to # in given string
Input:Meta Data
output: M#t# D#t#
*/

import java.util.Scanner;

class ReplaceVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();
        

        String result = replaceVowelsWithHash(inputString);
        System.out.println("Output: " + result);
    }

    public static String replaceVowelsWithHash(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = Character.toLowerCase(chars[i]);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                chars[i] = '#';
            }
        }
        return new String(chars);
    }
}