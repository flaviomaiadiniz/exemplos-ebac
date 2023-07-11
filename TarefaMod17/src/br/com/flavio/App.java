package br.com.flavio;
import br.com.flavio.*;
import java.util.ArrayList;
import java.util.List;

public class App {

	public static <T> void main(String[] args) {
		Carro carro=new Honda(3, "Civic", 2022, 240, 'A');
		Carro carro2=new Toyota(2, "Corolla", 2023, 290, 'A');
		Carro carro3=new Fiat(1,"Argo", 2021, 130, 'M');

        List<T> lista = new ArrayList<>();
        
        lista.add((T) Honda.class);
        lista.add((T) Toyota.class);
        lista.add((T)Fiat.class);
        
        System.out.println("Lista: "+lista);
        System.out.println("\nInformações do carro Fiat:\nCódigo: "+carro3.codigo+"\nNome: "+carro3.nome+"\nAno: "+carro3.ano+"\nPotência: "+carro3.potencia+"\nCâmbio: "+carro3.cambio+"\n--------------\n");
        System.out.println("Informações do carro Toyota:\nCódigo: "+carro2.codigo+"\nNome: "+carro2.nome+"\nAno: "+carro2.ano+"\nPotência: "+carro2.potencia+"\nCâmbio: "+carro2.cambio+"\n--------------\n");
        System.out.println("Informações do carro Honda:\nCódigo: "+carro.codigo+"\nNome: "+carro.nome+"\nAno: "+carro.ano+"\nPotência: "+carro.potencia+"\nCâmbio: "+carro.cambio+"\n--------------\n");
	}

}
