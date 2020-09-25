/*
	Disciplina:		Programação Orientada a Objetos
	Facilitador:	Orlewilson Bentes Maia
	Data: 			16/09/20
	Aluno:			escreva seu nome
	Descrição: 		Criação de objetos a partir da classe Livro
	
	https://repl.it/languages/java10

*/
class Main {
	public static void main(String[] args) {
		
		// instanciar um Objetos
		Livro pequenoPrincipe = new Livro();

		// povoar os atributos (informar valores a cada atributo)
		pequenoPrincipe.editora = "Saraiva";
		pequenoPrincipe.sumario = "introdução, capítulo 1...";
		pequenoPrincipe.numeroPaginas = 200;
		pequenoPrincipe.tema = "filosofia";
		pequenoPrincipe.capa = "desenho";

		// mostrar os valores dos atributos (recuperar valores de cada atributo
		System.out.println("Editora: " + pequenoPrincipe.editora);
		System.out.println("Sumário: " + pequenoPrincipe.sumario);
		System.out.println("Número de Páginas: " + pequenoPrincipe.numeroPaginas);
		System.out.println("Tema: " + pequenoPrincipe.tema);
		System.out.println("Capa: " + pequenoPrincipe.capa);
	}
}