package csd145;
import java.util.Scanner;
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the num: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int c = 0;
		while(num>0)
		{
			c++;
			num= num/10;
		}
		System.out.println("Digits: "+c);
	}

}
