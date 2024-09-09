package Day5;

import java.util.Scanner;

public class CountNegativeNum1351 {

	public static int countNegatives(int[][] grid) {
        int count=0;
        int row=0;
        int col=grid[0].length-1;
        while(row<grid.length && col>=0)
        {
            if(grid[row][col]>=0)
            {
                row++;
            }
            else
            {
                count += grid.length-row;
                col--;
            }
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter n and m:");
		int n= scan.nextInt();
		int m= scan.nextInt();
		int grid[][]= new int[n][m];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				grid[i][j]= scan.nextInt();
			}
		}
		System.out.println(countNegatives(grid));
	}

}
