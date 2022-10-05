package javaPackage;

public class TestPassByValue {

	public static void main(String[] args) {
	
		int num1 =1;
		int num2 =2;
		swap (num1,num2);
	
	}
	public static void swap(int n1, int n2) {
		int temp = n1;
		n1= n2;
		n2 = temp;
				
	}

}
