package functional;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int condictional;
		float side1, side2, side3;
		Triangle triangle;

		System.out.println("Do you want to type the triangle's sides?\n[1]Yes\t[2]No");
		condictional=sc.nextInt();
		if(condictional !=1 ) {
			triangle = new Triangle();
		}
		else {
		System.out.println("Type de triangle's sides: ");
		side1 = sc.nextFloat();
		side2 = sc.nextFloat();
		side3 = sc.nextFloat();
		triangle = new Triangle(side1, side2, side3);
		}
		System.out.println(triangle.PossibleTriangle());
		System.out.println(triangle.Type());
		
		sc.close();
		

	}

}
