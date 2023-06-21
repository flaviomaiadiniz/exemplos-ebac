package br.com.flavio;
import java.util.Scanner;

public class Exemplo1 {

	private static int num2;

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Digite o valor do número: ");
		int num1= dados.nextInt();
		
		int num2 = Integer.valueOf(num1);
		System.out.println("O número (com unboxing) digitado foi: "+num1);
				
		double num3 = num2;
		System.out.println("O número em 'double' é: " + num3);

	}

}
