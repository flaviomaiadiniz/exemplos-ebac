package br.com.flavio;

public abstract class Fabrica {

	  public Carro carroZero(String requestedGrade) {
        Carro carro = montaCarro(requestedGrade);
        carro = entregaCarro(carro);
        return carro;
    }

    private Carro entregaCarro(Carro carro) {
        carro.limpa();
        carro.mecanica();
        carro.tanque();
        return carro;
    }

    abstract Carro montaCarro(String requestedGrade);
    
}
