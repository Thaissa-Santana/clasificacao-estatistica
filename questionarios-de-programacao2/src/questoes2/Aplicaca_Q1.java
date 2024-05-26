package questoes2;

import java.util.Scanner;

public class Aplicaca_Q1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int va[] = new int[4];
		int i = 0, auxa;

		System.out.println("Informe 4 números para o vetor: ");

		for (i = 0; i < 4; i++) {
			va[i] = sc.nextInt();
		}
		
		for (i = 0; i < 2; i++) {
			auxa = va[i];
			va[i] = va[3 - i];
			va[3 - i] = auxa;
		}
		
		for (i = 0; i < 4; i++) {
			System.out.println(va[i] + " ");
		}
		
		sc.close();

	}

}
