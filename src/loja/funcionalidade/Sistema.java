package loja.funcionalidade;

import java.util.Scanner;

import loja.veiculos.Carro;
import loja.veiculos.Moto;
import loja.veiculos.Onibus;

/**
* <h1>Classe Sistema</h1>
* Classe que cont�m as principais funcionalidades da loja
*
* @author  Rodrigo Ricardo Radke
* @version 1.0
* @since   2017/06/20
*/
public class Sistema {
	
	static Scanner scan = new Scanner(System.in);
	
	private int ano;
	private int marchas;
	private int acentos;
	private int portas;
	private double valor;
	private double km;
	private double cilindradas;
	private double potencia;
	private String marca;
	private String modelo;
	private String placa;
	private Boolean vendido;
	
	/**
	* Fun��o que recebe os valores a serem cadastrados e armazena nas variaveis
	* @param ano Representa o ano do ve�culo
	* @param valorDoVeiculo Representa o valor do ve�culo
	* @param quilometragem Representa a quilometragem do veiculo
	* @param cilindradas2 Representa as cilindradas do ve�culo
	* @param potencia2 Representa a pot�ncia em CV do ve�culo
	* @param marca Representa a marca do ve�culo
	* @param modelo Representa o modelo do ve�culo
	* @param placa Representa a placa do ve�culo
	* @param vendido Representa se o ve�culo est� ou n�o vendido
	* @param marchas Representa a macha do ve�culo
	* @param acentos Representa a quantidade de acentos do ve�culo
	* @param portas Representa a quantidade de portas do ve�culo
	* @param tipo Representa o tipo do ve�culo: 1(Carro),2(Onibus) ou 3(Moto)
	* @author Rodrigo Ricardo Radke
	*/
	public void iniciarCadastro(int ano, int marchas, double valorDoVeiculo, double quilometragem, double cilindradas2, double potencia2, String marca, String modelo,
			String placa, Boolean vendido, int acentos, int portas, int tipo) {
		
		this.ano = ano;
		this.marchas = marchas;
		this.valor = valorDoVeiculo;
		this.km = quilometragem;
		this.cilindradas = cilindradas2;
		this.potencia = potencia2;
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.vendido = vendido;
		
		this.cadastrarVeiculo(tipo);
	}
	
	/**
	 * Gerencia qual fun��o de cadastro deve ser chamada
	 * @param tipo 1-Carro, 2-Onibus, 3-Moto
	 * @author Rodrigo Ricardo Radke
	 */
	public void cadastrarVeiculo(int tipo) {
		switch(tipo) {
			case 1: this.cadastrarCarro();break;
			case 2: this.cadastrarOnibus();break;
			case 3: this.cadastrarMoto();break;
		}
	}
	
	/**
	 * Fun��o que cadastra um novo Carro
	 * @see Carro#Carro(int, int, double, double, double, double, String, String, String, Boolean)
	 * @author Rodrigo Ricardo Radke
	 */
	public void cadastrarCarro() {
		Carro item = new Carro(ano, marchas, valor, km, cilindradas, potencia, marca, modelo, placa, vendido);
		item.setNumeroDeAcentos(acentos);
		item.setNumeroDePortas(portas);
		FakeBD.Lista.add(item);
	}
	
	/**
	 * Fun�ao que cadastra um novo onibus
	 * @see Onibus#Onibus(int, int, double, double, double, double, String, String, String, Boolean)
	 * @author Rodrigo Ricardo Radke
	 */
	public void cadastrarOnibus() {
		Onibus item = new Onibus(ano, marchas, valor, km, cilindradas, potencia, marca, modelo, placa, vendido);
		item.setNumeroDeAcentos(acentos);
		item.setNumeroDePortas(portas);
		FakeBD.Lista.add(item);
	}
	
	/**
	 * Fun��o que cadastra uma nova moto
	 * @see Moto#Moto(int, int, double, double, double, double, String, String, String, Boolean)
	 * @author Rodrigo Ricardo Radke
	 */
	public void cadastrarMoto() {
		Moto item = new Moto(ano, marchas, valor, km, cilindradas, potencia, marca, modelo, placa, vendido);
		FakeBD.Lista.add(item);
	}
	
	/**
	 * Listar os ve�culos que ainda n�o est�o vendidos
	 * @see FakeBD#FakeBD()
	 * @author Rodrigo Ricardo Radke
	 */
	public void listarVeiculosNaoVendidos() {
		FakeBD.Lista.stream()
		.filter(item -> !item.isVendido())
		.forEach(item -> mostrarDetalhesItem(item));
	}
	
