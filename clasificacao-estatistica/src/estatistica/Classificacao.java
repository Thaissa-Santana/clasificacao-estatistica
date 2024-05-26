package estatistica;

import java.util.Scanner;

public class Classificacao {

	public static void main(String[] args) {
		
		float As;
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("\n*** CLASSIFICAÇÃO DA ASSIMETRIA ***\n");
		
		
		System.out.println("- DESLOCAMENTO DA CURVA -\n");
		
		System.out.println("Digite o valor de As: ");
		As = sc.nextFloat();
		
			if (As > 0) {
				System.out.println("\n A distribuição assimétrica quando ao deslocamento da curva é DIREITA ou POSITIVA. \n");
				
			} else if (As < 0){
				System.out.println("\n A distribuição assimétrica quando ao deslocamento da curva é ESQUERDA ou NEGATIVA. \n");
				
			} else {
				System.out.println("\n A distribuição assimétrica quando ao deslocamento da curva  é NULA. \n");		// As = 0
			}
			
		System.out.println("- GRAU DA CURVA -\n");
//		System.out.println("Antes de informar o valor, lembre-se que o módulo de |As| é sempre o resultado em positivo.\n");
		
		
		System.out.println("Digite o valor de |As|: ");
		As = sc.nextFloat();
																						
			if (As <= 0.15) {
				System.out.println("\n Sua assimetria quanto ao grau da curva é FRACA.");				//  |As| <=0.15
			}
																						
			else if  (As > 0.15 && As<=1) {
				System.out.println("\n Sua assimetria quanto ao grau da curva é MODERADA.");		// 0.15 < |As| <= 1
			} 
			
			else {																	
				System.out.println("\n Sua assimetria quanto ao grau da curva é FORTE");				// |As| > 1
			}
		
		sc.close();

	}

}
