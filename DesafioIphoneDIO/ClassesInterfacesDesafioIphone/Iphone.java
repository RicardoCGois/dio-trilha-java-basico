
public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("Tocando Música");
	}

	@Override
	public void pausar() {
		System.out.println("Música Pausada");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Música Selecionada: " + musica);
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo Página: " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba Adicionada");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página Atualizada");
	}

	@Override
	public void ligar(int numero) {
		System.out.println("Ligando Para: " + numero);
	}

	@Override
	public void atender() {
		System.out.println("Chamada Atendida");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de Voz");
	}

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		iphone.ligar(999999999);
		iphone.atender();
		iphone.iniciarCorreioVoz();
		iphone.exibirPagina("DIO");
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica("DIO Music");
	}
}
