package Day9;

import java.util.Scanner;

public class ClimbingStairsRecursion70 {

	 public static int climbStairs(int n) {
	        if(n==0 || n==1)
	        {
	            return 1;
	        }
	        return climbStairs(n-1)+ climbStairs(n-2);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter number:");
		int n= scan.nextInt();
		System.out.print("No. of ways :"+climbStairs(n));
	}

}
