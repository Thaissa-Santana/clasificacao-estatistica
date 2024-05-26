package testes_programas;

import java.util.Scanner;

public class Teste {

//	public static void main(String[] args) {
//		
//		int x = 5, y = 7;
//		
//		System.out.println(((y * 2) % x));
//		System.out.println(" " + y % x);
//		
//	}
	
	public static void main(String[] args) {
		
		float horario;
		float valor;
		int sala;
		int idadeDoCliente;
		int numEstudante;

		Scanner sc = new Scanner(System.in);
		
		horario = sc.nextFloat();
		valor = sc.nextFloat();
		sala = sc.nextInt();
		idadeDoCliente = sc.nextInt();
		numEstudante = sc.nextInt();

		// Imprimir
		System.out.println("**** Informe os dados da sessão ****");
		System.out.println("Informe o horário da sessão: " + horario);
		System.out.println("Informe o valor da sessão: " + valor);
		System.out.println("Informe a sala da sessão: " + sala);	
		System.out.println("Informe a idade do cliente: " + idadeDoCliente);	
		System.out.println("Informe o número da carteira de estudante ou digite 0 caso não tenha: " + numEstudante);	
//		System.out.println("Entrada: " + ingresso2);

		sc.close();
	}


}
