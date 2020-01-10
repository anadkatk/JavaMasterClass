package com.unitTesting;

import com.unitTesting.Employee;
import com.unitTesting.department;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
       // System.out.println("The application is running");


        //ageDemon();
        empD();

    }

    public static void empD(){

        department IT = new department("IT",1);
        department sales = new department("Sales",2);
        department hr = new department("Human Resources",3);
        Employee emp1 = new Employee("Jacob",25,40, 25,IT);
        Employee emp2 = new Employee("Jane", 22,35,22,sales);
        System.out.println(emp1.getSalary());
        //emp2.setDepartment(hr);
        System.out.println("Name : " + emp2.getEmpName() + "\nEmployee Age: "+ emp2.getAge() + "\nSalary: " + emp2.getSalary() + "\nHours Worked: " + emp2.getHoursWorked() + "\nEmployee Department: " + emp2.getDepartment() );
    }
    public static void ageDemon(){
        int age;

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter your age Rocio:");

            age = sc.nextInt();



            if(age > 20){
                System.out.println("You are allowed to drink!");
            }
            else if(age < 0){
                System.out.println("You cannot be negetive age");
            }
            else if(age > 62){
                System.out.println("Hello senior citizen.");
            }
            else{
                System.out.println("Not legal to drink!");
            }
        }
    }
}
