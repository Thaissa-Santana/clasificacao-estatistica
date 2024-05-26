package questoes1;

import java.util.Scanner;

public class Aplicacao_Q5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int mat[][] = new int[2][2];
		int i, j, m;

		System.out.println("Informe quatro números para a matriz: ");

		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		m = mat[0][0];

		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				if (mat[i][j] < m) {
					m = mat[i][j];
				}
			}
		}

		System.out.println();
		System.out.println(m);

		sc.close();

	}
}
