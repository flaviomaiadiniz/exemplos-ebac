package br.com.flavio;

import org.junit.Assert;
import org.junit.Test;

public class TesteClienteTest {
	
	@Test
	public void testeClasseCliente() {
		TesteCliente cli = new TesteCliente();
		cli.adicionarNome("Arthur");
		
		Assert.assertEquals("Arthur", cli.getNome());
	}

}
