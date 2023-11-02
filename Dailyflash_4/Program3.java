/*
Que 3: WAP to find the factorial of a given number.
*/

import java.util.Scanner;

class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.close();

        long factorial = calculateFactorial(num);
        System.out.println("The factorial of " + num + " is " + factorial);
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