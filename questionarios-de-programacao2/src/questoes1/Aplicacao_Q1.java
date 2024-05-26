package questoes1;

import java.util.Scanner;

public class Aplicacao_Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, j, n, lin = -1, col = -1;
		int mat[][] = new int [2][2];
		
		System.out.println("Informe quatro valores para a matriz: ");
		
		for (i = 0; i < 2; i++) {
			for(j = 0; j < 2; j++) {
				mat[i][j] = sc.nextInt();			
			}
		}
		
		System.out.println("Informe um número: ");
		n = sc.nextInt();
		
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				if (n == mat [i][j]) {
					lin = i;
					col = j;
				}
			}
		}
		
		System.out.println(lin + " " + col);

	}

}
