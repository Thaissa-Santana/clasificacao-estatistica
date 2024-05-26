package testes_programas;

import java.util.Scanner;

/*
 * Teste1 - Thaissa S S - 15.03.2024
 */

public class Exemplo1 {

	public static void main(String[] args) {
			
		Scanner entrada = new Scanner(System.in);		
		
		System.out.println("Informe seu nome: ");
		String nome = entrada.next();
		
		System.out.println("Hello, " + nome + "!");
	
		entrada.close();	
	}
}
