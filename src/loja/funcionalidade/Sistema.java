package loja.funcionalidade;

import loja.veiculos.Carro;
import loja.veiculos.Moto;
import loja.veiculos.Onibus;

public class Sistema {
	
	private int ano;
	private int marchas;
	private int acentos;
	private int portas;
	private float valor;
	private float km;
	private float cilindradas;
	private float potencia;
	private String marca;
	private String modelo;
	private String placa;
	private Boolean vendido;
	
	public void cadastrarVeiculo(int tipo) {
		switch(tipo) {
			case 1: this.cadastrarCarro();break;
			case 2: this.cadastrarOnibus();break;
			case 3: this.cadastrarMoto();break;
		}
	}
	
	public void iniciarCadastro(int ano, int marchas, float valor, float km, float cilindradas, float potencia, String marca, String modelo,
			String placa, Boolean vendido, int acentos, int portas, int tipo) {
		
		this.ano = ano;
		this.marchas = marchas;
		this.valor = valor;
		this.km = km;
		this.cilindradas = cilindradas;
		this.potencia = potencia;
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.vendido = vendido;
		
		this.cadastrarVeiculo(tipo);
	}
	
	public void cadastrarCarro() {
		Carro car = new Carro(ano, marchas, valor, km, cilindradas, potencia, marca, modelo, placa, vendido);
		car.setNumeroDeAcentos(acentos);
		car.setNumeroDePortas(portas);
	}
	
	public void cadastrarOnibus() {
		Onibus bus = new Onibus(ano, marchas, valor, km, cilindradas, potencia, marca, modelo, placa, vendido);
		bus.setNumeroDeAcentos(acentos);
		bus.setNumeroDePortas(portas);
	}
	
	public void cadastrarMoto() {
		Moto moto = new Moto(ano, marchas, valor, km, cilindradas, potencia, marca, modelo, placa, vendido);
	}
}
