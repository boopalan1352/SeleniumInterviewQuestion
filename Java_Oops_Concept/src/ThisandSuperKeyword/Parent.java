package ThisandSuperKeyword;

public class Parent {

	Parent()
	{
//		this(10); //Explicit call of constructor
		System.out.println("Parent class constructor");
	}

	Parent(int i)
	{
		System.out.println("Single Argument Parent class constructor");
	}
	
	Parent(int i,int j)
	{
		this(2);
		System.out.println("two Argument Parent class constructor");
	}
	
	public void hobby()
	{
		System.out.println("Parents Hobby");
	}
	
	public void property()
	{
		System.out.println("Parents Property");
	}

	
	

}
