/*Que 2: WAP to print the following pattern
Take row input from the user
a
A B
a b c
A B C D

*/


import java.util.Scanner;

class PatternPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = input.nextInt();
        

        for (int i = 1; i <= numRows; i++) {
            char currentChar = (i % 2 == 1) ? 'a' : 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(currentChar + " ");
                currentChar++;
            }
            System.out.println();
        }
    }
}