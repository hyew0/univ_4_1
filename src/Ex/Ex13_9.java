package Ex;

import java.util.HashMap;
import java.util.Map;

public class Ex13_9 {
    public static void main(String[] args) {
        String text = "apple banana apple cherry banana apple";

        Map<String, Integer> wordCount = new HashMap<>();

        String[] words = text.split(" ");

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("frequency: " + wordCount);

    }
}
