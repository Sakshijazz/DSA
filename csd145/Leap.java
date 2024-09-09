package csd145;
import java.util.Scanner;
public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the year: ");
		Scanner scan = new Scanner(System.in);
		int yr= scan.nextInt();
		if(yr%4==0 || yr%400==0)
		{
			System.out.println("Leap Year");
		}
		else if(yr%100==0)
		{
			System.out.println("Not Leap Year");
		}
		else {
			System.out.println("Not Leap Year");
		}
	}

}
