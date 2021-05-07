// FUPQ recebe um número decimal e arredonda esse número com 1 casa após a vírgula.
package List2;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ex4_decimalRounding {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat decimalFormatter = new DecimalFormat("#.0");

        System.out.println("Enter the decimal value:");
        double value = keyboard.nextDouble();

        String roundedValue = decimalFormatter.format(value);

        System.out.println("The rounded value is:" + roundedValue);
    }
}
