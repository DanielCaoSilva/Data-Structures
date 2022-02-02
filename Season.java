// Daniel Silva
// CS1400, section 01
// Project 2 – determining the seasons
// 9/12/2018

import java.util.Scanner;

public class Season 
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int month,day;
		char ans='y';
		while(ans == 'y' || ans =='Y')
		{
		System.out.print("Enter month (1-12): ");
		month=kb.nextInt();
		if( month>12 || month<1)
			System.out.println("Invalid Month!");
		switch (month)
		{
		case 1:
			System.out.print("Enter day (1-31): ");
			day = kb.nextInt();
			if(day<1 || day>31)
				System.out.println("Invalid Day!");
			else
				System.out.println(month+"/"+day+" is in the Winter Season.");
			break;
		case 2:
			System.out.print("Enter day (1-28): ");
			day = kb.nextInt();
			if(day<1 || day>28)
				System.out.println("Invalid Day!");
			else
				System.out.println(month+"/"+day+" is in the Winter Season.");
			break;
		case 3:
			System.out.print("Enter day (1-31): ");
			day = kb.nextInt();
			if(day<1 || day>31)
				System.out.println("Invalid Day!");
			else if(day<=20)
				System.out.println(month+"/"+day+" is in the Winter Season.");
			else
				System.out.println(month+"/"+day+" is in the Spring Season.");
			break;
		case 4:
			System.out.print("Enter day (1-30): ");
			day = kb.nextInt();
			if(day<1 || day>30)
				System.out.println("Invalid Day!");
			else
				System.out.println(month+"/"+day+" is in the Spring Season.");
			break;
		case 5:
			System.out.print("Enter day (1-31): ");
			day = kb.nextInt();
			if(day<1 || day>31)
				System.out.println("Invalid Day!");
			else
				System.out.println(month+"/"+day+" is in the Spring Season.");
			break;
		case 6:
			System.out.print("Enter day (1-30): ");
			day = kb.nextInt();
			if(day<1 || day>30)
				System.out.println("Invalid Day!");
			else if(day<=20)
				System.out.println(month+"/"+day+" is in the Spring Season.");
			else
				System.out.println(month+"/"+day+" is in the Summer Season.");
			break;
		case 7:
			System.out.print("Enter day (1-31): ");
			day = kb.nextInt();
			if(day<1 || day>31)
				System.out.println("Invalid Day!");
			else
				System.out.println(month+"/"+day+" is in the Summer Season.");
			break;
		case 8:
			System.out.print("Enter day (1-31): ");
			day = kb.nextInt();
			if(day<1 || day>31)
				System.out.println("Invalid Day!");
			else
				System.out.println(month+"/"+day+" is in the Summer Season.");
			break;
		case 9:
			System.out.print("Enter day (1-30): ");
			day = kb.nextInt();
			if(day<1 || day>30)
				System.out.println("Invalid Day!");
			else if(day<=20)
				System.out.println(month+"/"+day+" is in the Summer Season.");
			else
				System.out.println(month+"/"+day+" is in the Fall Season.");
			break;
		case 10:
			System.out.print("Enter day (1-31): ");
			day = kb.nextInt();
			if(day<1 || day>31)
				System.out.println("Invalid Day!");
			else
				System.out.println(month+"/"+day+" is in the Fall Season.");
			break;
		case 11:
			System.out.print("Enter day (1-30): ");
			day = kb.nextInt();
			if(day<1 || day>30)
				System.out.println("Invalid Day!");
			else
				System.out.println(month+"/"+day+" is in the Fall Season.");
			break;
		case 12:
			System.out.print("Enter day (1-31): ");
			day = kb.nextInt();
			if(day<1 || day>31)
				System.out.println("Invalid Day!");
			else if(day<=20)
				System.out.println(month+"/"+day+" is in the Fall Season.");
			else
				System.out.println(month+"/"+day+" is in the Winter Season.");
			break;
		}
		System.out.print("Try again?(y/n): ");
		ans=kb.next().charAt(0);
		}
	}
}
