package loja.veiculos;

/**
* <h1>Classe Moto</h1>
* Classe que extende de Veiculos
*
* @see Veiculo#Veiculo(int, int, double, double, double, double, String, String, String, Boolean)
* @author  Rodrigo Ricardo Radke
* @version 1.0
* @since   2017/06/20
*/
public class Moto extends Veiculo{
	/**
	* Construtor da moto. Verificar o construtor de Veiculos para melhor entedimento
	* @see Veiculo#Veiculo(int, int, double, double, double, double, String, String, String, Boolean)
	* @param ano Representa o ano do veículo
	* @param marchas Quantidade de marchas no veículo
	* @param valor Representa o valor do veículo
	* @param km Representa a quilometragem do veiculo
	* @param cilindradas Representa as cilindradas do veículo
	* @param potencia Representa a potência em CV do veículo
	* @param marca Representa a marca do veículo
	* @param modelo Representa o modelo do veículo
	* @param placa Representa a placa do veículo
	* @param vendido Representa se o veículo está ou não vendido
	* @author Rodrigo Ricardo Radke
	*/
	public Moto(int ano, int marchas, double valor, double km, double cilindradas, double potencia, String marca, String modelo,
			String placa, Boolean vendido) {
		super(ano, marchas, valor, km, cilindradas, potencia, marca, modelo, placa, vendido);
	}
}
