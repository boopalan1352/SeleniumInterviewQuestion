package Inheritance;

public class Child extends Parent{
	
	public void property()
	{
		super.property();
		System.out.println("child Property");
	}

	public void hobby()
	{
		this.property();
		System.out.println("child Property");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child child=new Child();
		child.hobby();
//		child.property();

	}

}
