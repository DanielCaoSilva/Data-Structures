// Daniel Silva
// CS1400, section 01
// Project 8 – Employee Inheritance
// 11/26/18
public class WorkerTest {

	public static void main(String[] args) 
	{
		System.out.println("Here's the first production worker");
		ProductionWorker pw1 = new ProductionWorker("John Smith","123-A","11-15-2005"
				,1,23.50);
		System.out.println(pw1.toString());
		System.out.println("\nHere's the second production worker");
		ProductionWorker pw2 = new ProductionWorker();
		pw2.setHourlyPayRate(18.50);
		pw2.setName("Joan Jones");
		pw2.setNumber("222-L");
		pw2.setShift(2);
		System.out.println(pw2.toString());
		System.out.println("\nHere's the third production worker");
		ProductionWorker pw3 = new ProductionWorker("Tony Gladdis","j23_3","1-23-2006"
				,3,19.50);
		System.out.println(pw3.toString());
	}

}
