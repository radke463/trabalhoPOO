package loja.veiculos;

public class Onibus extends Veiculo{

	private int numeroDePortas;
	private int numeroDeAcentos;

	public Onibus(int ano, int marchas, float valor, float km, float cilindradas, float potencia, String marca, String modelo,
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
