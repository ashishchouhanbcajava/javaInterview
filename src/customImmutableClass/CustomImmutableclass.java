package customImmutableClass;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public final class CustomImmutableclass {
	private final int id;
	private final String name;
	private final Date date;
	private List<String> mobile;
	private final Address address;

	public CustomImmutableclass(int id, String name, Date date, List<String> mobile, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.mobile = mobile;
		this.address = address;
	}

	@Override
	public String toString() {
		return "CustomImmutableclass [id=" + id + ", name=" + name + ", date=" + date + ", mobile=" + mobile
				+ ", address=" + address + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getDate() {
		return new Date(); // either of returning date variable we return the new date object or clone of
		// the date it will make it unchangable
	}

	public List<String> getMobile() {
		return mobile;
	}

	public Address getAddress() {
		return new Address(address.getState(), address.getCity());
	}

	public static void main(String[] args) {
		Address address2 = new Address("Hp", "Bajnath");
		List<String> list = Arrays.asList("7876761256", "3284774");

		CustomImmutableclass immutableclass = new CustomImmutableclass(1, "Ashish", new Date(), list, address2);
		System.out.println(immutableclass);
		immutableclass.getDate().setDate(30);
		immutableclass.getAddress();
		System.out.println(immutableclass);

	}

}
