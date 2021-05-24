package Exam2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Nome do funcionário regular: ");
        String regularEmployName = keyboard.next();

        System.out.print("Salário bruto do funcionário regular: ");
        double regularEmployeeSalary = keyboard.nextDouble();

        System.out.print("Nome do freelancer: ");
        String freelancerName = keyboard.next();

        System.out.print("Total de horas trabalhadas: ");
        double freelancerHours = keyboard.nextDouble();

        System.out.print("Valor da hora: ");
        double freelancerHourPrice = keyboard.nextDouble();

        FreelancerEmployee freelancer = new FreelancerEmployee(freelancerName, freelancerHours, freelancerHourPrice);
        RegularEmployee regular = new RegularEmployee(regularEmployName, regularEmployeeSalary);

        System.out.println("Salário líquido do funcionário regular: " + regular.getRegularSalary());
        System.out.println("Salário líquido do freelancer: " + freelancer.getFreelancerSalary());




    }
}
