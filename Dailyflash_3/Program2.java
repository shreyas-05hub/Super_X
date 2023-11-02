/*
Que 2 : WAP to print the following pattern
Take row input from user
1
2 1
3 2 1
4 3 2 1
*/

import java.util.Scanner;

class PatternPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = input.nextInt();
        

        for (int i = 1; i <= numRows; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}