package csd145;
import java.util.Scanner;
public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int x= scan.nextInt();
		int y= scan.nextInt();
		int n=0;
		for(int i=1; i<=y; i++)
		{
			n+=x;
		}
		System.out.println(n);
	}

}
