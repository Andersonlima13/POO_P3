package pratica2poo;

public class Teste {
	
	public static void Main(String[] args) {
		Retangulo r = new Retangulo();
		r.id = 1;
		r.largura = 1;
		r.comprimento = 7;
		System.out.println(r.calcular_area());
		r.largura = 3;
		r.comprimento = 4;
		System.out.println(r.calcular_area());
	}

}
