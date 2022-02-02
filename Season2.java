// Daniel Silva
// CS1400, section 01
// Project 2 – determining the seasons
// 9/12/2018

import java.util.Scanner;

public class Season2 {
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int month,day = 0;
		char ans='y';
		while(ans == 'y' || ans =='Y')
		{
			System.out.print("Enter month (1-12): ");
			month=kb.nextInt();
			if( month>12 || month<1)
				System.out.println("Invalid Month!");
			if (month==1||month==3||month==5||month==7||month==8
					||month==10||month==12)
			{
				System.out.print("Enter day (1-31): ");
				day = kb.nextInt();
				if(day<1 || day>31)
				{
					System.out.println("Invalid Day!");
					break;
				}
			}
			if (month==4||month==6||month==9||month==11)
			{
				System.out.print("Enter day (1-30): ");
				day = kb.nextInt();
				if(day<1 || day>30)
				{
					System.out.println("Invalid Day!");
					break;
				}
			}
			if (month==2)
			{
				System.out.print("Enter day (1-28): ");
				day = kb.nextInt();
				if(day<1 || day>28)
				{
					System.out.println("Invalid Day!");
					break;
				}
			}	
			if((month==3&&day>=21)||month==4||month==5||(month==6&&day<=20))
				System.out.println(month+"/"+day+" is in the Spring Season.");
			if((month==6&&day>=21)||month==7||month==8||(month==9&&day<=20))
				System.out.println(month+"/"+day+" is in the Summer Season.");
			if((month==9&&day>=21)||month==10||month==11||(month==12&&day<=20))
				System.out.println(month+"/"+day+" is in the Fall Season.");
			if((month==12&&day>=21)||month==1||month==2||(month==3&&day<=20))
				System.out.println(month+"/"+day+" is in the Winter Season.");
			System.out.print("Try again?(y/n): ");
			ans=kb.next().charAt(0);
		}
	}
}
