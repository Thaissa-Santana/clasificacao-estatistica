package questoes2;

import java.util.Scanner;

public class Aplicacao_Q2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vet[] = new int[6];
		int i, k, soma = 0;
		
		System.out.println("Informe 6 números: ");
		
		for (i = 0; i < 6; i++) {
			vet[i] = sc.nextInt();
		}
		
		k = 5;
		
		for (i = 0; i < 3; i++) {
			soma = vet[i] + vet[k];
			System.out.println(soma + "   ");
			k = k - 1;
		}
		
		sc.close();

	}

}
