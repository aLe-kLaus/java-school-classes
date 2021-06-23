package Exam3;

public class RegularEmployee {
    public String name;
    public double bruteSalary;
    public double liquidSalary;
    public double discount;

    public RegularEmployee(String regularName, double regularEmployeeSalary) {
        this.name = regularName;
        this.bruteSalary = regularEmployeeSalary;
    }

    public double getRegularSalary() {
        discount = bruteSalary * 0.15;
        liquidSalary = bruteSalary - discount;
        return liquidSalary;
    }
}
