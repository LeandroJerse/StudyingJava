import java.util.Scanner;

public class scan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Para poder ler uma variavel, devemos escrever esse scanner sempre acima do programa
		
		String x;
		x = sc.next();
		System.out.println("voce digitou:" + x);
		int y;
		y=sc.nextInt();
		System.out.println(y);
				
        sc.close();
	}

}
