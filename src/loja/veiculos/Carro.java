package loja.veiculos;

/**
* <h1>Classe Carro</h1>
* Classe que extende de Veiculos
*
* @see Veiculo#Veiculo(int, int, double, double, double, double, String, String, String, Boolean)
* @author  Rodrigo Ricardo Radke
* @version 1.0
* @since   2017/06/20
*/
public class Carro extends Veiculo{

	private int numeroDePortas;
	private int numeroDeAcentos;
	
	/**
	* Construtor do carro. Verificar o construtor de Veiculos para melhor entedimento
	* @see Veiculo#Veiculo(int, int, double, double, double, double, String, String, String, Boolean)
	* @param ano Representa o ano do ve�culo
	* @param marchas Quantidade de marchas no ve�culo
	* @param valor Representa o valor do ve�culo
	* @param km Representa a quilometragem do veiculo
	* @param cilindradas Representa as cilindradas do ve�culo
	* @param potencia Representa a pot�ncia em CV do ve�culo
	* @param marca Representa a marca do ve�culo
	* @param modelo Representa o modelo do ve�culo
	* @param placa Representa a placa do ve�culo
	* @param vendido Representa se o ve�culo est� ou n�o vendido
	* @author Rodrigo Ricardo Radke
	*/
	public Carro(int ano, int marchas, double valor, double km, double cilindradas, double potencia, String marca, String modelo,
			String placa, Boolean vendido) {
		super(ano, marchas, valor, km, cilindradas, potencia, marca, modelo, placa, vendido);
	}
	
	/**
	 * M�todo que retorna o numero de portas
	 * @author Rodrigo Ricardo Radke
	 * @return Um inteiro que representa a quantidade de portas
	 */
	public int getNumeroDePortas() {
		return numeroDePortas;
	}

	/**
	 * M�todo que altera o numero de portas
	 * @param numeroDePortas Quantidade de portas no ve�culo
	 * @author Rodrigo Ricardo Radke
	 */
	public void setNumeroDePortas(int numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}

	/**
	 * M�todo que retorna o numero de acentos
	 * @author Rodrigo Ricardo Radke
	 * @return Um inteiro que representa a quantidade de acentos
	 */
	public int getNumeroDeAcentos() {
		return numeroDeAcentos;
	}

	/**
	 * M�todo que altera o numero de acentos
	 * @param numeroDeAcentos Quantidade de acentos no ve�culo
	 * @author Rodrigo Ricardo Radke
	 */
	public void setNumeroDeAcentos(int numeroDeAcentos) {
		this.numeroDeAcentos = numeroDeAcentos;
	}
}
