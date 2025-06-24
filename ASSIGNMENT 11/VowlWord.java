

//2.Write a program to enter a sentence form keyboard and also find all the words in that sentence with starting //character as vowel. 

import java.util.Scanner;

public class VowlWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        System.out.println("Words starting with vowels:");
        for (String word : words) {
            if (startsWithVowel(word)) {
                System.out.println(word);
            }
        }

        scanner.close();
    }

    public static boolean startsWithVowel(String word) {
        if (word == null || word.isEmpty()) {
            return false;
        }

        char firstChar = Character.toLowerCase(word.charAt(0));
        return firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u';
    }
}