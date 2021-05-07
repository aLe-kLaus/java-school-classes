// Considere um triângulo-retângulo com os lados A, B e C, onde A é a hipotenusa. Faça um
//programa que recebe as medidas de B e C e calcula a medida de A.
package List2;
import java.util.Scanner;

public class ex7_hypotenuseCalc {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter with the side B of the rectangle triangle:");
        double bSide = keyboard.nextDouble();

        System.out.println("Enter with the side C of the rectangle triangle:");
        double cSide = keyboard.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(bSide, 2) + Math.pow(cSide, 2));

        System.out.println("The hypotenuse of this rectangle triangle is: " + hypotenuse);
    }
}
