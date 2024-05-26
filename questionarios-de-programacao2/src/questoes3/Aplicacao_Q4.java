package questoes3;

import java.util.Scanner;

public class Aplicacao_Q4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int mat[][] = new int[2][2];
		int i, j, r = 0;
		
		System.out.println("Informe quatro números para a matriz: ");
		
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		for (j = 0; j < 2; j++) {
			r = 0;
			for (i = 0; i < 2; i++) {
				r = r + mat[i][j];
			}
			System.out.println(r + "  ");
		}
		
	}

}
