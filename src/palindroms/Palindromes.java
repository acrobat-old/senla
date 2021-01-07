package palindroms;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindromes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> palindromes = new ArrayList<>();
        try {
            System.out.println("Enter a sequence length not exceeding 100(not less 0)");
            int limitOfSequence = scanner.nextInt();
            if(limitOfSequence < 0 || limitOfSequence > 100){
                System.out.println("Length of sequence need be max 100 and not min 0");
            }else {
                for (int i = 0; i <= limitOfSequence; i++) {
                    if(isPalindrome(i)){
                        palindromes.add(i);
                    }
                }
                for(Integer integer : palindromes){
                    System.out.println(integer);
                }
            }
        }catch (InputMismatchException e){
            System.out.println("You must enter an integer value");
        }
    }

    static boolean isPalindrome(int number){
        String string = ""+number;
        return string.equals(new StringBuffer(string).reverse().toString());
    }
}
