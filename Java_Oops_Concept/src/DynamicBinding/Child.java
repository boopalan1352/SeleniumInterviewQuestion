package DynamicBinding;

public class Child extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Child();
		p.motivate();
		p.study();
 //		p.play();

	}
	
	public void play()
	{
		System.out.println("child play");
	}
	
	public void study()
	{
		
		System.out.println("child Study");
		
	}
	
	public void motivate()
	{
		
		System.out.println("child Motivate");
		
	}
	

}
