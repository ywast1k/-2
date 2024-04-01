import java.io.*;


import in.LongestWord;
import in.WordCount;
import in.WordFrequency;


public class App {
    public static void main(String[] args) throws FileNotFoundException {
        
        WordCount.wordCount();
        System.out.println("------------------");
        LongestWord.longestWord();
        System.out.println("------------------");
        WordFrequency.wordFrequency();
        System.out.println("------------------");
    }

  

   

   
}
