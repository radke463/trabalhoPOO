package loja.veiculos;

public abstract class Veiculo {
	protected int anoDeFabricacao;
	protected int numeroDeMarchas;
	protected float valorDoVeiculo;
	protected float quilometragem;
	protected float cilindradas;
	protected float potencia;
	protected String marca;
	protected String modelo;
	protected String placa;
	protected Boolean vendido;
	
	Veiculo(int ano, int marchas, float valor, float km, float cilindradas, float potencia, String marca, String modelo, String placa, Boolean vendido) {
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
}
