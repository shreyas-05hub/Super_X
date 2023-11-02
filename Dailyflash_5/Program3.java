/*
Que 3: WAP to check whether the given number is a strong number or not.

*/

import java.util.Scanner;

class StrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        

        if (isStrongNumber(num)) {
            System.out.println(num + " is a strong number.");
        } else {
            System.out.println(num + " is not a strong number.");
        }
    }

    public static boolean isStrongNumber(int num) {
        int originalNum = num;
        int sumOfFactorials = 0;

        while (num > 0) {
            int digit = num % 10;
            sumOfFactorials += factorial(digit);
            num /= 10;
        }

        return sumOfFactorials == originalNum;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}