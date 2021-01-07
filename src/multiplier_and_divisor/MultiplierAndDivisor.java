package multiplier_and_divisor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplierAndDivisor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the first number:");
            int a = scanner.nextInt();
            System.out.println("Enter the second number:");
            int b = scanner.nextInt();
            if(a != 0 || b != 0) {
                System.out.println("Least common multiplier: " + leastCommonMultiplier(a, b));
                System.out.println("Greatest Common Divisor: " + greatestCommonDivisor(a, b));
            }else {
                System.out.println("All arguments are NULL");
            }

        }catch (InputMismatchException e) {
            System.out.println("Entered value is not integer X_X");
        }
    }

    static int leastCommonMultiplier(int a, int b){

        if(a == 0 || b == 0) return 0;
        int big = Math.max(a, b);
        int low = Math.min(a, b);
        int inc = low;

        if(low % big == 0) return low;
        while (true){
            low += inc;
            if(low % big == 0) return low;
        }
    }

    static int greatestCommonDivisor(int a, int b){
        if(a == 0 && b == 0) return 0;
        if(a == 0) return b;
        if(b == 0) return a;
        int big = Math.max(a, b);
        int low = Math.min(a, b);

        if(big % low == 0) return low;
        int div = big % low;
        while(true){
            if(low % div == 0) return div;
            big = low;
            low = div;
            div = big % low;
        }
    }
}
