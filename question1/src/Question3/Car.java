package Question3;

public class Car {
	private String model;
	private String companyName;
	private String Color;
	private Engine engine;
	
	public Car(String model, String companyName, String color, Engine engine) {
		super();
		this.model = model;
		this.companyName = companyName;
		Color = color;
		this.engine = engine;
	}
	
	Car(){};
	
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
	}
	
	public void setcompanyName(String companyName) {
		this.companyName=companyName;
	}
	public String getcompanyName() {
		return companyName;
	}
	public void setColor(String Color) {
		this.Color=Color;
	}
	public String getColor() {
		return Color;
	}
	
	
	}
