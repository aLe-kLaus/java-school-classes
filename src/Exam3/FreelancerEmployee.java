package Exam3;

public class FreelancerEmployee {
    public String name;
    public double liquidSalary;
    public double bruteSalary;
    public double discount;
    public double hours;
    public double hourPrice;

    public FreelancerEmployee(String freelancerName, double freelancerHours, double freelancerHourPrice) {
        this.name = freelancerName;
        this.hours = freelancerHours;
        this.hourPrice = freelancerHourPrice;
    }

    public double getFreelancerSalary() {
        bruteSalary = hours * hourPrice;
        discount = bruteSalary * 0.25;
        liquidSalary = bruteSalary - discount;

        return liquidSalary;
    }
}
