package functional;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

import entities.Coordinates;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x,y;
		int condictional=1;
		Coordinates[] coordinates = new Coordinates[2];
		
		while(condictional ==1) {
					
			for(int i=0; i<2;i++) {
				int forCondictional =0;
				System.out.println("Do you want to type the coordinates:\n[1]Yes\t[2]No\n");
				forCondictional=sc.nextInt();
				if(forCondictional!=1) {
					coordinates[i]= new Coordinates();
					System.out.println("(x,y)=(0,0)");
				}
				else {
				System.out.println("Type the coordenates: format: x , y ");
				x=sc.nextDouble();
				sc.next();
				y=sc.nextDouble();
				coordinates[i]= new Coordinates(x, y);
				}
				
			}
			System.out.println("The distance is: "+coordinates[0].Distance(coordinates[1].getX(), coordinates[1].getY()));
			System.out.println("Do you want to continue:\n\t[1]Yes\t[2]No");
			condictional=sc.nextInt();
		}
		sc.close();
		

	}
}
