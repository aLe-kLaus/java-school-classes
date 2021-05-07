// Faça um programa que solicita ao usuário o preço de um produto e mostra o preço com 15%
//de desconto.

package List2;
import java.util.Scanner;

public class ex11_discountPercentage {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the product price:");
        double price = keyboard.nextDouble();

        double discount = 0.15 * price;
        double discountPrice = price - discount;

        System.out.println("With 15% of discount, the value of this product is: " + discountPrice );
    }
}
