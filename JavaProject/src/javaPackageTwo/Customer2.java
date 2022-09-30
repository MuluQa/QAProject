package javaPackageTwo;

public class Customer2 {
String name;
String sex;
String address;
int fee;
	public static void main(String[] args) {
		//Create an object
		
		Customer2 Object = new Customer2();
		Object.name = "Lucas";
		Object.sex = "Male";
		Object.address = "3425 west virginia";
		Object.fee = 20000;
		
		System.out.println("Name of the Customer " + Object.name);
		System.out.println("Sex of the Customer "+ Object.sex);
		System.out.println("Address of the Customer " + Object.address);
		System.out.println("Fee of the Customer " + Object.fee);
		
		Customer2 Obj = new Customer2();
		Obj.name = "Mulualem";
		Obj.sex = "female";
		Obj.address = "11834 Arbor Creek, virginia ";
		Obj.fee = 50000;
		
		System.out.println("Name of the Customer 2  "+ Obj.name);
		System.out.println("Sex of the Customer 2  " + Obj.sex);
		System.out.println("Address of the Customer 2  " + Obj.address);
		System.out.println("Fee of the Custoer 2  " + Obj.fee);

	}

}
