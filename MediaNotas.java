package br.com.flavio;
import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
			Scanner dados = new Scanner(System.in);
				
			System.out.println("Digite o valor da primeira nota: ");
			float num1= dados.nextInt();
			
			System.out.println("Digite o valor da segunda nota: ");
			float num2= dados.nextInt();
			
			System.out.println("Digite o valor da terceira nota: ");
			float num3= dados.nextInt();
			
			System.out.println("Digite o valor da quarta nota: ");
			float num4= dados.nextInt();
			
			float calculador = (num1+num2+num3+num4)/4;
			System.out.println("\nA sua média final é: " + calculador + "\n");
			
			if(calculador>=7) {
				System.out.println("Parabéns! Você está APROVADO!");
			} else if (calculador<7 && calculador>=5) {
				System.out.println("Atenção, você está de RECUPERAÇÃO.");
			} else {
				System.out.println("Que pena, você está REPROVADO!");
			}
	
	}

}
