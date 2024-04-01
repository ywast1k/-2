package in;

import java.io.*;
import java.util.*;

public class WordCount {
    public static void wordCount() throws FileNotFoundException {
        File file = new File("input.txt");
        try (Scanner scanner = new Scanner(file)) {
            int words = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                words += line.split(" ").length;
            }

            System.out.println("Количество слов: " + words);
        }
    }

}