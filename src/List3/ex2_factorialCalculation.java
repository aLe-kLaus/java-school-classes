// FUPQ recebe um número inteiro entre 0 e 20 e mostra o fatorial desse número.

package List3;
import java.util.Scanner;

public class ex2_factorialCalculation {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter with a number between 0 and 20: ");
        int num = keyboard.nextInt();

        int factorial = 1;

        for (int i = num; i > 1; i --) {
            factorial = factorial * i;
        }

        System.out.println("The Factorial of " + num + "is: " + factorial);
    }
}
