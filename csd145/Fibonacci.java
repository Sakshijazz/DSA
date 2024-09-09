package csd145;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the num: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int x=0 , y=1;
		int n= x+y;
		System.out.print(x+ " " +y);
		for(int i=2; i<=num; i++)
		{
			System.out.print(" "+n);
			x=y;
			y=n;
			n=x+y;
		}
		System.out.println();
	}

}
