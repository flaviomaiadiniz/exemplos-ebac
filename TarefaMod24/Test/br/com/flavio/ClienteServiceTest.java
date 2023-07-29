package br.com.flavio;

import org.junit.Assert;
import org.junit.Test;

import br.com.flavio.dao.ClienteDAO;
import br.com.flavio.dao.ClienteDAOMock;
import br.com.flavio.service.ClienteService;

public class ClienteServiceTest {
	
	@Test
	public void salvarTest() {
		
		ClienteDAOMock mock = new ClienteDAOMock();
		ClienteService service = new ClienteService(mock);
		service.salvar();
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroNoSalvarTest() {
		
		 ClienteDAO mock = new ClienteDAO();
		ClienteService service = new ClienteService(mock);
		service.salvar();
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
	}

}
