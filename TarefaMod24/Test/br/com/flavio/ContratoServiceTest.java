package br.com.flavio;

import org.junit.Assert;
import org.junit.Test;
import br.com.flavio.service.IContratoService;
import br.com.flavio.dao.ClienteDAO;
import br.com.flavio.service.ClienteService;
import br.com.flavio.service.ContratoService;
import br.com.flavio.dao.*;

public class ContratoServiceTest {
	
	@Test
	public void salvarTest() {
		IContratoDAO dao = new ContratoDAOMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
	}
	
	@Test
    public void buscarTeste() {
        IContratoDAO dao = new ContratoDAOMock();
        IContratoService serviceBusca = new ContratoService(dao);
        String retornoBusca = serviceBusca.buscar();
        Assert.assertEquals("Buscando Cliente.", retornoBusca);
    }
	
	@Test
    public void excluirTeste() {
        IContratoDAO dao = new ContratoDAOMock();
        IContratoService serviceExclui = new ContratoService(dao);
        String retornoExclui = serviceExclui.excluir();
        Assert.assertEquals("Excluindo Cliente.", retornoExclui);
    }
	
	@Test
    public void atualizarTeste() {
        IContratoDAO dao = new ContratoDAOMock();
        IContratoService serviceAtualiza = new ContratoService(dao);
        String retornoAtualiza = serviceAtualiza.atualizar();
        Assert.assertEquals("Atualizando dados do cliente.", retornoAtualiza);
    }
	
	

	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroNoSalvarComBancoDeDadosTest() {
		
		IContratoDAO dao = new ContratoDAO();
		IContratoService service = new ContratoService(dao);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroNoExcluirComBancoDeDadosTest() {
		
		IContratoDAO dao = new ContratoDAO();
		IContratoService serviceExclui = new ContratoService(dao);
		String retornoExclui = serviceExclui.excluir();
		Assert.assertEquals("Excluindo Cliente.", retornoExclui);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroNoBuscarComBancoDeDadosTest() {
		
		IContratoDAO dao = new ContratoDAO();
		IContratoService serviceBuscar = new ContratoService(dao);
		String retornoBuscar = serviceBuscar.buscar();
		Assert.assertEquals("Buscando Cliente.", retornoBuscar);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroNoAtualizarComBancoDeDadosTest() {
		
		IContratoDAO dao = new ContratoDAO();
		IContratoService serviceAtualizar = new ContratoService(dao);
		String retornoAtualizar = serviceAtualizar.atualizar();
		Assert.assertEquals("Atualizando dados do cliente.", retornoAtualizar);
	}
}
