package ex02;

public class Animal {
	public String nome;
	public String som;
	protected int idade;

	public Animal() {
		super();
	}
		
	public Animal(String nome, String som, int idade) {
		super();
		this.nome = nome;
		this.som = som;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public void emitirSom() {
		System.out.println(som);
	}
	public void apresentaIdade() {
		System.out.println(idade);
	}
	public void apresentaNome() {
		System.out.println(nome);
	}
	
	
}
