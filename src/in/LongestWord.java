package in;
import java.io.*;
import java.util.*;

public class LongestWord {
    public static void longestWord() throws FileNotFoundException {
        File file = new File("input.txt");
        try (Scanner scanner = new Scanner(file)) {
            String longestWord = "";
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (String word : line.split(" ")) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }

            System.out.println("Самое длинное слово: " + longestWord);
        }
    }
}