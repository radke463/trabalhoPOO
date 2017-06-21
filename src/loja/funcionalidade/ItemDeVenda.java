package loja.funcionalidade;

public interface ItemDeVenda {
	Boolean isVendido();
	
	double getValor();
	
	String getPlaca();
	
	void vender();
}
