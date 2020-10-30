/*
	Disciplina:		Programação Orientada a Objetos
	Facilitador:	Orlewilson Bentes Maia
	Data: 			28/10/20
	Aluno:			escreva seu nome
	Descrição: 		Representação de um modelo para repersentar uma sobremesa
	
	https://repl.it/languages/java10

*/

public class Sobremesa {
	// atributos
	private String sabor;
	private String recheio;
	private String cobertura;
	private double preco;
	private int peso;
	private String ingredientes;

	// construtor sem argumento
	public Sobremesa() {
		this.sabor = "";
		this.recheio = "";
		this.cobertura = "";
		this.preco = 0.0;
		this.peso = 0;
		this.ingredientes = "";
	}

	// construtor com argumento
	public Sobremesa(String sabor, String recheio, String cobertura, double preco, int peso, String ingredientes) {
		this.sabor = sabor;
		this.recheio = recheio;
		this.cobertura = cobertura;
		this.preco = preco;
		this.peso = peso;
		this.ingredientes = ingredientes;
	}

	// metodos para garantir o enxapsulamento dos atributos
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getSabor() {
		return this.sabor;
	}

	public String getRecheio() {
		return this.recheio;
	}

	public String getCobertura() {
		return this.cobertura;
	}

	public double getPreco() {
		return this.preco;
	}

	public int getPeso() {
		return this.peso;
	}

	public String getIngredientes() {
		return this.ingredientes;
	}
}
