/*
Que 4 : WAP to print each reverse numbers in the given range
Input: start:25435
end: 25449
*/

import java.util.Scanner;

class ReverseNumbersInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the start value: ");
        int start = input.nextInt();
        System.out.print("Enter the end value: ");
        int end = input.nextInt();

        System.out.println("Reverse numbers in the range from " + start + " to " + end + ":");
        for (int num = start; num <= end; num++) {
            int reverse = reverseNumber(num);
            System.out.println(num + " reversed is " + reverse);
        }
    }

    public static int reverseNumber(int num) {
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return reversedNum;
    }
}