package classes_object_oop;

public class EmployeeManagement {
    public static void main(String[] args) {

        // Employee object 1
        Employee emp1 = new Employee();
        emp1.employeeId = 101;
        emp1.employeeName = "Aman Kumar";
        emp1.department = "Software Developer";
        emp1.salary = 50000;

        // Employee object 2
        Employee emp2 = new Employee();
        emp2.employeeId = 102;
        emp2.employeeName = "Rohit Raj";
        emp2.department = "Java Developer";
        emp2.salary = 45000;

        // Employee object 3
        Employee emp3 = new Employee();
        emp3.employeeId = 103;
        emp3.employeeName = "Rahul Kumar";
        emp3.department = "UI/UX Designer";
        emp3.salary = 40000;

        System.out.println("Employee Details");

        emp1.displayEmployeeDetails();
        System.out.println();

        emp2.displayEmployeeDetails();
        System.out.println();

        emp3.displayEmployeeDetails();
        System.out.println();

        System.out.println("Salary Updated");

        emp1.increaseSalary(15);

        emp1.displayEmployeeDetails();

        System.out.println("\nAnnual Salary: " + emp1.calculateAnnualSalary());
        System.out.println("Annual Salary: " + emp2.calculateAnnualSalary());
        System.out.println("Annual Salary: " + emp3.calculateAnnualSalary());

    }
}

// create class
 class Employee {

    int employeeId;
    String employeeName;
    String department;
    double salary;

    void displayEmployeeDetails() {

        System.out.println("Employee ID : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Department : " + department);
        System.out.println("Salary : " + salary);

    }

    void increaseSalary(double percentage) {
        salary = salary + (salary * percentage / 100);

    }

    double calculateAnnualSalary() {
        return salary * 12;
    }
 }
