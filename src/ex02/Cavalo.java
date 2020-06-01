package ex02;

public class Cavalo extends Animal {

	public String correr;
	
	public Cavalo() {
	}

	public Cavalo(String nome, String som, int idade, String correr) {
		super(nome, som, idade);
		this.correr = correr;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	public void cavaloCorre() {
		System.out.println(correr);
	}
	
}
