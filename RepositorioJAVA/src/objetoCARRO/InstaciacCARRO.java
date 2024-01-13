package objetoCARRO;

public class InstaciacCARRO {
	public static void main(String [] args) {
		Carro c1 = new Carro();
		
		c1.nome = "3i";
		c1.marca = "bmw";
		c1.ano = 2018;
		c1.vel = 200;
		
		c1.acelerar(100);
		System.out.println(c1.vel);
		
				
	}
}
