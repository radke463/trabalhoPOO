package loja.funcionalidade;

import java.util.Scanner;
import java.util.stream.Collectors;

import loja.veiculos.Carro;

public class LojaDeCarros {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcao;
		Boolean continua = true;
		
		preencherDados();
		
		listarVeiculosNaoVendidos();
		
		venderPorPlaca("DRL-1085");
		
		listarVeiculosNaoVendidos();
		/*while(continua) {
			mostrarMenuPrincipal();
			
			opcao = scan.nextInt();
			
			switch(opcao) {
				case 1: mostrarMenuCadastro(); break;
				case 2: listarVeiculosNaoVendidos(); break;
				case 3: listarVeiculos(); break;
				case 4: detalhesPorPlaca(); break;
				case 5: venderPorPlaca(); break;
				default: continua = false; break;
			}
		}*/
	}
	
	public static void preencherDados() {
		ItemDeVenda item = new Carro(2005, 5, 20000.00F, 116200, 12000, 1000, "Honda", "Fit", "DRL-1085", false);
		FakeBD.Lista.add(item);
		
		// ItemDeVenda é Carro??  ->>        if (item instanceof Carro)
	}

	public static void mostrarMenuPrincipal() {
		clearConsole();
		
		System.out.println("========== Loja de Carros ==========");
		System.out.println("1 - Cadastrar Veiculo");
		System.out.println("2 - Listar veículos não vendidos");
		System.out.println("3 - Listar veículos por ano/modelo/marca/quilometragem");
		System.out.println("4 - Detalhes por placa");
		System.out.println("5 - Vender veículo");
		System.out.println("6 - Sair");
		System.out.println("Opção: ");
	}
	
	public static void mostrarMenuCadastro() {
		Sistema sistema = new Sistema();
		int op;
		
		clearConsole();
		
		System.out.println("========== Loja de Carros ==========");
		System.out.println("1 - Cadastrar carro");
		System.out.println("2 - Cadastrar onibus");
		System.out.println("3 - Cadastrar moto");
		System.out.println("4 - Voltar");
		System.out.println("Opção: ");
		
		op = scan.nextInt();
		
		if (op > 0 && op > 4) {
			//TODO pegar outros dados e chamar função iniciarCadastro
			//sistema.iniciarCadastro(ano, marchas, valor, km, cilindradas, potencia, marca, modelo, placa, vendido, acentos, portas, tipo);
		}
	}
	
	public static void listarVeiculosNaoVendidos() {
		FakeBD.Lista.stream()
		.filter(item -> !item.isVendido())
		.forEach(item -> System.out.println(item.getValor()));
	}
	
	public static void listarVeiculos() {
		
	}
	
	public static void detalhesPorPlaca() {
		FakeBD.Lista.stream()
		.filter(item -> !item.isVendido())
		.forEach(item -> System.out.println(item.getValor()));
	}
	
	public static void venderPorPlaca(String placa) {
		FakeBD.Lista.stream()
		.filter(item -> item.getPlaca().equals(placa))
		.filter(item -> !item.isVendido())
		.forEach(item -> item.vender());
		
		System.out.println("Veículo vendido com sucesso");
	}
	
	public final static void clearConsole()
	{
	    try
	    {
	        final String os = System.getProperty("os.name");

	        if (os.contains("Windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        }
	        else
	        {
	            Runtime.getRuntime().exec("clear");
	        }
	    }
	    catch (final Exception e)
	    {
	        //  Handle any exceptions.
	    }
	}
	
}
