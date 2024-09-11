package Day9;

import java.util.Scanner;

public class PalindromeRecursion {

	public static boolean palindrome(String s, int i, int j)
	{
		if(i==j)
		{
			return true;
		}
		if(s.charAt(i) != s.charAt(j) )
		{
			return false; 
		}
		if(i<j+1)
		{
			return palindrome(s, i+1, j-1);
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter String:");
		String s= scan.nextLine();
		boolean Check = palindrome(s,0,s.length()-1);
		System.out.print("Palindrome :"+ Check);
	}

}
