package br.com.flavio.services;

import br.com.flavio.domain.Cliente;

public interface IClienteService {

	Boolean salvar(Cliente cliente);

	Cliente buscarCpf(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente);

}
