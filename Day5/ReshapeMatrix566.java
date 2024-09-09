package Day5;

import java.util.Scanner;

public class ReshapeMatrix566 {

	public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int row= mat.length;
        int col= mat[0].length;
        if((row*col) != (r*c))
        {
            return mat;
        }
        int newArray[][] = new int[r][c];
        int forRow= 0;
        int forCol= 0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                newArray[forRow][forCol] = mat[i][j];
                forCol++;
                if(forCol == c)
                {
                    forCol = 0;
                    forRow++;
                }
            }
        }
        return newArray;
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
		System.out.println("Enter r and c:");
		int r=scan.nextInt();
		int c=scan.nextInt();
		matrixReshape(a,r,c);
	}

}
