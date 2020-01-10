package com.unitTesting;

public class Employee {
    private static int empId;
    private String empName;
    private double salary;
    private double hoursWorked;
    private int age;
    private Object department;


    public Employee(String empName, double salary, double hoursWorked, int age, Object department) {
        this.empName = empName;
        this.salary = salary;
        this.hoursWorked = hoursWorked;
        this.age = age;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Object getDepartment() {
        return department;
    }

    public void setDepartment(Object department) {
        this.department = department;
    }

    public String getEmpName() {
        return empName;
    }
}
