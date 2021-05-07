// Idem ao exercício anterior, porém o valor da entrada deve ser informado como um percentual,
//de 0 a 100, do total.
package List2;
import java.util.Scanner;


public class ex9_carParcelsWithPercentage {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the full price of the car:");
        double carPrice = keyboard.nextDouble();

        System.out.println("Enter with the percentage advance value:");
        double advancePercentageValue = keyboard.nextDouble();

        System.out.println("Enter with the number of parcels:");
        int parcels = keyboard.nextInt();

        double restValue = (carPrice - (advancePercentageValue / 100 * carPrice));

        double parcelsValue = restValue / parcels;
        System.out.println("The value of parcels of the car is: " + parcelsValue);
    }
}
