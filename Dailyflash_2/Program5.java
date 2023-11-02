/*
Que 5 : WAP to check whether the string contains vowels and return
the count of vowels.
*/

import java.util.Scanner;

class VowelCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();
       

        int vowelCount = countVowels(inputString);
        System.out.println("The string contains " + vowelCount + " vowel(s).");
    }

    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive matching
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}