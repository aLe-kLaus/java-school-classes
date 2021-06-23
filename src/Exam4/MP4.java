package Exam4;
import java.util.Scanner;

public class MP4 extends File {
    private String dimensions;
    private double FPS;

    public void setDimensions(String dimensions){
        this.dimensions = dimensions;
    }

    public void setFPS(double FPS){
        this.FPS = FPS;
    }

    public MP4() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Vamos criar um arquivo MP4");

        System.out.print("Nome: ");
        this.setName(keyboard.next());

        System.out.print("Dimensões: ");
        setDimensions(keyboard.next());

        System.out.print("FPS: ");
        setFPS(keyboard.nextDouble());
    }

    public String getDimension() {
        return this.dimensions;
    }

    public double getFPS() {
        return this.FPS;
    }

    public String toString() {
        return "Arquivo " + this.getName() + ", formato MP4, dimensões " + this.getDimension() + ", FPS " + this.getFPS();
    }
}
