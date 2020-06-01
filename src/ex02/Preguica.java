package ex02;

public class Preguica extends Animal {
	
	public String subir;
	
	public Preguica() {
		super();
	}


	

	public Preguica(String nome, String som, int idade, String subir) {
		super(nome, som, idade);
		this.subir = subir;
	}




	public String getSubir() {
		return subir;
	}

	public void setSubir(String subir) {
		this.subir = subir;
	}

	public void preguicaSubir() {
	 System.out.println(subir);
	}

}
