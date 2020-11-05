/*
	Disciplina:		Programação Orientada a Objetos
	Facilitador:	Orlewilson Bentes Maia
	Data: 			04/11/20
	Aluno:			escreva seu nome
	Descrição: 		Criação de objetos a partir da classe Torta usando os conceitos de herança e polimorfismo
	
	https://repl.it/languages/java10

*/
class Main {
	public static void main(String[] args) {
		
		// instanciar um objeto usando construtor sem argumentos
		Torta morango = new Torta();
		Bolo chocolate = new Bolo();
		
		morango.setCobertura("chantilly");
		morango.setDiametro(28);
		morango.setPeso(250);
		morango.setRecheio("morango");
		morango.setSabor("morango");
		morango.setIngredientes("morango, chantilly, bolacha maisena, açúcar, ovo, fermento");
		
		System.out.println("\n\n----- Torta de Morango");
		morango.mostrarInformacoes();
		
		System.out.println("\n\n----- Bolo de Chocolate");
		chocolate.mostrarInformacoes();
		
		
		
	}
}