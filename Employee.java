// Daniel Silva
// CS1400, section 01
// Project 8 – Employee Inheritance
// 11/26/18
public class Employee 
{
	protected String eName;
	protected String eNumber;
	protected String hireDate;
	
	public Employee()
	{
		eName = "";
		eNumber = "";
		hireDate = "";
	}
	public Employee(String name,String number,String date)
	{
		eName = name;
		eNumber = number;
		hireDate = date;
	}
	public void checkNumber()
	{
		char[] n = eNumber.toCharArray();
		if(!Character.isLetter(n[4]))
			eNumber = "INVALID EMPLOYEE NUMBER";
		if(!Character.isDigit(n[0])||!Character.isDigit(n[1])||!Character.isDigit(n[2]))
			eNumber = "INVALID EMPLOYEE NUMBER";
		if(n[3]!='-')
			eNumber = "INVALID EMPLOYEE NUMBER";
	}
	public void setName(String name)
	{
		eName = name;
	}
	public void setNumber(String number)
	{
		eNumber = number;
	}
	public String getName()
	{
		return eName;
	}
	public String getNumber()
	{
		return eNumber;
	}
	public String getDate()
	{
		return hireDate;
	}
	public String toString()
	{
		checkNumber();
		String result = "Name: "+eName+"\nEmloyee Number: "+eNumber+"\nHire Date: "
				+hireDate;
		return result;
	}
	
}
