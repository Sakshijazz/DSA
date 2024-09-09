package Day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LuckyNum1380 {

	public static void luckynumber(int a[][])
	{
		List<Integer> luckynum = new ArrayList<>();
		int row= a.length;
		int col= a[0].length;
		List<Integer> result= new ArrayList<>();
//		List<Integer> forCol= new ArrayList<>();
		
		for(int i=0;i<row;i++)
		{
			int min = Integer.MAX_VALUE;
			int index=0;
			boolean islucky= true;
		
			for(int j=0;j<col;j++)
			{
				if(a[i][j]<min)
				{
					min = a[i][j];
					index=j;
				}
				for(int k=0;k<row;k++)
				{
					if(a[k][index]>min)
					{
						islucky= false;
						
					}
				}
				
			}
			if(islucky)
			{
				result.add(min);
			}
		}

				System.out.print(result);

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
		luckynumber(a);
	}

}
