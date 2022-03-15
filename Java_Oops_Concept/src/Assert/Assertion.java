package Assert;

import java.util.Scanner;

public class Assertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you no.");
		int i=sc.nextInt();
//Type 1		
//		assert(i==10):"I needs to be 10";
//		System.out.println("you entered" +i);
//Type 2		
//		assert(i==10):"I needs to be 10";
//		System.out.println("you entered" +i);
//Type 3
		assert(i==10):text();   //with java.lang.AssertionError it returns null value also 
		
	}

	private static String text() {      // it should not be void (very important)
		// TODO Auto-generated method stub
		return null;
	}

}
