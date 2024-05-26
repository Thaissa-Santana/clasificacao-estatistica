package questoes3;

import java.util.Scanner;

public class Aplicacao_Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vet[] = new int[5];
		int i;
		
		System.out.println("Informe 5 números: ");
		
		for (i = 0; i < 5; i++) {
			vet[i] = sc.nextInt();
		}
		
		for (i = 0; i < 5; i++) {
			if (((i % 2) == 1) && (vet[i] > 20)) {
				System.out.println(vet[i] + "  ");
			}
		}
		
		sc.close();
	}

}
