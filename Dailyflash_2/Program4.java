/*
Que 4 : WAP to print the composite numbers in the given range
Input: start:1
end:100
*/

import java.util.Scanner;

class CompositeNumbersInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the start value: ");
        int start = input.nextInt();
        System.out.print("Enter the end value: ");
        int end = input.nextInt();
        

        System.out.println("Composite numbers in the range from " + start + " to " + end + ":");
        for (int num = start; num <= end; num++) {
            if (isComposite(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isComposite(int num) {
        int count =0;
        for (int i = 1; i  <= num; i ++) {
            if (num % i == 0 ) {
                count ++;
            }
        }
       if(count>2){
      return true;
}
        return false;
    }
}