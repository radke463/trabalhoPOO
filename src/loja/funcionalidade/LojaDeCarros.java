package loja.funcionalidade;

import java.util.Scanner;

public class LojaDeCarros {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcao;
		
		mostrarMenuPrincipal();
		
		opcao = scan.nextInt();
		
		switch(opcao) {
			case 1: mostrarMenuCadastro();break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
		}
	}

	public static void mostrarMenuPrincipal() {
		clearConsole();
		
		System.out.println("========== Loja de Carros ==========");
		System.out.println("1 - Cadastrar Veiculo");
		System.out.println("2 - Listar veículos não vendidos");
		System.out.println("3 - Listar veículos por ano/modelo/marca/quilometragem");
		System.out.println("4 - Detalhes por placa");
		System.out.println("5 - Vender veículo");
		System.out.println("Opção: ");
	}
	
	public static void mostrarMenuCadastro() {
		int op;
		
		clearConsole();
		
		System.out.println("========== Loja de Carros ==========");
		System.out.println("1 - Cadastrar carro");
		System.out.println("2 - Cadastrar onibus");
		System.out.println("3 - Cadastrar moto");
		System.out.println("4 - Voltar");
		System.out.println("Opção: ");
		
		op = scan.nextInt();
		
		if (op == 4)
			System.out.println("TODO retornar ao menu principal");
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
