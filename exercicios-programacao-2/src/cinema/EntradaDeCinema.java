package cinema;

/**
 *	@author Thaissa Santana Santos
 *	CC - Polo de Sítio do Quinto
 *	Data: 30/03/2024
 */

public class EntradaDeCinema {

	private float horario;
	private int sala;
	private float valor;

	public EntradaDeCinema(float horario, int sala, float valor) {
		this.horario = horario;
		this.sala = sala;
		this.valor = valor;
	}

	public void calculaDesconto(int idade) {
		if (idade < 12) {
			this.valor *= 0.5; // 50% de desconto para menores de 12y
		}
	}

	// descontos de 40%, 30% e 20%
	public void calculaDesconto(int idade, int carteiraEstudante) {

		if (idade >= 12 && idade <= 15) {
			this.valor *= 0.6; // 40%
		} else if (idade >= 16 && idade <= 20) {
			this.valor *= 0.7; // 30%
		} else if (idade > 20) {
			this.valor *= 0.8; // 20%
		}
	}

	public void calculaDesconto(float horario) {
		while (horario < 16.0) {
			this.valor *= 0.9; // 10% de desconto para filmes antes da 16h.
		}
	}

	@Override
	public String toString() {
		return "Horário= " + horario + ", Sala= " + sala + ", Valor= R$ " + valor;
	}

}
