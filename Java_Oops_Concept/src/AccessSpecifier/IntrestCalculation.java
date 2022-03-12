package AccessSpecifier;

public class IntrestCalculation {
	
	private IntrestCalculation()
	{
		System.out.println("Constructor");
	}
	
	
	private void custname(String name)
	{
		System.out.println(" "+name);
	}
	
	private void intrest(float a)
	{
		System.out.println(" "+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntrestCalculation calculation=new IntrestCalculation();
		calculation.custname("Arul");
		calculation.intrest(10.5f);
		
	}

}
