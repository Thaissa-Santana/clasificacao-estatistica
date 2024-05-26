package questoes3;

import java.util.Scanner;

public class Aplicacao_Q2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int va[] = new int[4];
		int vb[] = new int[4];
		int n, i, r;

		System.out.println("Informe 4 números: ");

		for (i = 0; i < 4; i++) {
			va[i] = sc.nextInt();
		}

		for (i = 0; i < 4; i++) {
			n = va[i] - 1;
			r = va[i];
			while (n > 0) {
				r = r * n;
				n = n - 1;
			}
			vb[i] = r;
		}

		for (i = 0; i < 4; i++) {
			System.out.println(vb[i] + "  ");
		}
		sc.close();
	}

}
