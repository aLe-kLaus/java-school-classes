// Faça um programa que recebe uma palavra e determina quantas vogais ela possui.
package List3;
import java.util.Locale;
import java.util.Scanner;

public class ex8_vowels {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter with a word: ");
        String word = keyboard.next();

        word = word.toUpperCase();

        int vowels = 0;
        int length = word.length();

        for (int i = 0; i < length; i++) {
            char letter = word.charAt(i);

            if (letter == 'A'|| letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                vowels = vowels + 1;
            }
        }
        System.out.println("The word has " + vowels + " vowels.");
    }
}
