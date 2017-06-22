package loja.funcionalidade;

public interface ItemDeVenda {
	Boolean isVendido();
	
	/**
	 * Retorna o ano do veículo
	 * @author Rodrigo Ricardo Radke
	 * @return Inteiro que representa o ano
	 */
	int getAno();
	
	/**
	 * Retorna o valor de compra do veículo
	 * @author Rodrigo Ricardo Radke
	 * @return Double que representa o valor do veículo
	 */
	double getValor();
	
	/**
	 * Retorna a quilometragem do veículo
	 * @author Rodrigo Ricardo Radke
	 * @return Double que representa a quilometragem
	 */
	double getQuilometragem();
	
	/**
	 * Método que torna o veículo vendido
	 * @author Rodrigo Ricardo Radke
	 */
	void vender();
	
	/**
	 * Retorna a placa do veículo
	 * @author Rodrigo Ricardo Radke
	 * @return String com a placa do veículo
	 */
	String getPlaca();
	
	/**
	 * Retorna o modelo do veículo
	 * @author Rodrigo Ricardo Radke
	 * @return String com o modelo do veículo
	 */
	String getModelo();
	
	/**
	 * Retorna a marca do veículo
	 * @author Rodrigo Ricardo Radke
	 * @return String com a marca do veículo
	 */
	String getMarca();

	/**
	 * Retorna o tipo do veículo, possíveis retornos:
	 * - Carro
	 * - Onibus
	 * - Moto
	 * @param item Recebe um veículo ItemDeVenda
	 * @author Rodrigo Ricardo Radke
	 * @return String com o tipo do veículo
	 */
	String getTipoVeiculo(ItemDeVenda item);
}
