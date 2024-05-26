package questoes2;

import java.util.Scanner;

public class Aplicacao_Q5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int vet[] = new int[5];
		int i, k, total, soma = 0;

		System.out.println("Informe 5 números para o vetor: ");

		for (i = 0; i < 5; i++) {
			vet[i] = sc.nextInt();
		}
		for (i = 0; i < 5; i++) {
			total = 0;
			for (k = 1; k <= vet[i]; k++) {
				if((vet[i] % k) == 0) {
					total = total + 1;
				}
			}
			if (total <= 2) {
				soma++;
			}
		}
		
		System.out.println(soma);
		sc.close();
		
	}

}
