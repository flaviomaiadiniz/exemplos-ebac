package br.com.flavio;
import br.com.flavio.*;

public class DemoLoja {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("A", false);
		Fabrica fabrica= getCarFactory(cliente1);
		Carro carro1 = fabrica.carroZero(cliente1.getgradeRequest());
		carro1.startEngine();
	}

	private static Fabrica getCarFactory(Cliente cliente1) {
		if(cliente1.contratoEmpresa()) {
			return new ContratoFabrica();
		}else {
		return new SemContrato();	
		}
	}

}
