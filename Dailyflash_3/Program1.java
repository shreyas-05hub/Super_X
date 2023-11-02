/*
Que 1 : WAP to print the following pattern
Take input from user
A B C D
D C B A
A B C D
D C B A
*/

import java.util.Scanner;

class PatternPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = input.nextInt();
      

        for (int i = 1; i <= numRows; i++) {
            if (i % 2 != 0) {
                // Print in ascending order
                for (int j = 1; j <= numRows; j++) {
                    char currentChar = (char) ('A' + j - 1);
                    System.out.print(currentChar + " ");
                }
            } else {
                // Print in descending order
                for (int j = numRows; j >= 1; j--) {
                    char currentChar = (char) ('A' + j - 1);
                    System.out.print(currentChar + " ");
                }
            }
            System.out.println();
        }
    }
}