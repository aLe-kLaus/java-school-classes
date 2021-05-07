// FUPQ simula os valores para compra parcelada de um carro. O programa deve solicitar ao
//usuário o valor do carro, um valor a ser dado como entrada e o número de parcelas. Como saída,
//deve informar o valor de cada parcela.
package List2;
import java.util.Scanner;

public class ex8_carParcels {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the full price of the car:");
        double carPrice = keyboard.nextDouble();

        System.out.println("Enter with the advance value:");
        double advanceValue = keyboard.nextDouble();

        System.out.println("Enter with the number of parcels:");
        int parcels = keyboard.nextInt();

        double restValue = carPrice - advanceValue;

        double parcelsValue = restValue / parcels;

        System.out.println("The value of parcels of the car is: " + parcelsValue);
    }
}
