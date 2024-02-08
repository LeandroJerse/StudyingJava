import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1,numero2,soma;
		
		System.out.println("Digite 2 numeros: ");
		
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		soma = numero1 + numero2;
		System.out.println("Soma = "+soma);
		

	}

}
