package br.com.flavio;

import java.util.List;
import java.util.stream.Stream;

public class Lista {
	public static void main(String[] args) {
		List <Pessoa> pessoas = new Pessoa().listaPessoas();
		Stream<Pessoa> femininos = pessoas.stream().filter (pessoa -> pessoa.getSexo().equals("F"));
		
		System.out.println("Lista geral:");
		pessoas.forEach(System.out::println);
		
		System.out.println("\nLista feminina:");
		femininos.forEach(System.out::println);
	}
	
}	