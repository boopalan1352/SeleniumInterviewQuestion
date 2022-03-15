package staticandnonstatic;

public class Staticandnonstatic {
	
	Staticandnonstatic()
	{
		System.out.println("constructor block");
	}
	
	
	
	static
	{
		System.out.println("static block 1");
	}
	
	static
	{
		System.out.println("static block 2");
	}
	
	{
		System.out.println("Non static block1");
	}
	
	{
		System.out.println("Non static block2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main block Sysout statemaent");
		
		Staticandnonstatic sc=new Staticandnonstatic();
		Staticandnonstatic sc1=new Staticandnonstatic();
		
		stat();

	}
	
	public static void stat()
	{
		System.out.println("Static block method");
	}

}
