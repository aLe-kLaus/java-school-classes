// Implementar um jogo de adivinhação de números. O programa deve sortear um número e
//pedir ao usuário que o adivinhe. Para cada resposta do usuário, o programa deve informar se o
//número sorteado é maior ou menor, ou então se o usuário acertou.
package List3;
import java.util.Random;
import java.util.Scanner;

public class ex5_guessTheNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        int numberDrawn = random.nextInt(100);

        System.out.println("Try to guess a number between 0 to 100: ");
        int userTry = keyboard.nextInt();

        int attempts = 1;

        while (numberDrawn != userTry) {
            if (numberDrawn > userTry) {
                System.out.println("The number drawn is higher than your guess, you can try again:");
                userTry = keyboard.nextInt();
            } else {
                System.out.println("The number drawn is lesser than your guess, you can try again:");
                userTry = keyboard.nextInt();
            }
            attempts++;
        }
        keyboard.close();

        System.out.println("You have done it!");
        System.out.println("You find the number drawn in " + attempts + " attempts");
    }
}
