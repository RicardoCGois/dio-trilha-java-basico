package DesafioDesignPatterns.State;

public class EstadoCarroLigado implements EstadoCarro {

	@Override
	public void acelerar() {
		System.out.println("O carro está sendo acelerado");
	}

	@Override
	public void frear() {
		System.out.println("O carro está sendo freado");
	}

}
