package testes_programas;

import java.util.Scanner;

// Dado um inteiro 'n', imprime a soma dos 'n' primeiros números inteiros positivos.

public class TesteExemploFor {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Digite um número: ");
		int n = sc.nextInt();
		int soma = 0;

		for (int i = 1; i <= n; i++) {
			soma += i;
		}

		System.out.println("A soma dos " + n + " primeiros números inteiros positivos é " + soma);

	}

}
