// Um colega lhe pediu dinheiro emprestado. Você aceitou emprestar, mas com a condição de
//que ele irá devolver o valor emprestado com juros de 15%. FUPQ recebe o valor que o colega
//pediu e informa quanto ele terá que devolver depois.
package List2;
import java.util.Scanner;

public class ex2_fees {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the borrowed amount:");
        double value = keyboard.nextDouble();

        double amount = value + (value * 0.15);

        System.out.println("The amount borrowed with interest is: " + amount);

    }
}
