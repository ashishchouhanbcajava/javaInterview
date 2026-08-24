package com.Oops;

class StudentImp extends Student {
	private String age;

	public StudentImp(int id, String name, String address, String age) {
		super(id, name, address);
		this.age = age;
		System.out.println("I am StudentIMPL");
		// TODO Auto-generated constructor stub
		
	}
	

	@Override
	public void display(String name, String address, int id, String age) throws Exception  {
		// TODO Auto-generated method stub
		super.display(name, address, id, age);
	}


	@Override
	public String toString() {
		return "StudentImp [age=" + age + ", toString()=" + super.toString();
	}

}

public class Inheritence {
	public static void main(String[] args) {
		StudentImp studentImp = new StudentImp(10, "Ashish", "Hp", "22");
		System.out.println(studentImp);
//		studentImp.display("Ashish","hp",10,"222");
		
		
	}

	
}
