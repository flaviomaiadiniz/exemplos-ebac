package br.com.flavio;

import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		List <Pessoa> lista = new Pessoa().listaPessoas();
		Stream<Pessoa> listaF = lista.stream().filter (pessoa -> pessoa.getSexo().equals("F"));
		
		System.out.println("Lista geral:");
		lista.forEach(System.out::println);
		
		System.out.println("\nLista feminina:");
		listaF.forEach(System.out::println);
	}

}
	