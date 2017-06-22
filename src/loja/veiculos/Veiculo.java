package loja.veiculos;

import loja.funcionalidade.ItemDeVenda;

/**
* <h1>Classe Abstrata Ve�culo</h1>
* Classe pai das classes Carro, Moto e Onibus;
* Cont�m todos os campos/m�todos em comum
*
* @author  Rodrigo Ricardo Radke
* @version 1.0
* @since   2017/06/20
*/
public abstract class Veiculo implements ItemDeVenda {
	protected int anoDeFabricacao;
	protected int numeroDeMarchas;
	protected double valorDoVeiculo;
	protected double quilometragem;
	protected double cilindradas;
	protected double potencia;
	protected String marca;
	protected String modelo;
	protected String placa;
	protected Boolean vendido;
	
	/**
	* <h1>Construtor do Ve�culo</h1>
	* Esse c�digo ir� construir um ve�culo com base nas informa��es recebidas
	* @author  Rodrigo Ricardo Radke
	* @param ano Representa o ano do ve�culo
	* @param valor Representa o valor do ve�culo
	* @param km Representa a quilometragem do veiculo
	* @param cilindradas Representa as cilindradas do ve�culo
	* @param potencia Representa a pot�ncia em CV do ve�culo
	* @param marca Representa a marca do ve�culo
	* @param modelo Representa o modelo do ve�culo
	* @param placa Representa a placa do ve�culo
	* @param vendido Representa se o ve�culo est� ou n�o vendido
	*/
	Veiculo(int ano, int marchas, double valor, double km, double cilindradas, double potencia, String marca, String modelo, String placa, Boolean vendido) {
		this.anoDeFabricacao = ano;
		this.numeroDeMarchas = marchas;
		this.valorDoVeiculo = valor;
		this.quilometragem = km;
		this.cilindradas = cilindradas;
		this.potencia = potencia;
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.vendido = vendido;
	}
	
	/**
	 * Retorna se o ve�culo est� ou n�o vendido
	 * @return verdadeiro para vendido e falso para n�o vendido
	 * @author Rodrigo Ricardo Radke
	 */
	@Override
	public Boolean isVendido() {
		return this.vendido;
	}

	/**
	 * Retorna o valor do ve�culo
	 * @return um valor double representando o valor do ve�culo
	 * @author Rodrigo Ricardo Radke
	 */
	@Override
	public double getValor() {
		return this.valorDoVeiculo;
	}
	
	/**
	 * Retorna a quilometragem do ve�culo
	 * @return valor em double representando a quilometragem
	 * @author Rodrigo Ricardo Radke
	 */
	@Override
	public double getQuilometragem() {
		return this.quilometragem;
	}
	
	/**
	 * Retorna o ano do ve�culo
	 * @return int representando o ano
	 * @author Rodrigo Ricardo Radke
	 */
	@Override
	public int getAno() {
		return this.anoDeFabricacao;
	}
	
	/**
	 * Retorna a placa do ve�culo
	 * @return String representando a placa
	 * @author Rodrigo Ricardo Radke
	 */
	@Override
	public String getPlaca() {
		return this.placa;
	}
	
	/**
	 * Retorna o modelo
	 * @return String representando o modelo do ve�culo
	 * @author Rodrigo Ricardo Radke
	 */
	@Override
	public String getModelo() {
		return this.modelo;
	}
	
	/**
	 * Retorna a marca
	 * @return String representando a marca do ve�culo
	 * @author Rodrigo Ricardo Radke
	 */
	@Override
	public String getMarca() {
		return this.marca;
	}
	
	/**
	 * Retorna qual o tipo do ve�culo: Carro, Onibus ou Moto
	 * @return String informando o tipo do ve�culo, 3 poss�veis valores
	 * @author Rodrigo Ricardo Radke
	 */
	@Override
	public String getTipoVeiculo(ItemDeVenda item) {
		if (item instanceof Carro)
			return "Carro";
		else if (item instanceof Onibus)
			return "Onibus";
		
		return "Moto";
	}
	
	/**
	 * Faz com que um ve�culo seja considerado vendido
	 * @throws RuntimeException Lan�a uma excess�o caso j� esteja vendido
	 * @author Rodrigo Ricardo Radke
	 */
	@Override
	public void vender() {
		if (isVendido())
			throw new RuntimeException("Esse ve�culo ja foi vendido");
		
		this.vendido = true;
		
		System.out.println("Ve�culo vendido com sucesso.");
	}
}
