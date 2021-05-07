// Faça um programa que recebe uma palavra e mostra essa palavra ao contrário.
package List3;

import java.util.Scanner;

public class ex7_wordInverter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter with a word: ");
        String word = keyboard.next();

        String invertedWord = "";
        int length = word.length();

        for (int i = length; i > 0; i--) {
            invertedWord = invertedWord + word.charAt(i - 1);
        }

        System.out.println("The word " + word + " inverted looks like " + invertedWord + ".");
    }
}
