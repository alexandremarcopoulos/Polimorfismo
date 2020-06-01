package ex01;

public class Main {
	public static void main(String [] args) {
		Cavalo cava = new Cavalo("Claudio", "(som-do-cavalo.mp3)", 6, "Corre");
		Cachorro cach = new Cachorro("Nelson", "AUAUAUAUAUAUABRAW", 2, "Correndo");
		Preguica preg = new Preguica("Preguicinha", "AHHUUUM", 9, "sobe na arvore");
//		
		cava.apresentaNome();
		cava.emitirSom();
		cava.apresentaIdade();
		cava.cavaloCorre();
		
		cach.apresentaNome();
		cach.emitirSom();
		cach.apresentaIdade();
		cach.cachorroCorre();
		
		preg.apresentaNome();
		preg.emitirSom();
		preg.apresentaIdade();
		preg.preguicaSubir();
		
	}
}
