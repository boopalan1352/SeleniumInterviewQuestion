package GetterSetterMethod;

public class SBICustomer extends SBIBank{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBICustomer sbi=new SBICustomer();
		System.out.println(sbi.getEMI());
		sbi.setEMI(200);
		System.out.println(sbi.getEMI());

	}

}
