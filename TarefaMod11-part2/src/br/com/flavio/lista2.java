package br.com.flavio;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class lista2 {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();

		List<String> masculinos = new ArrayList<>();
		List<String> femininos = new ArrayList<>();
		
        Scanner ler = new Scanner(System.in);

		System.out.print("Digite os nomes, como o exemplo (nome - M/F, ).\n ");
        String resposta = ler.nextLine();
        String[] nomeSep = resposta.split(",");
        for (int x = 0; x < nomeSep.length; x++) {
            nomes.add(nomeSep[x]);
        }
        
        for (String nome : nomes) {
		    String[] partes = nome.split("-");
		    if (partes[1].equals(" M")) {
		        masculinos.add(partes[0]);
		    } else {
		        femininos.add(partes[0]);
		    }
		}

		System.out.println("Nomes masculinos:");
			Collections.sort(masculinos);
		    System.out.println(masculinos);

		System.out.println("\nNomes femininos:");
			Collections.sort(femininos);
		    System.out.println(femininos);
}
}
