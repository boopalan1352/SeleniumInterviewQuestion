package GetterSetterMethod;

public class SBIBank {
    
    private int EMI=100;
	
	public int getEMI()
	{
		return EMI;
	}
	
	public void setEMI(int value)
	{
		if(value>100)
		this.EMI=value;
	}
}
