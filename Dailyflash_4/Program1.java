/*
Que 1: WAP to print the following pattern
Take input from the user
A B C D
# # # #
A B C D
# # # #
A B C D
*/

import java.util.Scanner;

 class PatternPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = input.nextInt();
        

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i % 2 == 1) {
                    System.out.print((char) ('A' + j - 1) + " ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}