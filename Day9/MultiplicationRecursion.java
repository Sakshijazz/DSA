package Day9;

import java.util.Scanner;

public class MultiplicationRecursion {

	public static int Multiply(int m, int n)
	{
		if(n<m)
		{
			return Multiply(n,m);
		}
		else if(n!=0)
		{
			return m+Multiply(m, n-1);
		}
		else
		{
			return 0;
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter m and n:");
		int m= scan.nextInt();
		int n= scan.nextInt();
		int product= Multiply(m, n);
		System.out.print("Product :"+ product);
	}

}
