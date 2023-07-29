package br.com.flavio.service;

import br.com.flavio.dao.ClienteDAO;
import br.com.flavio.dao.ClienteDAOMock;
import br.com.flavio.dao.IClienteDAO;

public class ClienteService {
	
	private IClienteDAO clienteDao;
	
	public ClienteService(IClienteDAO clienteDao) {
		//clienteDao = new ClienteDAO();
		//clienteDao = new ClienteDAOMock();
		
		this.clienteDao= clienteDao;
		
	}

	public String salvar() {
		clienteDao.salvar();
		return "Sucesso";}
	
}
