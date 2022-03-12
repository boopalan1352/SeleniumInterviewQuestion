package InterfaceKeyword;

public class Employee implements Company{


	@Override
	public void comeOnTime() {
		// TODO Auto-generated method stub
		System.out.println("On Time");
		
	}

	@Override
	public void takeLeave() {
		// TODO Auto-generated method stub
		System.out.println("Take Leave");
		
	}

	@Override
	public void getSalary() {
		// TODO Auto-generated method stub
		System.out.println("Get Salary");
		
	}
	
	public void lesuire() {
		// TODO Auto-generated method stub
		System.out.println("Lesuire");
		
	}
	
	public static void main(String[] args) {
		Employee emp=new Employee();
		System.out.println(Company.minSalary);
		System.out.println(Company.noOfLeaves);
		
		
		Company comp=new Employee();
		comp.comeOnTime();
		comp.takeLeave();
		comp.getSalary();
		comp.lesuire();
		
		
				
	}

}
