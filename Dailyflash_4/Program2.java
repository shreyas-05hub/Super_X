/*
Que 2: WAP to print the following pattern
Take row input from the user
A
B A
C B A
D C B A
*/

import java.util.Scanner;

class PatternPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = input.nextInt();
        

        for (int i = 1; i <= numRows; i++) {
            char currentChar = (char) ('A' + i - 1);
            for (int j = 1; j <= i; j++) {
                System.out.print(currentChar + " ");
                currentChar--;
            }
            System.out.println();
        }
    }
}