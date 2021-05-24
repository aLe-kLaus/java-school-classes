package prova2_2;

import java.util.Scanner;
class Main {
 public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);

 System.out.print("Nome do funcionário regular: ");
 String nome = teclado.next();
 
 System.out.print("Salário bruto do funcionário regular: ");
 double salario = teclado.nextDouble();
 
 Regular r = new Regular(nome, salario);

 System.out.print("Nome do funcionário FreeLancer: ");
 nome = teclado.next();

 System.out.print("Horas trabalhadas: ");
 double horas = teclado.nextDouble();

 System.out.print("Valor da hora: ");
 double valor = teclado.nextDouble();
 
 FreeLancer f = new FreeLancer(nome, horas, valor);
  
 System.out.println("Salário líquido do funcionário regular:" + r.getSalario());
 System.out.println("Salário líquido do freelancer:" + f.getSalario());
 }
}