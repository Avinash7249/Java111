package Question3;

public class Engine {
	private int rmp;
	private int Power;
	private String manufacturer;
	private Boolean hasTurbo;
		public Engine(int rmp, int power, String manufacturer) {
		
		this.rmp = rmp;
		Power = power;
		this.manufacturer = manufacturer;
		
	}
		
	Engine(){};
		public void hasturbo(Boolean hasTurbo) {
			if( hasTurbo==true) {
				this.hasTurbo=true;
			}
		}
		public void setRmp(int rmp) {
			this.rmp=rmp;
		}
		public int getRmp() {
			return rmp;
		}
		
		public void setPower(int Power) {
			this.Power=Power;
		}
		public int getPower() {
			return Power;
		}
		public void setManufacturer(String manufacturer) {
			this.manufacturer=manufacturer;
		}
		public String getManufacturer() {
			return manufacturer;
		}
		public void displayCourseDetails() {
			System.out.println("RPM is :"+rmp);
			System.out.println("manufacturer is :"+manufacturer);
			System.out.println("Power is :"+Power);
			
		}
	}


