package ThisandSuperKeyword;

public class Child extends Parent{
	
	public Child()
	{
		this(5);
		System.out.println("Child Constructor");
	}
	
	public Child(int j)
	{
		
		super(5,2);
		System.out.println("Single Argument Child Constructor");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child child=new Child();
	 
//		child.hobby();
//		child.property();

	}

}
