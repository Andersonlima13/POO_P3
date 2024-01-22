package polimorfismo;

public class imposto {
	
	public void alimentacao(double salario) {
		System.out.println("O desconto padrão é de " + (salario *0.10));
	}
	
	
	
	public void Transporte(double salario)
    {
        System.out.println("desconto padrão transporte de  R$ " + (salario * 0.06));   

    }
}
