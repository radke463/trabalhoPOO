package loja.funcionalidade;

import java.util.Scanner;

/**
* <h1>Classe Loja de Carros</h1>
* Contém o método main, é o ponto de partida do programa
* @author  Rodrigo Ricardo Radke
* @version 1.0
* @since   2017/06/20
*/
public class LojaDeCarros {

	static Scanner scan = new Scanner(System.in);
	
	/**
	 * Continua mostrando o menu de opções se necessário
	 * @param args Argumentos recebidos pelo método
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
	 * Método que irá apresentar na tela o menu
	 * @author Rodrigo Ricardo Radke
	 */
	public static void mostrarMenuPrincipal() {
		System.out.println("\n\n========== Loja de Carros ==========");
		System.out.println("1 - Cadastrar Veiculo");
		System.out.println("2 - Listar veículos não vendidos");
		System.out.println("3 - Listar veículos por ano/modelo/marca/quilometragem");
		System.out.println("4 - Detalhes por placa");
		System.out.println("5 - Vender veículo");
		System.out.println("6 - Sair");
		System.out.println("Opção: ");
	}
	
	/**
	 * Mostra na tela o menu de cadastro e gerencia a seleção do usuário
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
		System.out.println("Opção: ");
		
		op = scan.nextInt();
		
		if (op > 0 && op < 4) {
			scan.nextLine();
			System.out.print("Marca:");
			marca = scan.nextLine();
			System.out.print("Modelo:");
			modelo = scan.nextLine();
			System.out.print("Placa:");
			placa = scan.nextLine();
			System.out.print("Ano de Fabricação:");
			anoDeFabricacao = scan.nextInt();
			System.out.print("Número de marchas:");
			numeroDeMarchas = scan.nextInt();
			System.out.print("Valor do veículo:");
			valorDoVeiculo = scan.nextDouble();
			System.out.print("Quilometragem:");
			quilometragem = scan.nextDouble();
			System.out.print("Cilindradas:");
			cilindradas = scan.nextDouble();
			System.out.print("Potência:");
			potencia = scan.nextDouble();
			
			if (op == 1 || op == 2) {
				System.out.print("Número de portas:");
				numeroDePortas = scan.nextInt();
				System.out.print("Número de acentos:");
				numeroDeAcentos = scan.nextInt();
			}
			
			System.out.print("Vendido:");
			vendido = scan.nextBoolean();

			sistema.iniciarCadastro(anoDeFabricacao, numeroDeMarchas, valorDoVeiculo, quilometragem, cilindradas, potencia, marca, modelo, placa, vendido, numeroDeAcentos, numeroDePortas, op);
		}
	}
}
