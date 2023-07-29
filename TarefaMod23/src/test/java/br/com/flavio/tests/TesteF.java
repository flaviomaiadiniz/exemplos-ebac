package br.com.flavio.tests;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import br.com.flavio.Pessoa;
import junit.framework.Assert;

public class TesteF {
	
	@Test
	public void TesteFem() {
		List <Pessoa> lista = new Pessoa().listaPessoas();
		
		List <Pessoa> listaF = lista.stream()
				.filter(pessoa -> pessoa.getSexo().equals("F"))
				.collect(Collectors.toList());
	
		for (Pessoa pessoa : listaF) {
		Assert.assertEquals("F", pessoa.getSexo());	
		}
	}
	
	

}
