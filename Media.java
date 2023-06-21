package br.com.flavio;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
			Scanner dados = new Scanner(System.in);
				
			System.out.println("Digite o valor do primeiro número: ");
			float num1= dados.nextInt();
			
			System.out.println("Digite o valor do segundo número: ");
			float num2= dados.nextInt();
			
			System.out.println("Digite o valor do terceiro número: ");
			float num3= dados.nextInt();
			
			System.out.println("Digite o valor do quarto número: ");
			float num4= dados.nextInt();
			
			float calculador = (num1+num2+num3+num4)/4;
			System.out.println("\nA média dos valores digitados é: " + calculador);
	
	}

}
