package ex02;

public class Cachorro extends Animal {

	public String correr;

	public Cachorro() {
	}

	public Cachorro(String nome, String som, int idade, String correr) {
		super(nome, som, idade);
		this.correr = correr;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	public void cachorroCorre() {
		System.out.println(correr);
	}
		
}
