package Day9;

import java.util.Scanner;

public class CountSubsequent {

	public static int subsequent(String s, String res, int count)
	{
		if(s.length() == 0)
		{
			return count+1;
		}
		int Ct= subsequent(s.substring(1), res+s.charAt(0),count);
		Ct+= subsequent(s.substring(1), res,count);
		return Ct;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter String:");
		String s= scan.nextLine();
		int C= subsequent(s,"",0);
		System.out.print("No. of Subsequent :"+C);
	}

}
