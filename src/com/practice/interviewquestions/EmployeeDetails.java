/*Write a program by creating an 'Employee' class having the following methods and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.*/

package com.practice.interviewquestions;

public class EmployeeDetails {
	float salary;
	float hours;

	// Creating a getInfo method and passing two parameters inside the parenthesis
	public void getInfo(float Sal, float Hrs) {
		salary = Sal;
		hours = Hrs;
		System.out.println("Salary = " + salary + " " + "No.of Hours= "+ hours );
	}

	// Creating a AddSal method
	float addSalary() {
		if (salary < 500) {
			salary = salary + 10;
			System.out.println("Salary of the employee is less than $500:=" + this.salary);

		} else {
			System.out.println("Salary of the employee is more than $500");

		}
		return salary;

	}

	// Creating a AddWork()
	float addWork() {
		if (hours >= 6) {
			salary = salary + 5;
			System.out.println("The number of hours of work per day is more than 6 hours:" + this.salary);

		} else {
			System.out.println("The number of hours of work per day is less than 6 hours");

		}

		return hours;

	}

	public static void main(String[] args) {
		EmployeeDetails empObj = new EmployeeDetails();
		empObj.getInfo(400, 4);
		empObj.addSalary();
		empObj.addWork();
		
		empObj.getInfo(600,8);
		empObj.addSalary();
		empObj.addWork();
	}

}
