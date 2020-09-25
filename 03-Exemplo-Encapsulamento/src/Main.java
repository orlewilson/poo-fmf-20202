/*
	Disciplina:		Programação Orientada a Objetos
	Facilitador:	Orlewilson Bentes Maia
	Data: 			23/09/20
	Aluno:			escreva seu nome
	Descrição: 		Criação de objetos a partir da classe Livro usando os conceitos de encapsulamento
	
	https://repl.it/languages/java10

*/
class Main {
	public static void main(String[] args) {
		
		// instanciar um Objetos
		Livro pequenoPrincipe = new Livro();

		// povoar os atributos (informar valores a cada atributo)
		// sem encapsulamento
//		pequenoPrincipe.editora = "Saraiva";
//		pequenoPrincipe.sumario = "introdução, capítulo 1...";
//		pequenoPrincipe.numeroPaginas = 200;
//		pequenoPrincipe.tema = "filosofia";
//		pequenoPrincipe.capa = "desenho";

		// com encapsulamento
		pequenoPrincipe.setEditora("Saraiva");
		pequenoPrincipe.setNumeroPaginas(200);
		

		// mostrar os valores dos atributos (recuperar valores de cada atributo
		// sem encapsulamento
//		System.out.println("Editora: " + pequenoPrincipe.editora);
//		System.out.println("Sumário: " + pequenoPrincipe.sumario);
//		System.out.println("Número de Páginas: " + pequenoPrincipe.numeroPaginas);
//		System.out.println("Tema: " + pequenoPrincipe.tema);
//		System.out.println("Capa: " + pequenoPrincipe.capa);

		// com encapsulamento
		System.out.println("Editora: " + pequenoPrincipe.getEditora());
		System.out.println("Número de Páginas: " + pequenoPrincipe.getNumeroPaginas());
	}
}