	/**
	 * Fun��o que mostra o menu de listagem
	 * @author Rodrigo Ricardo Radke
	 */
	public void listarVeiculos() {
		int op;
		
		System.out.println("\n\n========== Loja de Carros ==========");
		System.out.println("1 - Por Ano");
		System.out.println("2 - Por Modelo");
		System.out.println("3 - Por Marca");
		System.out.println("4 - Por Quilometragem");
		System.out.println("5 - Voltar");
		System.out.println("Op��o: ");
		
		op = scan.nextInt();
		
		if (op == 1) {
			int ano;
			
			System.out.println("Informe o ano:");
			ano = scan.nextInt();
			listarVeiculosPorAno(ano);
		} else if (op == 2) {
			String modelo;
			
			System.out.println("Informe o modelo:");
			modelo = scan.nextLine();
			listarVeiculosPorModelo(modelo);
		} else if (op == 3) {
			String marca;
			
			System.out.println("Informe a marca:");
			marca = scan.nextLine();
			listarVeiculosPorMarca(marca);
		} else if (op == 4) {
			int km;
			
			System.out.println("Informe a quilometragem:");
			km = scan.nextInt();
			listarVeiculosPorQuilometragem(km);
		}
	}
	
	/**
	 * Listar os ve�culos que ainda n�o est�o vendidos por ano
	 * @see FakeBD#FakeBD()
	 * @param ano Ano do ve�culo a ser listado
	 * @author Rodrigo Ricardo Radke
	 */
	public void listarVeiculosPorAno(int ano) {
		FakeBD.Lista.stream()
		.filter(item -> item.getAno() == ano)
		.forEach(item -> mostrarDetalhesItem(item));
	}
	
	/**
	 * Listar os ve�culos que ainda n�o est�o vendidos por modelo
	 * @see FakeBD#FakeBD()
	 * @param modelo Modelo do ve�culo a ser listado
	 * @author Rodrigo Ricardo Radke
	 */
	public void listarVeiculosPorModelo(String modelo) {
		FakeBD.Lista.stream()
		.filter(item -> item.getModelo().equals(modelo))
		.forEach(item -> mostrarDetalhesItem(item));
	}
	
	/**
	 * Listar os ve�culos que ainda n�o est�o vendidos por marca
	 * @see FakeBD#FakeBD()
	 * @param marca Marca do ve�culo a ser listado
	 * @author Rodrigo Ricardo Radke
	 */
	public void listarVeiculosPorMarca(String marca) {
		FakeBD.Lista.stream()
		.filter(item -> item.getMarca().equals(marca))
		.forEach(item -> mostrarDetalhesItem(item));
	}
	
	/**
	 * Listar os ve�culos que ainda n�o est�o vendidos por Quilometragem
	 * @see FakeBD#FakeBD()
	 * @param km do ve�culo a ser listado
	 * @author Rodrigo Ricardo Radke
	 */
	public void listarVeiculosPorQuilometragem(double km) {
		FakeBD.Lista.stream()
		.filter(item -> item.getQuilometragem() == km)
		.forEach(item -> mostrarDetalhesItem(item));
	}
	
	/**
	 * Mostrar detalhes de um ve�culo com determinada placa
	 * @see FakeBD#FakeBD()
	 * @author Rodrigo Ricardo Radke
	 */
	public void detalhesPorPlaca() {
		String placa;
		
		System.out.println("Informe a placa do ve�culo:");
		placa = scan.nextLine();
		
		FakeBD.Lista.stream()
		.filter(item -> item.getPlaca().equals(placa))
		.forEach(item -> mostrarDetalhesItem(item));
	}
	
	/**
	 * Mostrar detalhes de um determinado ve�culo
	 * @param item O ve�culo a ser detalhado
	 * @author Rodrigo Ricardo Radke
	 */
	public static void mostrarDetalhesItem(ItemDeVenda item) {
		try {
			System.out.println("Detalhes de ve�culo");
			System.out.println("Tipo de Ve�culo:" + item.getTipoVeiculo(item));
			System.out.println("Marca: " + item.getMarca());
			System.out.println("Modelo: " + item.getModelo());
			System.out.println("Ano: " + item.getAno());
			System.out.println("Placa: " + item.getPlaca());
			System.out.println("Valor: " + item.getValor());
			System.out.println("Quilometragem: " + item.getQuilometragem());
			System.out.println("========================================\n");
		} catch(Exception e) {
			throw new RuntimeException("Ocorreu um erro ao executar o c�digo: " + e.getMessage());
		}
	}
	
	/**
	 * Setar um ve�culo como vendido pela placa
	 * @see FakeBD#FakeBD()
	 * @author Rodrigo Ricardo Radke
	 */
	public void venderPorPlaca() {
		String placa;
		
		System.out.println("Informe a placa do ve�culo:");
		placa = scan.nextLine();
		
		FakeBD.Lista.stream()
		.filter(item -> item.getPlaca().equals(placa))
		.filter(item -> !item.isVendido())
		.forEach(item -> item.vender());
	}
}
