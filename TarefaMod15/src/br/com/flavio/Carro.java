package br.com.flavio;

public abstract class Carro {
	private int potencia;
	private String cor;
	private String tanque;
	
	public Carro(int potencia, String cor, String tanque) {
		this.potencia=potencia;
		this.cor=cor;
		this.tanque=tanque;
	}
	public void startEngine() {
		System.out.println("***Seu carro***\n"+getClass().getSimpleName()+"\n");
        System.out.println("O tanque está " + tanque + " e preparado para utilizar o motor de  " + potencia+ " cv de potência." );
	}
	
	public void mecanica() {
        System.out.println("Todas as combinações de segurança e mecânica foram testadas e estão prontas para o uso.");
    }

    public void tanque() {
        System.out.println("O tanque está " + tanque + ", e o motor com " + potencia + "cv esta pronto para ser utilizado\n");
    }

    public void limpa() {
        System.out.println("Seu carro está limpo e a cor " + cor.toLowerCase() + " esta brilhando! ");
    }
}
