package in;
import java.io.*;
import java.util.*;

public class WordFrequency {
    public static void wordFrequency() throws FileNotFoundException {
        File file = new File("input.txt");
        try (Scanner scanner = new Scanner(file)) {
            Map<String, Integer> frequencyMap = new HashMap<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (String word : line.split(" ")) {
                    frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
                }
            }

            for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
                System.out.println("Слово: " + entry.getKey() + ", Частота: " + entry.getValue());
            }
        }
    }
}