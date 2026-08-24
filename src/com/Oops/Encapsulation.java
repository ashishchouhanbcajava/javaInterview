package com.Oops;

/*//Encapsulation means Encapsulation in Java is a process of wrapping code
 *  and data together into a single unit, for example, a capsule which is mixed of several medicines.

encapsulation in java We can create a fully encapsulated
class in Java by making all the data members of the class private.
Now we can use setter and getter methods to set and get the data in it.
*/
class Student  {
		 int id;
		private String name;
		private String address;

		public Student(int id, String name, String address) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			System.out.println("i am student");
		}
		public void display(String name,String address,int id,String age) throws Exception  
		{
			System.out.println(name+" "+id+" "+address+" "+age);
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
		}
		

	}

	public class Encapsulation {
		public static void main(String[] args) {
			Student student = new Student(10, "Ashish", "hp");
			student.id=100;
			System.out.println(student);

			
		}
}
