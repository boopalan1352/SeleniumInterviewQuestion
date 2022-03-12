package FinalKeyword;

public class Parent {
	
	public final double pi=3.65;
	
	public  final void Account()
	{
		System.out.println("Account Balance");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p=new Parent();
		System.out.println(p.pi);
		p.Account();

	}

}
