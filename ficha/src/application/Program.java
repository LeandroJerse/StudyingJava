package application;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

import entities.Token;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numberPersons;
		System.out.print("Quantas pessoas serao digitadas? ");
		numberPersons = sc.nextInt();
		Token[] person = new Token[numberPersons];
		double altura = 0;
		double menorIdade = 0;

		for (int i = 0; i < person.length; i++) {

			String name;
			int age;
			double height;

			System.out.println("dados da " + (i + 1) + "a pessoa: ");

			System.out.print("Nome: ");
			name = sc.nextLine();
			sc.next();

			System.out.print("idade: ");
			age = sc.nextInt();

			System.out.print("altura: ");
			height = sc.nextDouble();

			altura += height;
			if (age < 16) {

				menorIdade++;

			}

			person[i] = new Token(name, age, height);

		}
		System.out.printf("Altura Media = %.2f\n", person[0].alturaMedia(altura, numberPersons));
		System.out.println(
				"Pessoas com menos de 16 anos: " + (person[0].menorIdadeMedia(menorIdade, numberPersons) * 100) + "%");

		for (int i = 0; i < person.length; i++) {
			if (person[i].getAge() < 16) {
				System.out.println(person[i].getName());
			}
		}
		sc.close();
	}

}
