package csd145;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = scan.nextInt();
		int fact=1;
		for(int i=1; i<=num; i++)
		{
			fact= fact*i;
		}
		System.out.println(fact);
	}
}
