/*
Que 4: WAP to print the sum of digits in a given range.
Input: 1 to 10
Input: 21 to 30
*/


import java.util.Scanner;

class SumOfDigitsInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = input.nextInt();
        System.out.print("Enter the ending number: ");
        int end = input.nextInt();
        input.close();

        for (int num = start; num <= end; num++) {
            int sumOfDigits = calculateSumOfDigits(num);
            System.out.println("Sum of digits for " + num + " is " + sumOfDigits);
        }
    }

    public static int calculateSumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}