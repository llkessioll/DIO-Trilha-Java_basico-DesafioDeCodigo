package contaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		//Definindo as variaveis
		int numero;
		String agencia, nomeCliente;
		double saldo;
		
		//Definindo um variavel para entrada via teclado
		Scanner teclado = new Scanner(System.in);
		
		//Imprimindo mensagens para o usuario entra com os dados
		System.out.println("Entre com o numero da conta");
		numero = teclado.nextInt();
		
		System.out.println("Entre com o numero da agencia");
		agencia = teclado.next();
		
		System.out.println("Entre com o nome do cliente");
		nomeCliente = teclado.next();
		
		System.out.println("Entre com o saldo da conta");
		saldo = teclado.nextDouble();
		
		//Mostrando um mensagem para o usuario com os dados inseridos por ele
		System.out.println("Olá "+"[ "+nomeCliente+" ], obrigado por criar uma conta em nosso banco,\nsua agência é [ "+agencia+" ] conta [ "+numero+" ] e seu saldo [ "+saldo+" ] já está disponivel para saque");
		
		teclado.close();
	}
}
