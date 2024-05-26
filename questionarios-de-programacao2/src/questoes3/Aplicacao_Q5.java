package questoes3;

import java.util.Scanner;

public class Aplicacao_Q5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int v[] = new int[10];
		int c[] = new int[10];
		int i = 0, k = 0, total, numero = 0;
		
		System.out.println("Informe 10 zeros ou uns: ");
		
		for (i = 0; i < 10; i++) {
			v[i] = sc.nextInt();
		}
		i = 0;
		
		while (i < 10) {
			 total = 0;
			 while ((i <10) && (v[i] == numero)) {
				 total++;
				 i++;
			 }
			 c[k] = total;
			 k++;
			 
			 if (numero  == 0) {
				 numero = 1;
			 } else {
				 numero = 0;
			 }	
		}
		
		for (i = 0; i < k; i++) {
			System.out.println(c[i] + "  ");
		}
		sc.close();
	}

}
