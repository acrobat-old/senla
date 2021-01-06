package numbers_of_occurrences;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sentence:");
        String sentence = scanner.nextLine();
        System.out.println("Enter your word");
        String occurrences = scanner.next().toLowerCase();
        int cout = 0;
        ArrayList<String> words = new ArrayList<>();
        for(String word : sentence.split("\\s+")){
            words.add(word.toLowerCase());
        }
        for(String word : words){
            if(word.equals(occurrences)) cout++;
        }
        if(cout == 0) {
            System.out.println(occurrences + " no occurrences in your sentence.");
        }else {
            System.out.println("In your sentence " + occurrences + " occurrences " + cout + " cout");
        }
    }
}
