package questoes1;

import java.util.Scanner;

public class Aplicacao_Q3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int va[] = new int [4];
		int vb[] = new int [4];
		int x, p = 0, i;
		
		System.out.println("Informe 4 números: ");
		
		for (i = 0; i < 4 ; i++) {
			va[i] = sc.nextInt();
		}
		
		System.out.println("Informe mais 4 números: ");
		
		for (i = 0; i < 4; i++) {
			vb[i] = sc.nextInt();
		}
		
		for (i = 0; i < 4; i++) {
			for (x = 0; x < 4; x++) {
				if (va[i] == vb[x]) {
					p++;
				}
			}
		}
		
		System.out.println();
		System.out.println(p);
		sc.close();

	}

}
