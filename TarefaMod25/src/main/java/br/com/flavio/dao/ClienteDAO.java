package br.com.flavio.dao;

import br.com.flavio.domain.Cliente;

public class ClienteDAO implements IClienteDAO {

	@Override
	public Boolean salvar(Cliente cliente) {
		return true;
	}

	@Override
	public Cliente buscarCpf(Long cpf) {
		return null;
	}

	@Override
	public void excluir(Long cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

}
