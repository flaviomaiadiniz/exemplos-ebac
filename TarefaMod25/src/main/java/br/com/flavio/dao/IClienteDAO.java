package br.com.flavio.dao;

import br.com.flavio.domain.Cliente;

public interface IClienteDAO {

	Boolean salvar(Cliente cliente);
	
	Cliente buscarCpf(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente);



}
