// Faça um programa que converte uma medida de temperatura de Fahrenheit para Celsius.

package List2;
import java.util.Scanner;

public class ex10_celsiusConverter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the Fahrenheit temperature");
        double fTemperature = keyboard.nextDouble();

        double celsiusTemperature = (fTemperature - 32) * 5/9;

        System.out.println("The equivalent in Celsius is: " + celsiusTemperature);
    }
}
