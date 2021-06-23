package Exam5;
import java.io.*;
import java.util.Scanner;

public class CsvReader {
    private String fileName;
    private String lineRow;

    public void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o nome do arquivo CSV: ");
        this.fileName = scanner.next();

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(this.fileName));
            while ((this.lineRow = reader.readLine()) != null) {
                String[] personInfo = lineRow.split(",");
                System.out.println("Nome: " + personInfo[0] + "\n" + "CPF: " + personInfo[1] + "\n" + "Email: " + personInfo[2]);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
