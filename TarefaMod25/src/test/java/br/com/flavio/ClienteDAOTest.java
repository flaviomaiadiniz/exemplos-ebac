package br.com.flavio;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.flavio.dao.ClienteDAO;
import br.com.flavio.dao.ClienteDaoMock;
import br.com.flavio.dao.IClienteDAO;
import br.com.flavio.domain.Cliente;

public class ClienteDAOTest {
	
	private IClienteDAO clienteDao;
	
	private Cliente cliente;
	
	public ClienteDAOTest() {
		clienteDao = new ClienteDaoMock();
		
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
		clienteDao.salvar(cliente);
	}
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteDao.buscarCpf(cliente.getCpf());
		
		Assert.assertNotNull(clienteConsultado);
	}

	
	public void salvarCliente() {
		clienteDao.salvar(cliente);

	}
	
	@Test
	public void excluirCliente() {
		clienteDao.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() {
		clienteDao.alterar(cliente);
	}
}