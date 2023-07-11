package br.com.flavio;

public abstract class Carro {
	public int codigo;
	public String nome;
	public int ano;
	public int potencia;
	public char cambio;
	
	public Carro(int codigo, String nome, int ano, int potencia, char cambio) {
		this.codigo=codigo;
		this.nome=nome;
		this.ano=ano;
		this.potencia=potencia;
		this.cambio=cambio;
	}
	
	public char getCambio() {
		return cambio;
	}
	public void setCambio(char cambio) {
		this.cambio = cambio;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	
}


