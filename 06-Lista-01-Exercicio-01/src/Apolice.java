/*
	Disciplina:		Programação Orientada a Objetos
	Facilitador:	Orlewilson Bentes Maia
	Data: 			11/11/20
	Aluno:			escreva seu nome
	Descrição: modelo para representar uma apólice
*/

public class Apolice {

	// atributos
	private String nomeSegurado;
	private int idade;
	private double valorPremio;

	// construtores
	public Apolice() {
		this.nomeSegurado = "";
		this.idade = 0;
		this.valorPremio = 0.0;
	}

	public Apolice(String nomeSegurado, int idade, double valorPremio) {
		this.nomeSegurado = nomeSegurado;
		this.idade = idade;
		this.valorPremio = valorPremio;
	}

	// métodos
	public void setNomeSegurado(String nomeSegurado) {
		this.nomeSegurado = nomeSegurado;
	}

	public String getNomeSegurado() {
		return this.nomeSegurado;
	}

	public void setIdade(int idade) {
		if (idade < 0) {
			System.out.println("Favor informar valor positivo para idade");
		} else {
			this.idade = idade;
		}
	}

	public int getIdade() {
		return this.idade;
	}

	public void setValorPremio(double valorPremio) {
		if (valorPremio < 0) {
			System.out.println("Favor informar valor positivo para Valor Prêmio");
		} else {
			this.valorPremio = valorPremio;
		}
	}

	public double getValorPremio() {
		return this.valorPremio;
	}

	public void imprimir() {
		System.out.println("Nome Segurado: " + getNomeSegurado());
		System.out.println("Idade: " + getIdade());
		System.out.println("Valor Prêmio: " + getValorPremio());
	}

	public void calcularPremioApolice() {

		// caso a idade seja maior ou igual a 18 e menor ou igual a 25 anos,
		// if (this.idade >= 18 && this.idade <= 25>)
		if (getIdade() >= 18 && getIdade() <= 25) {
			valorPremio += (valorPremio * 20) / 100;
			// valorPremio = valorPremio + (valorPremio * 20)/100.
		}

		if (getIdade() > 25 && getIdade() <= 36) {
			valorPremio += (valorPremio * 15) / 100;
		}

		if (getIdade() > 36) {
			valorPremio += (valorPremio * 10) / 100;
		}
	}

	public void oferecerDesconto(String cidade) {
		// cidade.equals("Manaus") palavra exatamente igual
		// cidade.equalsIgnoreCase("Manaus") conteúdo igaul
		if (cidade.equalsIgnoreCase("manaus")) {
			this.valorPremio = this.valorPremio - this.valorPremio * 20 / 100;
			// this.valoPremio -= this.valorPremio*20/100;
			// setValorPremio(getValorPremio() - getValorPremio()*20/100);
			// double temp = getValorPremio() - getValorPremio()*20/100);
			// setValorPremio(temp);
		}

		if (cidade.equalsIgnoreCase("belém")) {
			this.valorPremio = this.valorPremio - this.valorPremio * 15 / 100;
		}
		if (cidade.equalsIgnoreCase("belo horizonte")) {
			this.valorPremio = this.valorPremio - this.valorPremio * 10 / 100;
		}
		if (cidade.equalsIgnoreCase("são paulo")) {
			this.valorPremio = this.valorPremio - this.valorPremio * 5 / 100;
		}
	}

}