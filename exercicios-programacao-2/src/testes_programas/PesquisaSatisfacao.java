package testes_programas;

import java.util.Scanner;

public class PesquisaSatisfacao {

	public static void main(String[] args) {
		
		//definir váriaveis	
		int [] opcoes = {0,0,0,0,0,0,0};
		int satisfacao = 0;
		
		// pegar a resposta do teclado
		Scanner sc = new Scanner(System.in);

		//Mostrar para o usuário
		System.out.println("*****Informe o nível de satisfação de 10 clientes*****\n");
		System.out.println("Opções: ");
		System.out.println("1 - Muito Insatisfeito");
		System.out.println("2 - Insatisfeito");
		System.out.println("3 - Neutro");
		System.out.println("4 - Satisfeito");
		System.out.println("5 - Muito Satisfeito \n");	
			
			//Um laço para fazer a iteração dos 10 clientes	
			for (int i = 1; i <= 10; i++) {
				System.out.println("Informe o nível de satisfação do cliente " + i + ": ");
				satisfacao = sc.nextInt();
				opcoes[satisfacao]++;			
			}
			
			System.out.println("\n***Resultado da Pesquisa de Satisfação***");
			System.out.println("Muito Insatisfeito: " + opcoes[1]);
			System.out.println("Insatisfeito: " + opcoes[2]);
			System.out.println("Neutro: " + opcoes[3]);
			System.out.println("Satisfeito: " + opcoes[4]);
			System.out.println("Muito Satisfeito: " + opcoes[5]);
			
			sc.close();
		
		}
		
}
