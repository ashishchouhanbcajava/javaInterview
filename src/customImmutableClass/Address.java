package customImmutableClass;

public class Address {

	private String state;
	private String city;

	public String getState() {
		return state;
	}

	
	public String getCity() {
		return city;
	}

	

	public Address(String state, String city) {
		super();
		this.state = state;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + "]";
	}
	
	

}
