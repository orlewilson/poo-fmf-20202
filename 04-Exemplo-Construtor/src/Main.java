/*
	Disciplina:		Programação Orientada a Objetos
	Facilitador:	Orlewilson Bentes Maia
	Data: 			14/10/20
	Aluno:			escreva seu nome
	Descrição: 		Criação de objetos a partir da classe Livro usando os conceitos de encapsulamento  e construtor
	
	https://repl.it/languages/java10

*/
class Main {
	public static void main(String[] args) {
		
		// instanciar um objeto usando construtor sem argumento
//		Livro pequenoPrincipe = new Livro();
//		pequenoPrincipe.setEditora("Saraiva");
//		pequenoPrincipe.setNumeroPaginas(200);
//		pequenoPrincipe.setSumario("introdução, capítulo 1...");
//		pequenoPrincipe.setTema("filosofia");
//		pequenoPrincipe.setCapa("desenho");

		// instanciar um objeto usando construtor com argumentos
		Livro pequenoPrincipe = new Livro("Saraiva", "introdução, capítulo 1...", 200, "filosofia", "desenho");
		
		pequenoPrincipe.mostrarInformacoesLivro();	
	}
}