// FUPQ recebe uma palavra, toda em letras minúsculas, e informa se essa palavra tem letras
//repetidas.

package List3;
import java.util.Scanner;

public class ex3_repeatedLetters {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter with a word all lowercase: ");
        String word = keyboard.next();

        int length = word.length();

        for (int i = 0; i < length - 1; i++) {
            char letter = word.charAt(i);

            for (int c = i + 1; c < length; c++) {
                char nextLetter = word.charAt(c);

                if (letter == nextLetter) {
                    System.out.println("The word " + word + " have repeated letters.");
                    return;
                }
            }
        }
    System.out.println("The word " + word + " does not have repeated letter.");
    }
}
