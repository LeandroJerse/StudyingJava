package functional;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

import entities.Queen;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		System.out.println("Type te coordinates: (format: X , Y)");
		x = sc.nextInt();
		sc.next();
		y = sc.nextInt();

		Queen[] queen = new Queen[8];
		for (int i = 0; i < 8; i++) {

			if (i == 0) {
				queen[i] = new Queen(x, y);
				x = 0;
				y = 0;
			} 
			else {

				int[] comparativeArray = new int[2];
				comparativeArray[0] = x;
				comparativeArray[1] = y;

				// Busca se se repete
				for (int k = 0; k < i; k++) {
					int securityVariable = 0;
					for (int[] coordinates : queen[k].possibleCoordinates) {

						if (comparativeArray == coordinates) {
							securityVariable = 1;
							break;
						}
					}

					if (securityVariable == 1) {

						if (x == 8 || y == 8) {
							x = 0;
							y = 0;
						}
						if (x == 8) {
							x = 0;
							y++;
						} else {
							x++;
						}

						i--;
						break;
					}
					queen[i]= new Queen(x,y);
					queen[i].setPossibleCoordinates();
				}
			}
		

			
		}
		
		for (int i=0;i<8;i++) {
			System.out.println(queen[i].toString());
			
		}


	}

}
