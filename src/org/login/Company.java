package org.login;

//Interface
public interface Company {
	
	public abstract void companyId();
	
	public abstract void companyName();
	
	public static void companyAddress() {
		System.out.println("Company address is Banglore");
	}
	
	default void companyOwner() {
		System.out.println("Company owner is Board of Members");
	}
	

}
