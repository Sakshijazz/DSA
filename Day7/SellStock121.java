package Day7;

import java.util.Scanner;

public class SellStock121 {

	public static int maxProfit(int[] prices) {
        int buy= prices[0];
        int profit= 0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i] < buy)
            {
                buy= prices[i];
            }
            profit= Math.max(profit, prices[i]-buy);
        }
        return profit;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter n:");
		int n= scan.nextInt();
		int prices[]= new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			prices[i]= scan.nextInt();
		}
		System.out.println(maxProfit(prices));
	}

}
