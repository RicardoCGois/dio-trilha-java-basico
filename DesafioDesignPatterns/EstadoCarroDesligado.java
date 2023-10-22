package DesafioDesignPatterns.State;

public class EstadoCarroDesligado implements EstadoCarro {

	@Override
	public void acelerar() {
		System.out.println("O carro está desligado. Ligue-o para poder acelerar");
	}

	@Override
	public void frear() {
		System.out.println("O carro está desligado. Ligue-o para poder frear");
	}

}
