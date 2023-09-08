import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;
		String agencia;
		String nomeCliente;
		double saldo;

		System.out.println("Por favor, digite o número da conta !");
		numero = sc.nextInt();
		System.out.println("Por favor, digite o número da Agência !");
		agencia = sc.next();
		sc.nextLine();
		System.out.println("Por favor, digite o nome do cliente !");
		nomeCliente = sc.nextLine();
		System.out.println("Por favor, digite o saldo !");
		saldo = sc.nextDouble();

		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
				+ agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
		
		sc.close();
	}

}
