package Exam5;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String fileName = "";
        String lineRow = "";

        System.out.print("Entre com o nome do arquivo CSV: ");
        fileName = scanner.next();
        System.out.println("");
        System.out.print("== Dados do cadastro ==");
        System.out.println("\n");

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\aless\\Documents\\School\\Projects\\src\\Exam5\\" + fileName));
            while ((lineRow = reader.readLine()) != null) {
                    String[] personInfo = lineRow.split(",");
                System.out.println("Nome: " + personInfo[0] + "\n" + "CPF: " + personInfo[1] + "\n" + "Email: " + personInfo[2] + "\n");
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

    // try {
      //  reader = new BufferedReader(new FileReader(fileName));
      //  while ((lineRow = reader.readLine()) != null) {
        //    String[] personInfo = lineRow.split(",");
          //  System.out.println("Nome: " + personInfo[0] + "\n" + "CPF: " + personInfo[1] + "\n" + "Email: " + personInfo[2] + "\n");
       // }
   // } catch (IOException exception) {
     //   exception.printStackTrace();
   // } finally {
     //   try {
       //     if (reader != null) {            To be used when the code are being tested in the browser
         //       reader.close();
          //  }
       // } catch (IOException exception) {
        //    exception.printStackTrace();
       // }
   // }
 // }

}

// The CSV can be found here: https://docs.google.com/spreadsheets/d/17UC9Je1Hoa99DVbNUdPZGGffg9OaJX9LLKrpz1dPUi8/edit?usp=sharing
