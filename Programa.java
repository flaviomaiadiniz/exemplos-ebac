package br.com.flavio;

public class Programa {

		public static void main (String args[]) {
			
			Pessoa p=new pessoaFisica();
			p.setNome("Flávio Maia");
			p.setEndereço("Rua 1, nº 2");
			Pessoa pessoa=new pessoaJuridica();
			pessoa.setNome("Minha empresa");
			pessoa.setEndereço("Rua da empresa, nº qualquer");
			System.out.println(p.getNome()+", residente na "+p.getEndereço()+", tem a empresa "+pessoa.getNome()+", situada na "+pessoa.getEndereço()+".");
			
			pessoaJuridica x=new pessoaJuridica();
			pessoaFisica y=new pessoaFisica();
			x.setNomeFantasia("Flávio Negócios LTDA");
			x.setCnpj(32132000190L);
			x.setRamo("Comércio");
			y.setCpf(13131331331L);
			y.setNascimento("10/09/1990");
			System.out.println("\nDados do dono: \nNome: "+p.getNome()+"\nEndereço: "+p.getEndereço()+"\nCPF: "+y.getCpf()+"\nData de Nascimento: "+y.getNascimento()+"\n");
			System.out.println("Dados da empresa: \nRazão Social: "+pessoa.getNome()+"\nEndereço: "+pessoa.getEndereço()+"\nNomeFantasia: "+x.getNomeFantasia()+"\nCNPJ: "+x.getCnpj()+"\nRamo: "+x.getRamo());
			
			
		}
}
