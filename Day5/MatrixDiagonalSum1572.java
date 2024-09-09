package Day5;

import java.util.Scanner;

public class MatrixDiagonalSum1572 {

	public static int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0,j=0;i<mat.length;i++,j++)
        {
                sum += mat[i][j];
        }
        for(int i=0,j=mat[0].length-1;i<mat.length;i++,j--)
        {
            if(i!=j)
            {
                sum += mat[i][j];
            }
        }
        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter n and m:");
		int n= scan.nextInt();
		int m= scan.nextInt();
		int mat[][]= new int[n][m];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				mat[i][j]= scan.nextInt();
			}
		}
		System.out.println(diagonalSum(mat));
	}
}
