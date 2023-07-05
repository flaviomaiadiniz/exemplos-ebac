package br.com.flavio;

public class SemContrato extends Fabrica{

	Carro montaCarro(String requestedGrade) {
		switch (requestedGrade) {
	 		case "A": 
	 			return new FiatPalio(180, "Prata", "Vazio");
	 		case "B":
	 			return new HondaFit(210, "Azul", "Vazio");
	 		
	 		default:
	 			System.out.println("O carro requisitado não está disponível.");
	 			return null;
	}
	}
}