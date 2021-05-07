// Faça Um Programa Que (FUPQ) recebe um número e mostra na tela a divisão inteira desse
//número por 2. Por exemplo, se o usuário digitar 6, o programa deve mostrar 3; se o usuário
//digitar 7, o programa também deve mostrar 3.
package List2;
import java.util.Scanner;

public class ex1_intDivision {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter with a number:");
        int num = keyboard.nextInt();

        int parsedNum = num / 2;

        System.out.println("The integer division of " + num + " is: " + parsedNum );
    }
}
