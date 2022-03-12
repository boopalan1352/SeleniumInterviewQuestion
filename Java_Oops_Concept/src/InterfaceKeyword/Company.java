package InterfaceKeyword;

public interface Company {
	
	public Company()
	{
		System.out.println("Comapny Interface");
	}
	
	int noOfLeaves=12;
	int minSalary=15000;
	
	public void comeOnTime();
	
	public void takeLeave();
	
	public void getSalary();

}
