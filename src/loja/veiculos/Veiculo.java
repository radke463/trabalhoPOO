package loja.veiculos;

import loja.funcionalidade.ItemDeVenda;

/**
* <h1>Classe Abstrata Veículo</h1>
* Classe pai das classes Carro, Moto e Onibus;
* Contém todos os campos/métodos em comum
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
	* <h1>Construtor do Veículo</h1>
	* Esse código irá construir um veículo com base nas informações recebidas
	* @author  Rodrigo Ricardo Radke
	* @param ano Representa o ano do veículo
	* @param valor Representa o valor do veículo
	* @param km Representa a quilometragem do veiculo
	* @param cilindradas Representa as cilindradas do veículo
	* @param potencia Representa a potência em CV do veículo
	* @param marca Representa a marca do veículo
	* @param modelo Representa o modelo do veículo
	* @param placa Representa a placa do veículo
	* @param vendido Representa se o veículo está ou não vendido
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
	 * Retorna se o veículo está ou não vendido
	 * @return verdadeiro para vendido e falso para não vendido
	 * @author Rodrigo Ricardo Radke
	 */
	@Override
	public Boolean isVendido() {
		return this.vendido;
	}

	/**
	 * Retorna o valor do veículo
	 * @return um valor double representando o valor do veículo
	 * @author Rodrigo Ricardo Radke
	 */
	@Override
	public double getValor() {
		return this.valorDoVeiculo;
	}
	
	/**
	 * Retorna a quilometragem do veículo
	 * @return valor em double representando a quilometragem
	 * @author Rodrigo Ricardo Radke
	 */
	@Override
	public double getQuilometragem() {
		return this.quilometragem;
	}
	
	/**
	 * Retorna o ano do veículo
	 * @return int representando o ano
	 * @author Rodrigo Ricardo Radke
	 */
	@Override
	public int getAno() {
		return this.anoDeFabricacao;
	}
	
	/**
	 * Retorna a placa do veículo
	 * @return String representando a placa
	 * @author Rodrigo Ricardo Radke
	 */
	@Override
	public String getPlaca() {
		return this.placa;
	}
	
	/**
	 * Retorna o modelo
	 * @return String representando o modelo do veículo
	 * @author Rodrigo Ricardo Radke
	 */
	@Override
	public String getModelo() {
		return this.modelo;
	}
	
	/**
	 * Retorna a marca
	 * @return String representando a marca do veículo
	 * @author Rodrigo Ricardo Radke
	 */
	@Override
	public String getMarca() {
		return this.marca;
	}
	
	/**
	 * Retorna qual o tipo do veículo: Carro, Onibus ou Moto
	 * @return String informando o tipo do veículo, 3 possíveis valores
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
	 * Faz com que um veículo seja considerado vendido
	 * @throws RuntimeException Lança uma excessão caso já esteja vendido
	 * @author Rodrigo Ricardo Radke
	 */
	@Override
	public void vender() {
		if (isVendido())
			throw new RuntimeException("Esse veículo ja foi vendido");
		
		this.vendido = true;
		
		System.out.println("Veículo vendido com sucesso.");
	}
}
