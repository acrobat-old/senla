package split_sentence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SplitSentence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> collection = new ArrayList<>();
        System.out.println("Enter your sentence:");
        String sentence = scanner.nextLine();
        for(String word : sentence.split("\\s+")){
            collection.add(capitalize(word));
        }
        Collections.sort(collection);
        System.out.println("Number of words in sentence: " + collection.size());
        System.out.println("List of words in sentence:");
        for(String word : collection){
            System.out.println(" " + word);
        }
    }
    static String capitalize(String string){
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }
}
