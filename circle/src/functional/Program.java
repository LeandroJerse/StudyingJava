package functional;

import java.util.Locale;
import java.util.Scanner;

import entities.Circle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x,y;
		String name;
		double radius;
		Circle circle;
		

		
		System.out.println("Set a name for the circle:\t ");
		name = sc.nextLine();
		System.out.println("Set the circle's radius: \t");
		radius = sc.nextDouble();
		System.out.println("Set the center coordinates:(format: x , y)\t ");
		x=sc.nextDouble();
		sc.next();
		y=sc.nextDouble();
		circle = new  Circle(name,x, y, radius);
		System.out.println(circle.toString());



	}

}
