package br.com.flavio;

public class ContratoFabrica extends Fabrica {

	
	Carro montaCarro(String requestedGrade) {
		switch (requestedGrade) {
		 	case "A": 
		 		return new AlfaRomeo(275, "Preto", "Cheio");
		 	case "B":
		 		return new BMW (748, "Branco", "Cheio");
		 		
		 	default:
		 		System.out.println("O carro requisitado não está disponível.");
		 		return null;
		}
	}

}
