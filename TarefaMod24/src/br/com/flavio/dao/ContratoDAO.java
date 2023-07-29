package br.com.flavio.dao;

public class ContratoDAO implements IContratoDAO {

	@Override
	public void salvar() {

		throw new UnsupportedOperationException("Não funciona com o banco");
	}
	
	 @Override
	    public void buscar() {
	        throw new UnsupportedOperationException("Cliente não encontrado");
	    }

	    @Override
	    public void excluir() {
	        throw new UnsupportedOperationException("Não foi possível excluir cliente.");
	    }

	    @Override
	    public void atualizar() {
	        throw new UnsupportedOperationException("Não foi possível atualizar dados do cliente.");
	    }

}
