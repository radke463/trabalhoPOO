package loja.funcionalidade;

import java.util.Scanner;

/**
* <h1>Classe Loja de Carros</h1>
* Cont�m o m�todo main, � o ponto de partida do programa
* @author  Rodrigo Ricardo Radke
* @version 1.0
* @since   2017/06/20
*/
public class LojaDeCarros {

	static Scanner scan = new Scanner(System.in);
	
	/**
	 * Continua mostrando o menu de op��es se necess�rio
	 * @param args Argumentos recebidos pelo m�todo
	 * @author Rodrigo Ricardo Radke
	 */
	public static void main(String[] args) {
		int opcao;
		Boolean continua = true;
		Sistema sistema = new Sistema();

		while(continua) {
			mostrarMenuPrincipal();
			
			opcao = scan.nextInt();
			
			switch(opcao) {
				case 1: mostrarMenuCadastro(); break;
				case 2: sistema.listarVeiculosNaoVendidos(); break;
				case 3: sistema.listarVeiculos(); break;
				case 4: sistema.detalhesPorPlaca(); break;
				case 5: sistema.venderPorPlaca(); break;
				default: continua = false; break;
			}
		}
	}

	/**
	 * M�todo que ir� apresentar na tela o menu
	 * @author Rodrigo Ricardo Radke
	 */
	public static void mostrarMenuPrincipal() {
		System.out.println("\n\n========== Loja de Carros ==========");
		System.out.println("1 - Cadastrar Veiculo");
		System.out.println("2 - Listar ve�culos n�o vendidos");
		System.out.println("3 - Listar ve�culos por ano/modelo/marca/quilometragem");
		System.out.println("4 - Detalhes por placa");
		System.out.println("5 - Vender ve�culo");
		System.out.println("6 - Sair");
		System.out.println("Op��o: ");
	}
	
	/**
	 * Mostra na tela o menu de cadastro e gerencia a sele��o do usu�rio
	 * @author Rodrigo Ricardo Radke
	 */
	public static void mostrarMenuCadastro() {
		Sistema sistema = new Sistema();
		int op;
		int anoDeFabricacao;
		int numeroDeMarchas;
		int numeroDePortas = 0;
		int numeroDeAcentos = 0;
		double valorDoVeiculo;
		double quilometragem;
		double cilindradas;
		double potencia;
		String marca;
		String modelo;
		String placa;
		Boolean vendido;
		
		System.out.println("\n\n========== Loja de Carros ==========");
		System.out.println("1 - Cadastrar carro");
		System.out.println("2 - Cadastrar onibus");
		System.out.println("3 - Cadastrar moto");
		System.out.println("4 - Voltar");
		System.out.println("Op��o: ");
		
		op = scan.nextInt();
		
		if (op > 0 && op < 4) {
			scan.nextLine();
			System.out.print("Marca:");
			marca = scan.nextLine();
			System.out.print("Modelo:");
			modelo = scan.nextLine();
			System.out.print("Placa:");
			placa = scan.nextLine();
			System.out.print("Ano de Fabrica��o:");
			anoDeFabricacao = scan.nextInt();
			System.out.print("N�mero de marchas:");
			numeroDeMarchas = scan.nextInt();
			System.out.print("Valor do ve�culo:");
			valorDoVeiculo = scan.nextDouble();
			System.out.print("Quilometragem:");
			quilometragem = scan.nextDouble();
			System.out.print("Cilindradas:");
			cilindradas = scan.nextDouble();
			System.out.print("Pot�ncia:");
			potencia = scan.nextDouble();
			
			if (op == 1 || op == 2) {
				System.out.print("N�mero de portas:");
				numeroDePortas = scan.nextInt();
				System.out.print("N�mero de acentos:");
				numeroDeAcentos = scan.nextInt();
			}
			
			System.out.print("Vendido:");
			vendido = scan.nextBoolean();

			sistema.iniciarCadastro(anoDeFabricacao, numeroDeMarchas, valorDoVeiculo, quilometragem, cilindradas, potencia, marca, modelo, placa, vendido, numeroDeAcentos, numeroDePortas, op);
		}
	}
}
