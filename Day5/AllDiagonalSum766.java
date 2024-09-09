package Day5;

import java.util.Scanner;

public class AllDiagonalSum766 {

	public static boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=1;j<matrix[0].length;j++)
            {
                if(matrix[i][j] != matrix[i-1][j-1])
                {
                    return false;
                }
            }
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter n and m:");
		int n= scan.nextInt();
		int m= scan.nextInt();
		int matrix[][]= new int[n][m];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				matrix[i][j]= scan.nextInt();
			}
		}
		System.out.println(isToeplitzMatrix(matrix));
	}
	}
