package objetoCARRO;

// definindo o objeto carro

public class Car {
	private String make;
	private String model;
	private int year;
	
	Car(String make, String model,int year){
		this.make = make;
		this.model = model;
		this.year = year;
	}
	// basically we will create a access method for our attributes
	// this way, you only can access your attributes by get and set methods
	
	public String getMake() {
		return make;
		
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
}
