package br.com.flavio;

import java.util.List;
import java.util.Objects;

public class Pessoa {
	String nome;
	String sexo;
	public Pessoa() {
	}
	
	public Pessoa(String nome, String sexo) {
		this.nome=nome;
		this.sexo=sexo;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public List listaPessoas() {
		Pessoa pessoa1 = new Pessoa("José Mário", "M");
		Pessoa pessoa2 = new Pessoa("Maria José","F");
		Pessoa pessoa3 = new Pessoa("Caio Ribeiro","M");
		Pessoa pessoa4 = new Pessoa("Josefina Lúcia","F");
		return List.of(pessoa1, pessoa2, pessoa3, pessoa4);
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, sexo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(sexo, other.sexo);
	}

	@Override
	public String toString() {
		return "Pessoa (Nome: " + nome + ", Sexo: " + sexo + ")";
	}
	
}
