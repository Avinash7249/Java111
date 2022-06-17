package Question1;

public class City {

	private String city;

	@Override
	public String toString() {
		return "City [city=" + city + "]";
	}

	public City(String city) {
		super();
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
