/*
Que 1: WAP to print the factorial of digits in a given range.
Input: 1-10
*/

class FactorialOfDigitsInRange {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;

        System.out.println("Factorials of digits in the range from " + start + " to " + end + ":");
        for (int num = start; num <= end; num++) {
            int digit = num % 10; // Extract the last digit
            long factorial = calculateFactorial(digit);
            System.out.println("Factorial of " + digit + " is " + factorial);
        }
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1; 
        }
        
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}