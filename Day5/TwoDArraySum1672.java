package Day5;

import java.util.Scanner;

public class TwoDArraySum1672 {

	public static int maximumWealth(int[][] a) {
        int maxA=0;
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=0;
            for(int j=0;j<a[0].length;j++)
            {
                sum+= a[i][j];
                if(sum> maxA)
                {
                    maxA= sum;
                }
            }
        }
        return maxA;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter n and m:");
		int n= scan.nextInt();
		int m= scan.nextInt();
		int a[][]= new int[n][m];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]= scan.nextInt();
			}
		}
		System.out.println(maximumWealth(a));
	}

}
