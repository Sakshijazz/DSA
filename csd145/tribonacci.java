package csd145;
import java.util.Scanner;
public class tribonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the num: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int x=0 , y=1 , z=1;
		int n= x+y+z;
		System.out.print(x+ " " +y+ " " +z);
		for(int i=4; i<=num; i++)
		{
			System.out.print(" "+n);
			x=y;
			y=z;
			z=n;
			n=x+y+z;
		}
		System.out.println();
	}

}
