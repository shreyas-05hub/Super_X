/*
Que 5 : WAP to check whether the string contains characters other than
letters.
*/

import java.util.Scanner;

class CharacterCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();
       

        if (containsNonLetters(inputString)) {
            System.out.println("The string contains non-alphabetic characters.");
        } else {
            System.out.println("The string consists only of alphabetic characters.");
        }
    }

    public static boolean containsNonLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetter(ch)) {
                return true; 
            }
        }
        return false; 
    }
}