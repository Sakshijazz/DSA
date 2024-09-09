package Day5;

import java.util.Scanner;

public class SnakeTraversal {

	public static void snake(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int left=0;
			int right=a[0].length-1;
			for(int j=0;j<a[0].length;j++)
			{
				if(i%2!=0)
				{
					while(left<right)
					{
					int temp= a[i][left];
					a[i][left]= a[i][right];
					a[i][right]= temp;
					left++;
					right--;
					}
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println();
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
		}
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
		snake(a);
	}

}
