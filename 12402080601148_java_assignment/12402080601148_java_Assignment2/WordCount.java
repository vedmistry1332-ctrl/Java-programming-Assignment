import java.io.*;
import java.util.*;

public class WordCount {

    public static void main(String[] args) {

        HashMap<String, Integer> wordCount = new HashMap<>();

        try {

            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
            String line;

            while ((line = br.readLine()) != null) {

                String words[] = line.toLowerCase().split("\\W+");

                for (String word : words) {

                    if (wordCount.containsKey(word)) {
                        wordCount.put(word, wordCount.get(word) + 1);
                    } else {
                        wordCount.put(word, 1);
                    }
                }
            }

            br.close();

            System.out.println("Word Occurrences:");

            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

        } catch (Exception e) {
            System.out.println("Error reading file.");
        }
    }
}