package functional;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int m, n;
		int valor;
		System.out.println("Digite o tamanho da linha e coluna da matriz: ");
		m = sc.nextInt();
		n = sc.nextInt();

		int[][] matriz = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("Matriz[%d][%d]: ", i + 1, j + 1);
				matriz[i][j] = sc.nextInt();
			}

		}
		System.out.print("Qual valor deseja procurar? ");
		valor = sc.nextInt();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (valor == matriz[i][j]) {
					System.out.println("Posiction " + i + "," + j);
					if (i != 0) {
						System.out.println("Up: " + matriz[i - 1][j]);
					}
					if (j != 0) {
						System.out.println("Left: " + matriz[i][j - 1]);
					}
					if (j <= n - 2) {
						System.out.println("Right: " + matriz[i][j + 1]);
					}
					if (i <= m - 2) {
						System.out.println("Down: " + matriz[i + 1][j]);
					}
				}

			}

		}

		sc.close();

	}

}
