import java.util.*;
class Employee {
    int employeeId;
    String name;
    double basicSalary;

    // Constructor
    Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Calculate HRA
    double calculateHRA() {
        return basicSalary * 0.20;
    }

    // Calculate DA
    double calculateDA() {
        return basicSalary * 0.10;
    }

    // Calculate Gross Salary
    double calculateGrossSalary() {
        return basicSalary + calculateHRA() + calculateDA();
    }

    // Display salary details
    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + calculateHRA());
        System.out.println("DA: " + calculateDA());
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {

        Employee emp = new Employee(101, "Aviral", 50000);

        emp.displayDetails();
    }
} 
    

