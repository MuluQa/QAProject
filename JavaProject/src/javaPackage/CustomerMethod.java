package javaPackage;

public class CustomerMethod {
	
	String Name;
	String Sex;
	String Address;
	String SSN;
	int manualfee;
	
	
		void fee_paid_amount(int manualfee)
		{
			System.out.println("The fee of amount $ " +  manualfee);
			
		}
		
	public static void main(String[] args) {
		
		CustomerMethod obj = new CustomerMethod();
		obj.Name = "Regina";
		obj.Sex = "female";
		obj.Address = "1123 lauderdrela dr";
	    obj.fee_paid_amount(400);
	    
	    System.out.println("Customer Name "  +  obj.Name);
	    System.out.println("Customer sex "   +   obj.Sex);
	    System.out.println("Customer address "  +  obj.Address);
	    
	    
	    CustomerMethod obj1 = new CustomerMethod();
	    obj1.Name = "Fidelis";  
		obj1.Sex = "female";
		obj1.Address = "1123 Pharam dr";
	    obj1.fee_paid_amount(600);
		
	    System.out.println("Customer Name "  +  obj1.Name);
	    System.out.println("Customer sex "   +   obj1.Sex);
	    System.out.println("Customer address "  +  obj1.Address);
	 
	    
	    CustomerMethod obj2 = new CustomerMethod();
	    obj2.Name = "Laxim";  
		obj2.Sex = "female";
		obj2.Address = "1123 cox dr";
	    obj2.fee_paid_amount(800);
		
	    System.out.println("Customer Name "  +  obj2.Name);
	    System.out.println("Customer sex "   +   obj2.Sex);
	    System.out.println("Customer address "  +  obj2.Address);
	    
	    
	    CustomerMethod obj3 = new CustomerMethod();
	    obj3.Name = "Uaman";  
		obj3.Sex = "Male";
		obj3.Address = "10023 Rabbit dr";
	    obj3.fee_paid_amount(900);
	    
	    System.out.println("Customer Name "+  obj3.Name);
	    System.out.println("Customer sex "+   obj3.Sex);
	    System.out.println("Customer address "+  obj3.Address);
	}
}
		
	
	


