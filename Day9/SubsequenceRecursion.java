package Day9;

import java.util.Scanner;

public class SubsequenceRecursion {

	public static String subsequent(String s, String res)
	{
		if(s.length() == 0)
		{
			System.out.println(res);
			return res;
		}
		subsequent(s.substring(1), res+s.charAt(0));
		return subsequent(s.substring(1), res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter String:");
		String s= scan.nextLine();
		String Check = subsequent(s, "");
		System.out.print(Check);
	}

}
