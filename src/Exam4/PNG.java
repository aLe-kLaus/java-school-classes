package Exam4;
import java.util.Scanner;

public class PNG extends File {
    private String dimensions;

    public void setDimensions(String dimensions){
        this.dimensions = dimensions;
    }

    public PNG () {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Vamos criar um arquivo PNG");

        System.out.print("Nome: ");
        this.setName(keyboard.next());

        System.out.print("Dimensões: ");
        setDimensions(keyboard.next());
    }

    public String getDimension() {
        return this.dimensions;
    }

    public String toString() {
        return "Arquivo " + this.getName() + ", formato PNG, dimensões " + this.getDimension();
    }
}
