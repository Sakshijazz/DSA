package Day5;

import java.util.Scanner;

public class SetZeroes73 {

	public static void setZero(int[][] matrix) {
        int row= matrix.length;
        int col= matrix[0].length;
        boolean []forRow= new boolean[row];
        boolean []forCol= new boolean[col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j] == 0)
                {
                    forRow[i]= true;
                    forCol[j]= true;
                }
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(forRow[i] || forCol[j])
                {
                    matrix[i][j] = 0;
                }
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
		setZero(a);
	}

}
