package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle rectangle = new Rectangle();

		System.out.println(" Enter rectangule width and height: ");

		rectangle.widht = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		System.out.println("AREA = " + rectangle.area() + "\nPERIMETER = " + rectangle.perimeter() + "\nDIAGONAL = "
				+ rectangle.diagonal());

		sc.close();

	}

}
