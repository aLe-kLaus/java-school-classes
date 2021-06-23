package Exam4;
import java.util.Scanner;

public class Word extends File {
    private String model;

    public void setModel(String model){
        this.model = model;
    }

    public Word () {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Vamos crirar um arquivo do Word");

        System.out.print("Nome: ");
        this.setName(keyboard.next());

        System.out.print("Modelo: ");
        setModel(keyboard.next());
    }

    public String getModel() {
        return this.model;
    }

    public String toString() {
        return "Arquivo " + this.getName() + ", formato Word, modelo " + this.getModel();
    }

}
