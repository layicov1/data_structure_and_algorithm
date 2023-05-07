package hackerrank.Java;

import java.util.Scanner;

public class JavaRegex2_DuplicateWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            String sentence, result = "";
            String allWords[];
            System.out.print("Enter your sentence: ");
            sentence = sc.nextLine().toLowerCase();  //convert to lower case
            allWords = sentence.split(" ");
            for (int d = 0; d < allWords.length; d++) {
                for (int j = d + 1; j < allWords.length; j++) {
                    if (allWords[d].equals(allWords[j])) {
                        allWords[j] = "remove";
                    }
                }
            }
            for (String word : allWords) {
                if (word != "remove") {
                    result = result + word + " ";
                }
            }
            System.out.println("\nSentence after removing duplicate words: " + result);

        }
    }
}
