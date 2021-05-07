// FUPQ converte o valor de um produto de dólares para reais. O programa deve solicitar o valor
//original do produto, em dólares, e a cotação do dólar, e a seguir mostrar o valor equivalente em
//reais.
package List2;
import java.util.Scanner;

public class ex3_dollarBrQuotation {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter with the amount to be parsed:");
        double amount = keyboard.nextDouble();

        System.out.println("Enter the dollar quotation:");
        double quotation = keyboard.nextDouble();

        double result = amount * quotation;

        System.out.println("The parsed amount is: " + result);
    }
}
