import java.util.Scanner;
public class PalidromeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter line to check: ");
		String input = kb.nextLine();
		int length = input.length();
		int good=0;
		for(int i = 0; i<=length-1;)
		{
			for(int j = length-1; j>=0;)
			{
				if(input.charAt(i)==input.charAt(j))
					{
						good++;
						i++;
						j--;
					}
			}
		}
		if(good==length)
			System.out.print("It is a palidrome");
		else
			System.out.print("It is not a palidrome.");

	}

}
