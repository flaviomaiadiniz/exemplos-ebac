package br.com.flavio;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class lista1 {

	public static void main(String[] args) {
		lista();
		}
	
	private static void lista() {
		String nomes;
		
		List <String> lista = new LinkedList<String> ();
		Scanner ler = new Scanner (System.in);
		System.out.println("Deseja incluir um nome na lista? ");
		String resposta = ler.next();
       // String[] nomeSep = nomes.split(",");

		while(resposta.equalsIgnoreCase("Sim")) {
			System.out.println("Digite o nome: ");
			nomes = ler.next();
			lista.add(nomes);

			System.out.println("Deseja acrescentar um nome?");
			String novaResposta = ler.next();
			resposta=novaResposta;
		}
		Collections.sort(lista);
		System.out.println("\nA sua lista é: \n"+lista);
			}
		}