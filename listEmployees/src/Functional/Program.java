package Functional;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);


		char numberEmployees = 'y';
		int counter =1;

		List<Employees> employees = new ArrayList<>();





		while (numberEmployees == 'y' || numberEmployees == 'Y') {

			System.out.println("Employee #" + (counter) + ":");
			counter++;
			System.out.print("Id: ");
			int id = sc.nextInt();
			Integer pos = position(employees, id);

			if (pos != null) {
				while (pos != null) {
					System.out.println("This Id already exist, type another one");
					System.out.print("Id: ");
					id = sc.nextInt();
					pos = position(employees, id);

				}
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.println("Salary: ");
			Double salary = sc.nextDouble();

			Employees emp = new Employees(id, name, salary);
			employees.add(emp);
			System.out.println("There are any more employee?(y/n) ");
			numberEmployees=sc.next().charAt(0);

		}
        do {
		System.out.println("Enter the employee that will have salary increase: ");
		int idSalary = sc.nextInt();
		Integer pos = position(employees, idSalary);
		if (pos == null) {
			while (pos == null) {
				System.out.print("Invalid Id, type another one: ");
				idSalary = sc.nextInt();
				pos = position(employees, idSalary);
			}
		}
		System.out.println("Enter the percentage");
		double percentage=sc.nextDouble();
		employees.get(pos).increaseSalary(percentage);
		System.out.println("Any more?(y/n) ");
		numberEmployees=sc.next().charAt(0);
        } while (numberEmployees == 'y' || numberEmployees == 'Y');
		int i=0;
		for(Employees emp: employees) {
			i++;
			System.out.println(i + "#  "+emp);
			
		}

		sc.close();
	}

	public static Integer position(List<Employees> employees, int id) {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
