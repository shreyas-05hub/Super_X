/*
Que 4: WAP to print the following pattern
Take input from the user
1 3 5 7
2 4 6 8
9 11 13 15
10 12 14 16
*/

import java.util.Scanner;

class PatternPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = input.nextInt();
        

        int startValue = 1;
        int num = 1;

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(startValue + " ");
                startValue += num;
            }
            startValue += 3;
            num = -num;
            System.out.println();
        }
    }
}