package csd145;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = scan.nextInt();
		
		boolean flag=true;
		if(num<=1)
		{
			flag= false;
		}
		for(int i=2 ; i< num; i++)
		{
			if(num %i == 0)
			{
				flag= false;
				System.out.println("Not Prime");
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Prime");
		}
	}
}
