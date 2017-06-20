package loja.veiculos;

public class Carro extends Veiculo{

	private int numeroDePortas;
	private int numeroDeAcentos;
	

	Carro(int ano, int marchas, float valor, float km, float cilindradas, float potencia, String marca, String modelo,
			String placa, Boolean vendido) {
		super(ano, marchas, valor, km, cilindradas, potencia, marca, modelo, placa, vendido);
	}
	
	public int getNumeroDePortas() {
		return numeroDePortas;
	}

	public void setNumeroDePortas(int numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}

	public int getNumeroDeAcentos() {
		return numeroDeAcentos;
	}

	public void setNumeroDeAcentos(int numeroDeAcentos) {
		this.numeroDeAcentos = numeroDeAcentos;
	}

}
