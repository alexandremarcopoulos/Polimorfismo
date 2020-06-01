package ex02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cachorro = new Cachorro("Claudinho", "auauau", 2, "Correr");
		Animal cavalo = new Cavalo("Odete", "auchsss", 4, "Correr");
		Animal preguica = new Preguica("BigPreguição", "vrrvrvrvrrr", 10, "Subir");
		
		cachorro.emitirSom();
		cavalo.emitirSom();
		preguica.emitirSom();
	}

}
