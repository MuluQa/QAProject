package javaPackage;

public class Customer {
String name;
String sex;
String address;
String ssn;
int fee;
	
	public static void main(String[] args) {
		// Create a object
		Customer obj = new Customer();
		obj.name = "rigina";
		obj.sex = "Male";
		obj.address = "Virginia";
		obj.ssn = "01020303";
		//obj.fee = 2000;
		
		System.out.println("Name of Customer " + obj.name);
		System.out.println("Sex or Customer " + obj.sex);
		System.out.println("Address of Customer " + obj.address);
		System.out.println("SSN of Customer " + obj.ssn);
		//System.out.println("Fee of Customer " + obj.fee);
		
		Customer obj1 = new Customer();
		obj1.name = "Jordan";
		obj1.sex = "Male";
		obj1.address = "West Virginia";
		//obj1.fee = 4000;
		
		
		System.out.println("Name of Customer " + obj1.name);
		System.out.println("Sex or Customer " + obj1.sex);
		System.out.println("Address of Customer " + obj1.address);
		//System.out.println("Fee of Customer " + obj1.fee);
		
		Customer obj2 = new Customer();
		obj2.name = "Laximi";
		obj2.sex = "Female";
		obj2.address = "Virginia";
		//obj2.fee = 6000;
		
		System.out.println("Name of Customer " + obj2.name);
		System.out.println("Sex or Customer " + obj2.sex);
		System.out.println("Address of Customer " + obj2.address);
		//System.out.println("Fee of Customer " + obj2.fee);
		
		Customer obj3 = new Customer();
		obj3.name = "Usman";
		obj3.sex = "Male";
		obj3.address = "Virginia";
		//obj3.fee = 8000;
		
		System.out.println("Name of Customer " + obj3.name);
		System.out.println("Sex or Customer " + obj3.sex);
		System.out.println("Address of Customer " + obj3.address);
		//System.out.println("Fee of Customer " + obj3.fee);
		
		Customer obj4 = new Customer();
		obj4.name = "Mulualem";
		obj4.sex ="Female";
		obj4.address = "11834 Cahse Wellesly";
		//obj4.fee = 10000;
		
		System.out.println("Name of Customer "+ obj4.name);
		System.out.println("Sex of Customer " + obj4.sex);
		System.out.println("Address of Customer " + obj4.address);
		//System.out.println("Fee of Customer " + obj4.fee);
		
	
		
	}

}
