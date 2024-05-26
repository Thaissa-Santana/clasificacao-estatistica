package testes;

/** Thaissa = Programa: Recebe três valores inteiros e indica o maior */

public class ExemploIf {

	public static void main(String[] args) {
	
//		int a = Integer.parseInt(args[0]);
//		int b = Integer.parseInt(args[1]);
//		int c = Integer.parseInt(args[2]);
		
		int a = 10;
		int b = 4;
		int c = 15;
		
		System.out.println("Valores: " + a + ", " + b + ", " + c + ".");
		int maior;
		
		if (a > b & a > c) {
			maior = a;
		} else if  (b > c) {
			maior = b;
		} else {
			maior = c;
		}
		
		System.out.printf("\n");
		System.out.println("Maior é " + maior + ".");
		
	}
	
}