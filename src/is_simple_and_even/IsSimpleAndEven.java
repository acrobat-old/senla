package is_simple_and_even;

import java.util.InputMismatchException;
import java.util.Scanner;


public class IsSimpleAndEven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num;
        try{
            num = scanner.nextInt();
            if(isEven(num)) System.out.println(num + " is even");
            else System.out.println(num + " is not even");
            if(isSimple(num)) System.out.println(num + " is simple");
            else System.out.println(num + " is not simple");
        }catch (InputMismatchException e){
            System.out.println("Entered value is not integer X_X");
        }
    }

    static boolean isSimple(int n){
        for (int i = 2; i <= n; i++) {
            if(i == n) {
                return true;
            }
            if(n%i == 0) {
                return false;
            }
        }
        return false;
    }

    static boolean isEven(int n){
        if(n%2 == 0) return true;
        return false;
    }
}
