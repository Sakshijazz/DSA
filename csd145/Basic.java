package csd145;
import java.util.Scanner;
public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the num:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num>=0)
		{
			System.out.println("Positive");
		}
		else {
			System.out.println("Negative");
		}
	}

}
