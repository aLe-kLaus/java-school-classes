// FUPQ recebe uma nota de 0 a 10 e aplica a ela o novo sistema de arredondamento do Câmpus
//Sapiranga (0.1 em vez de 0.5), mostrando na tela o valor final arredondado.
package List2;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class ex5_roundedGrade {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat decimalFormatter = new DecimalFormat("#.0");
        decimalFormatter.setRoundingMode(RoundingMode.CEILING);

        System.out.println("Enter your grade (0 to 10):");
        double grade = keyboard.nextDouble();

        String roundedGrade = decimalFormatter.format(grade);

        System.out.println("The grade with the Ifsul rounding mode is: " + roundedGrade);
    }
}
