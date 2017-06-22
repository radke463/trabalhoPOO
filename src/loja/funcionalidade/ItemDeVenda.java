package loja.funcionalidade;

public interface ItemDeVenda {
	Boolean isVendido();
	
	/**
	 * Retorna o ano do ve�culo
	 * @author Rodrigo Ricardo Radke
	 * @return Inteiro que representa o ano
	 */
	int getAno();
	
	/**
	 * Retorna o valor de compra do ve�culo
	 * @author Rodrigo Ricardo Radke
	 * @return Double que representa o valor do ve�culo
	 */
	double getValor();
	
	/**
	 * Retorna a quilometragem do ve�culo
	 * @author Rodrigo Ricardo Radke
	 * @return Double que representa a quilometragem
	 */
	double getQuilometragem();
	
	/**
	 * M�todo que torna o ve�culo vendido
	 * @author Rodrigo Ricardo Radke
	 */
	void vender();
	
	/**
	 * Retorna a placa do ve�culo
	 * @author Rodrigo Ricardo Radke
	 * @return String com a placa do ve�culo
	 */
	String getPlaca();
	
	/**
	 * Retorna o modelo do ve�culo
	 * @author Rodrigo Ricardo Radke
	 * @return String com o modelo do ve�culo
	 */
	String getModelo();
	
	/**
	 * Retorna a marca do ve�culo
	 * @author Rodrigo Ricardo Radke
	 * @return String com a marca do ve�culo
	 */
	String getMarca();

	/**
	 * Retorna o tipo do ve�culo, poss�veis retornos:
	 * - Carro
	 * - Onibus
	 * - Moto
	 * @param item Recebe um ve�culo ItemDeVenda
	 * @author Rodrigo Ricardo Radke
	 * @return String com o tipo do ve�culo
	 */
	String getTipoVeiculo(ItemDeVenda item);
}
