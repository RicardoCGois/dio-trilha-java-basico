package DesafioDesignPatterns.State;

public class AplicacaoCarro {

	public static void main(String[] args) {
		
		EstadoCarro Desligado = new EstadoCarroDesligado();
		EstadoCarro Ligado = new EstadoCarroLigado();
		
		Carro carro = new Carro();
        carro.setEstado(Desligado);
        carro.acelerar();
        carro.frear();
        carro.setEstado(Ligado);
        carro.acelerar();
        carro.frear();
        carro.setEstado(Desligado);
        carro.acelerar();
        carro.frear();
    }
}
