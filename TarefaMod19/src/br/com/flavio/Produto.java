package br.com.flavio;

import java.lang.reflect.Constructor;

@Tabela(nomes = { "Produto A" }, numero = 10, value = "30")
public class Produto {
	public static void main (String args[]) {
		Class produto = Produto.class;

		if(produto.isAnnotationPresent(Tabela.class)){

		Tabela tabela = (Tabela) produto.getAnnotation(Tabela.class);

		System.out.println("Tabela:\nNomes: "+tabela.nomes()+"\nNúmero: "+tabela.numero()+"\nValor: "+tabela.value());
		

		}
	}
	
}
