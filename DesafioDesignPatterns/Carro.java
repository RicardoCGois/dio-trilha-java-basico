package DesafioDesignPatterns.State;

public class Carro {
	private EstadoCarro estado;

	public void setEstado(EstadoCarro estado) {
		this.estado = estado;
	}

	public void acelerar() {
		estado.acelerar();
	}

	public void frear() {
		estado.frear();
	}

}
