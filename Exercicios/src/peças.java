import java.util.Locale;
import java.util.Scanner;

public class peças {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codigo1,quantidade1,codigo2,quantidade2;
		double preco1,preco2,total;
		System.out.println("digite o codigo, quantidade e valor do produto 1: ");
		codigo1 = sc.nextInt();
		quantidade1 = sc.nextInt();
		preco1 = sc.nextDouble();

		System.out.println("digite o codigo, quantidade e valor do produto 2: ");		
		codigo2 = sc.nextInt();
		quantidade2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		total = quantidade1 *preco1 + quantidade2 * preco2;
		
		System.out.printf("valor a ser pago = $%.2f",total);
	}

}
