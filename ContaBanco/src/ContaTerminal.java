import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;
		String agencia;
		String nomeCliente;
		double saldo;

		System.out.println("Por favor, digite o n�mero da conta !");
		numero = sc.nextInt();
		System.out.println("Por favor, digite o n�mero da Ag�ncia !");
		agencia = sc.next();
		sc.nextLine();
		System.out.println("Por favor, digite o nome do cliente !");
		nomeCliente = sc.nextLine();
		System.out.println("Por favor, digite o saldo !");
		saldo = sc.nextDouble();

		System.out.println("Ol� " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua ag�ncia � "
				+ agencia + ", conta " + numero + " e seu saldo " + saldo + " j� est� dispon�vel para saque.");
		
		sc.close();
	}

}
