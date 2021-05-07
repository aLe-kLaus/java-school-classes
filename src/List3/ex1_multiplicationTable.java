// Faça Um Programa Que (FUPQ) recebe um número inteiro entre 2 e 9 e mostra a tabuada
//desse número.

package List3;
import java.util.Scanner;

public class ex1_multiplicationTable {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter with a number between 2 and 9: ");
        int num = keyboard.nextInt();

        System.out.println("Multiplication table of " + num);

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
