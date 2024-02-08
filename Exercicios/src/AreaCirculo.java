import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double pi =3.14159,raio,area;
		System.out.println("Digite a área do circulo: ");
		raio = sc.nextDouble();
		area = pi * Math.pow(raio, 2);
		System.out.printf("A área do ciruclo é %.4f",area);
		

	}

}
