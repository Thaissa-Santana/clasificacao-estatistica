package cinema;

import java.util.Scanner;

/**
 * 	@author Thaissa Santana Santos
 * 	CC - Polo de Sítio do Quinto
 * 	Data: 05/04/2024
 */

public class VendaIngresso {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Coletar os dados do ingresso
		System.out.println("\n********************** INFORME OS DADOS DA SESSÃO **********************\n");

		System.out.printf("Informe o horário da sessão (Ex:14,25): ");
		float horario = sc.nextFloat();

		System.out.printf("Informe o valor da sessão: ");
		float valor = sc.nextFloat();

		System.out.printf("Informe a sala da sessão: ");
		int sala = sc.nextInt();

		System.out.printf("Informe a idade do cliente: ");
		int idade = sc.nextInt();

		System.out.printf("Informe o número da carteira de estudante ou digite 0 caso não tenha: ");
		int carteiraEstudante = sc.nextInt();

		// Instância da EntradaDeCinema e os descontos
		EntradaDeCinema ingresso = new EntradaDeCinema(horario, sala, valor);

		ingresso.calculaDesconto(idade);

		if (carteiraEstudante == 1) {
			ingresso.calculaDesconto(idade, carteiraEstudante);
		}

		ingresso.calculaDesconto(horario);

		// Imprimir o Ingresso
		System.out.printf("Entrada: " + ingresso);
		sc.close();

	}

}
