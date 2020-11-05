/*
	Disciplina:		Programação Orientada a Objetos
	Facilitador:	Orlewilson Bentes Maia
	Data: 			28/10/20
	Aluno:			escreva seu nome
	Descrição: 		Representação de um modelo para repersentar uma torta
	
	https://repl.it/languages/java10

*/

public class Torta extends Sobremesa {

	// atributos
	private int diametro;

	// construtor sem argumento
	public Torta() {
		// primeira forma
//		setSabor(""); // antes this.sabor = "";
//		setRecheio("");// antes this.recheio = "";
//		setCobertura("");// antes this.cobertura = "";
//		setPreco(0.0);// antes this.preco = 0.0;
//		setPeso(0);// antes this.peso = 0;
//		setIngredientes(""); // antes this.ingredientes = "";
//		this.diametro = 0;

		// segunda forma (na próxima aula - 04/11/2020)
//		super(); // chama o construtor sem argumentos da superclasse
//		this.diametro = 0;

		// segunda forma (na próxima aula - 04/11/2020)
		super("", "", "", 0.0, 0, ""); // chama o construtor com argumentos da superclasse
		this.diametro = 0;

	}

	// construtor com argumento
	public Torta(String sabor, String recheio, String cobertura, int diametro, double preco, int peso,
			String ingredientes) {
		// primeira forma
//		setSabor(sabor); // antes this.sabor = sabor;
//		setRecheio(recheio);// antes this.recheio = recheio;
//		setCobertura(cobertura);// antes this.cobertura = cobertura;
//		setPreco(preco);// antes this.preco = preco;
//		setPeso(peso);// antes this.peso = peso;
//		setIngredientes(ingredientes);// antes this.ingredientes = ingredientes;
//		this.diametro = diametro;

		// segunda forma (na próxima aula - 04/11/2020)
		super(sabor, recheio, cobertura, preco, peso, ingredientes);
		this.diametro = diametro;
	}

	// métodos para garantir o encapsulamento do atributo diametro
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public int getdDiametro() {
		return this.diametro;
	}
	
	public void mostrarInformacoes(){
	    // primeira forma
//	    super.mostrarInformacoes();
//	    System.out.println("Diâmetro: " + this.diametro);

	    // segunda forma
	    System.out.println("Sabor: " + getSabor());
	    System.out.println("Recheio: " + getRecheio());
	    System.out.println("Cobertura: " + getCobertura());
	    System.out.println("Preço: " + getPreco());
	    System.out.println("Peso: " + getPeso());
	    System.out.println("Ingredientes: " + getIngredientes());
	    System.out.println("Diâmetro: " + this.diametro);
	  }
}
