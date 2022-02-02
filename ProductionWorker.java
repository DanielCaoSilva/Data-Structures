// Daniel Silva
// CS1400, section 01
// Project 8 – Employee Inheritance
// 11/26/18

public class ProductionWorker extends Employee
{
	//Variables
	public int shift;
	public double hourlyPayRate;
	
	//Constructor
	public ProductionWorker(String nam,String num,String hD, int s,double hpr)
	{
		eName = nam;
		eNumber = num;
		hireDate = hD;
		shift = s;
		hourlyPayRate = hpr;
	}
	public ProductionWorker()
	{
		shift = 1;
		hourlyPayRate = 0.0;
	}
	public int getShift()
	{
		return shift;
	}
	public double getHourlyPayRate()
	{
		return hourlyPayRate;
	}
	public void setShift(int s)
	{
		shift = s;
	}
	public void setHourlyPayRate(double hpr)
	{
		hourlyPayRate = hpr;
	}
	public String checkShift()
	{
		if(shift == 1)
			return "Day";
		if(shift ==2)
			return "Night";
		else 
			return "INVALID SHIFT NUMBER";
	}
	public String toString()
	{
		Employee n = new Employee(eName,eNumber,hireDate);
		String pW = "\nShift: "+checkShift()+"\nHourly Pay Rate: $"+hourlyPayRate;
		return n.toString()+pW;
	}
}






