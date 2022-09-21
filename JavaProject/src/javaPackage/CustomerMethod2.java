package javaPackage;

public class CustomerMethod2 extends CustomerMethod
{

	void feeManual()
	{
		int a = 400;
		System.out.println("The fee of manual is $ " + a);
		System.out.println("The fee of manual is $");
	}
	
	int automation()
	{
		return 1000;
	}

	public static void main(String[] args) {
		//TODO Auto-generated method stub
				
		CustomerMethod2 Obj2 = new CustomerMethod2();
		
		Obj2.feeManual();
		Obj2.automation();
		
		Obj2.fee_paid_amount(2000);
		
		System.out.println( "The autometed value"+ Obj2.automation());
		
	System.out.println(" Note:- the int automaion return, we can use it anywhere inside the main method");
	System.out.println(" Note:- the void feeManual will use it outside of the main method");
	}

}
