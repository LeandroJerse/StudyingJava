package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name= sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary= sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax= sc.nextDouble();
		System.out.println();
		System.out.println("Employee: "+employee.name+", $"+employee.netSalary());
		System.out.println();
		System.out.print("Which percent to incrase salary ?");
		double percentage;
		percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update data: "+employee.name+",$ "+employee.netSalary());

		
		
		sc.close();

	}

}
