package br.com.flavio.services;

import br.com.flavio.dao.ClienteDAO;
import br.com.flavio.dao.IClienteDAO;
import br.com.flavio.domain.Cliente;

public class ClienteService implements IClienteService {
	
	private IClienteDAO clienteDAO;
	
	public ClienteService(IClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
		
	}

	@Override
	public Boolean salvar(Cliente cliente) {
		return clienteDAO.salvar(cliente);
		
	}

	@Override
	public Cliente buscarCpf(Long cpf) {
		return clienteDAO.buscarCpf(cpf);
	}

	@Override
	public void excluir(Long cpf) {
		clienteDAO.excluir(cpf);
		
	}

	@Override
	public void alterar(Cliente cliente) {
		clienteDAO.alterar(cliente);
	}

}
