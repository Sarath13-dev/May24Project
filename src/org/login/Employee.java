package org.login;


//Class				- only non abstract methods		, Create object
//Abstract Class	- both abstract and non abstract methods, Cannot Create Object
//interface			- only abstract methods, Cannot Create Object
public class Employee {
	
	int a = 100;
	
	public void empId() {
		System.out.println("Employee id is 1234");
	}
	
	//Inner Class
	class School{
		
		public void innerMethod() {
			System.out.println("Inner Methods");
		}
		
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		System.out.println(e.a);
		System.out.println("Work done by QA");
		System.out.println("Tester");
	}
	
	
}
