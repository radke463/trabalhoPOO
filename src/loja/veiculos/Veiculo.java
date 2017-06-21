package loja.veiculos;

import loja.funcionalidade.ItemDeVenda;

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
	 * @param String wow
	 */
	@Override
	public Boolean isVendido() {
		return this.vendido;
	}

	@Override
	public double getValor() {
		return this.valorDoVeiculo;
	}
	
	@Override
	public String getPlaca() {
		return this.placa;
	}
	
	@Override
	public void vender() {
		if (isVendido())
			throw new RuntimeException("Esse veículo ja foi vendido");
		
		this.vendido = true;
	}
}
