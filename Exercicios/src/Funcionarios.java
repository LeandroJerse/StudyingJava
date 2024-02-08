import java.util.Locale;
import java.util.Scanner;

public class Funcionarios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int employee;
		double workHour,payForHour,salary;
		
		System.out.println("employee number: ");
		employee = sc.nextInt();
		
		System.out.println("Worked hours : ");
		workHour = sc.nextDouble();
		
		System.out.println("hourly pay : ");
		payForHour = sc.nextDouble();
		
		salary = workHour * payForHour;
		
		System.out.println("Number: "+employee);
		System.out.printf("Salary: %.2f",salary);
		
		

	}

}
