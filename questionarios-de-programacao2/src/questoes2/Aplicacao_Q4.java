package questoes2;

import java.util.Scanner;

public class Aplicacao_Q4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int vet[] = new int[5];
		int i, m, pm;
		
		System.out.println("Informe 5 números:");
		
		for (i = 0; i < 5; i++) {
			vet[i] = sc.nextInt();
		}
		m = vet[0];
		pm = 0;
		
		for (i = 1; i < 5; i++) {
			if (vet[i] > m) {
				m = vet[i];
				pm = i;
			}
		}
		
		System.out.println(pm);
		sc.close();
			
	}

}
