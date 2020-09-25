/*
	Disciplina:		Programação Orientada a Objetos
	Facilitador:	Orlewilson Bentes Maia
	Data: 			23/09/20
	Aluno:			escreva seu nome
	Descrição: 		Representação de um modelo para Livro usando o conceito de encapsulamento
	
	https://repl.it/languages/java10

*/

// classe Livro
class Livro {

	// Atributos
	private String editora;
	private String sumario;
	private int numeroPaginas;
	private String tema;
	private String capa;

	// Métodos
	// ----- métodos get e set para o atributo editora
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public String getEditora() {
		return this.editora;
	}
	
	// ----- métodos get e set para o atributo numeroPaginas
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	public int getNumeroPaginas() {
		return this.numeroPaginas;
	}
	
	// ----- métodos get e set para o atributo ... (faça para os demais atributos :))
}
