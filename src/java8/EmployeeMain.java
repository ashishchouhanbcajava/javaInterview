package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Address {
	private Long id;
	private String address;
	private Employee employee;

	public Address(Long id, String address, Employee employee) {
		super();
		this.id = id;
		this.address = address;
		this.employee = employee;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", address=" + address + ", employee=" + employee + "]";
	}

}

class Employee implements Comparable<Employee> {

	private Long id;
	private String name;
	private String departmment;
	private Double salary;
	private List<Address> addresses = new ArrayList<Address>();

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Long id, String name, String departmment, Double salary, List<Address> addresses) {
		super();
		this.id = id;
		this.name = name;
		this.departmment = departmment;
		this.salary = salary;
		this.addresses = addresses;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartmment() {
		return departmment;
	}

	public void setDepartmment(String departmment) {
		this.departmment = departmment;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", departmment=" + departmment + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub

		return (int) (this.salary - o.salary);
	}

}

public class EmployeeMain {

	public static void main(String args[]) {

		List<Address> addresses = new ArrayList<>();
		Employee employee1 = new Employee(2l, "Aman", "Accounts", 35000D, addresses);
		addresses.add(new Address(1l, "Himachal", employee1));
		addresses.add(new Address(2l, "Mohali", employee1));

		List<Address> addresses1 = new ArrayList<>();
		Employee employee = new Employee(1l, "Aman", "IT", 30000D, addresses1);
		addresses1.add(new Address(1l, "punjab", employee));
		addresses1.add(new Address(2l, "Kashmir", employee));

		List<Address> addresses2 = new ArrayList<>();
		Employee employee2 = new Employee(3l, "Rahul", "IT", 4000000D, addresses2);
		addresses2.add(new Address(1l, "Rajasthan", employee2));
		addresses2.add(new Address(2l, "Uttarakhand", employee2));

		List<Address> addresses3 = new ArrayList<>();
		Employee employee3 = new Employee(4l, "Rohit", "Accounts", 50000D, addresses3);
		addresses3.add(new Address(1l, "Rajasthan", employee3));
		addresses3.add(new Address(2l, "Uttarakhand", employee3));

		List<Address> addresses4 = new ArrayList<>();
		Employee employee4 = new Employee(4l, "Rohit", "Accounts", 50000D, addresses4);
		addresses4.add(new Address(1l, "Himachal", employee4));
		addresses4.add(new Address(2l, "Mohali", employee4));

		List<Address> addresses5 = new ArrayList<>();
		Employee employee5 = new Employee(4l, "Rohit", "Accounts", 50000D, addresses5);
		addresses5.add(new Address(1l, "punjab", employee5));
		addresses5.add(new Address(2l, "Kashmir", employee5));

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
//		System.out.println("natural without sorting");
//		employees.forEach(System.out::println);

//		employees.stream().filter(e -> e.getSalary() > 30000).forEach(System.out::println);

//		System.out.println(" sorteddddd");
//		employees.stream().sorted().forEach(System.out::println);

//		System.out.println(" sorteddddd reversed...");
//		employees.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary))
//				.forEach(System.out::println);
//
//		System.out.println("double sorting ...");
//		employees.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary).reversed())
//				.forEach(System.out::println);

		String name = "Swiss";

		IntStream chars = name.chars();

		chars.sequential().forEach(e -> System.out.println("char : " + e));

		Stream<Character> nameStream = chars.mapToObj(c -> (char) c);

//		nameStream.	

		// Step 1: frequency map
		Map<Character, Long> freqMap = name.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(d -> d, Collectors.counting()));

		// Step 2: iterate from end

		IntStream range = IntStream.range(0, name.length());

		range.sequential().forEach(e -> System.out.println("range : " + e));

		Optional<Character> result = range.mapToObj(i -> name.charAt(name.length() - 1 - i))
				.filter(ch -> freqMap.get(ch) == 1).findFirst();

		result.ifPresent(System.out::println);

//		for (int i = name.length() - 1; i >= 0; i--) {
//			char ch = name.charAt(i);
//			if (freqMap.get(ch) == 1) {
//				System.out.println(ch);
//				break;
//			}
//		}

		String namee = "banana";

		Map<Character, Long> collect = namee.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
		for (Map.Entry<Character, Long> m : collect.entrySet()) {

//			System.out.println(m.getKey() + " " + m.getValue());
		}

//		list.stream()

		List<String> names = Arrays.asList("ashish", "rohit");

//		names.stream().map(String::toUpperCase).forEach(System.out::println);

//		names.stream().map(n -> n.substring(0, 1).toUpperCase() + n.substring(1)).forEach(System.out::println);

//		Map<String, Integer> lengthMap = new HashMap<>();
		Optional<String> max = names.stream().max(Comparator.comparing(String::length));
//		System.out.println("max length string : " + max.get());
//		lengthMap.forEach((k, v) -> {
//			System.out.println("name : " + k + "  length : " + v);
//		});

		List<Integer> numbers = Arrays.asList(20, 30, 50, 70, 10, 10, 10, 300);
		Optional<Integer> findFirst = numbers.stream().sorted(Collections.reverseOrder()).skip(1).findFirst();
		Collections.sort(numbers);
		int frequency = Collections.frequency(numbers, 10);
//		System.out.println("frequency : "+frequency);
		int binarySearch = Collections.binarySearch(numbers, 70);
//		System.out.println("index : " + binarySearch);

//		System.out.println("second largest : " + findFirst.get());

		Map<String, Long> collect2 = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartmment, Collectors.counting()));
		collect2.forEach((k, v) -> {
//			System.out.println("department : " + k + " value : " + v);
		});

		String word = "I Love you i You";
		String[] split = word.split(" ");
		List<String> stringList = Arrays.asList(split);
		stringList.stream().collect(Collectors.groupingBy(s -> s.toLowerCase(), Collectors.counting()))
				.forEach((k, v) -> {
//					System.out.println("word : " + k + " occurs : " + v + " times");

				});

		String duplicateWordsString = "Hello I am hello and i am";
		String[] split2 = duplicateWordsString.split(" ");
		Collections.synchronizedList(new ArrayList<>());
		List<String> duplicatesList = Arrays.asList(split2);
//		System.out.println(duplicatesList);

		Set<String> set = new HashSet<>();
		duplicatesList.stream().filter(e -> !set.add(e.toLowerCase())).forEach(f -> {
//			System.out.println("duplicate in the word : " + f);
		});

		List<Integer> numbers1 = Arrays.asList(20, 30, 50, 70, 10, 300);
		List<Integer> numbers2 = Arrays.asList(20, 30, 50, 70, 10, 300);

		List<Integer> list = Stream.concat(numbers1.stream(), numbers2.stream()).collect(Collectors.toList());
//		System.out.println(list);

		employees.stream().flatMap(e -> e.getAddresses().stream()).collect(Collectors.groupingBy(t -> t.getAddress()))
				.forEach((k, v) -> {
//					System.out.println(k + " " + v);
				});

		Collections.sort(names, (a, b) -> a.length() - b.length());
//		names.forEach(System.out::print);

	}
}
