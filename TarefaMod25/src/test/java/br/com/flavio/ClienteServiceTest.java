package br.com.flavio;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.flavio.dao.ClienteDaoMock;
import br.com.flavio.dao.IClienteDAO;
import br.com.flavio.domain.Cliente;
import br.com.flavio.services.ClienteService;
import br.com.flavio.services.IClienteService;

public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		Cliente cliente = new Cliente();
		cliente.setCpf(99812357650L);
		cliente.setCidade("Belo Horizonte");
		cliente.setEndereco("Rua 1, nº 2");
		cliente.setEstado("MG");
		cliente.setNome("Amarildo");
		cliente.setTel(3199859898L);
		clienteService.salvar(cliente);

	}
	
	@Test
	public void pesquisarCliente() {
		
		Cliente clienteConsultado = clienteService.buscarCpf(cliente.getCpf());
		
		Assert.assertNotNull(clienteConsultado);		
	}

	@Test
	public void salvarCliente() {
		Boolean retorno = clienteService.salvar(cliente);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() {
		cliente.setNome("Amarildo Santos Rodrigues");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Amarildo Santos Rodrigues", cliente.getNome(), cliente);
	}
	
}
