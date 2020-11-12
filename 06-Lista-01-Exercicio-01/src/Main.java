
/*
	Disciplina:		Programação Orientada a Objetos
	Facilitador:	Orlewilson Bentes Maia
	Data: 			11/11/20
	Aluno:			escreva seu nome
	Descrição: 		Criação de objetos a partir da classe TApolice
	

*/
// declara o uso da biblioteca Scanner
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Apolice novoObj = new Apolice();

		// objetivo para ler valores a partir do console
		Scanner leituraConsole = new Scanner(System.in);

		System.out.println("Informe o nome do segurado:");
		// nextLine() = pega todo o conteúd da linha, mesmo havendo espaço
		novoObj.setNomeSegurado(leituraConsole.nextLine());
		
		System.out.println("Informe a idade:");
		// Integer.valueOf = converte o valor informado no argumento que é do tipo String para inteiro
		novoObj.setIdade(Integer.valueOf(Integer.valueOf(leituraConsole.nextLine())));
		
		// Double.valueOf = converte o valor informado no argumento que é do tipo String para double
		System.out.println("Informe o valor do prêmio:");
		novoObj.setValorPremio(Double.valueOf(leituraConsole.nextLine()));

		// novoObj.setNomeSegurado("Trinidy");
		// novoObj.setIdade(18);
		// novoObj.setValorPremio(10000);
		novoObj.imprimir();
		System.out.println("-------");

		novoObj.calcularPremioApolice();
		novoObj.imprimir();
		System.out.println("-------");

		novoObj.oferecerDesconto("belo horizonte");
		novoObj.imprimir();
		System.out.println("-------");
	}
}