package javaPackage;

public class ExeptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int i =1/0;	
			System.out.println(i);
		}
		catch(ArithmeticException e)
		{
				System.out.println("Zero is not divisible by 1");
		}
	}
}