package programas_Java;

import java.util.Scanner;

/** 
 * @author Thaissa
 * 
 * Thaissa Santana Santos - Polo Sítio do Quinto
 * 
 * Programa: Pesquisa de Satisfação de um Restaurante - 10 Clientes 
 * 
 * */

public class PesquisaDeSatisfacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int totalClientes = 10;
		int[] nivelSatisfacao = {0,0,0,0,0,0};
		
		System.out.println("************** PESQUISA DE SATISFAÇÃO **************");		
		System.out.println("*** Informe o nível de satisfação de 10 clientes ***");
		System.out.println();
		
		System.out.println("Opções:");
		System.out.println("1 - Muito Insatisfeito");
		System.out.println("2 - Insatisfeito");
		System.out.println("3 - Neutro");
		System.out.println("4 - Satisfeito");
		System.out.println("5 - Muito Satisfeito");
		System.out.println();
			
			for (int i = 1; i <= totalClientes; i++) {		
				System.out.println("Informe o nível de satisfação do Cliente " + i + ": ");
				int satisfacao = sc.nextInt();
				nivelSatisfacao[satisfacao]++;	
			}
					
		System.out.println();
		System.out.println("***** RESULTADO DA PESQUISA *****");
		System.out.println("Muito Insatisfeito: " + nivelSatisfacao[1]);
		System.out.println("Insatisfeito: " + nivelSatisfacao[2]);
		System.out.println("Neutro: " + nivelSatisfacao[3]);
		System.out.println("Satisfeito: " + nivelSatisfacao[4]);
		System.out.println("Muito Satisfeito: " + nivelSatisfacao[5]);
		
			sc.close();

	}

}
