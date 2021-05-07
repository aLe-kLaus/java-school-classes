// FUPQ recebe um número inteiro e mostra qual o resto da divisão desse número por 16.
package List2;
import java.util.Scanner;

public class ex6_restDivision {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter with a number to be divided:");
        int num = keyboard.nextInt();

        int restNum = num % 16;

        System.out.println("The rest of the division by 16 is: " + restNum);
    }
}
