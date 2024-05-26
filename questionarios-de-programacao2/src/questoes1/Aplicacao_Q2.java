package questoes1;

public class Aplicacao_Q2 {

	public static void main(String[] args) {
		
		char vet [] = {'T', 'E', 'S', 'T', 'E', ' ', 'D', 'E', ' ', 'M', 'E', 'S', 'A', '\0'};
		int i = 0, x = 0, z =0;
		
		while (vet[i] != '\0')
		{
			if ( (vet[i] != 'A') && (vet[i] != 'E') &&  (vet[i] != 'I') &&  (vet[i] != 'O') &&  (vet[i] != 'U') )
			{x++;
			}
			z++;
			i++;	
		}
		
		System.out.println(x + " " + z);

	}

}
