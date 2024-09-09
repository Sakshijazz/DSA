package Day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralOrder54 {

	public static List<Integer> spiral(int[][] matrix) {
        int row= matrix.length;
        int col= matrix[0].length;
        List<Integer> list= new ArrayList<>();
        if(row==0 || col==0)
        {
            return list;
        }
        int minRow=0, maxRow=row-1;
        int minCol=0, maxCol=col-1;
        while(minRow <= maxCol && minCol <= maxRow)
        {
            for(int i=minRow;i<=maxCol;i++)
            {
                list.add(matrix[minCol][i]);
            }
            minCol++;
            for(int i=minCol;i<=maxRow;i++)
            {
                list.add(matrix[i][maxCol]);
            }
            maxCol--;
            if(minCol <= maxRow)
            {
                for(int i=maxCol;i>=minRow;i--)
                {
                    list.add(matrix[maxRow][i]);
                }
                maxRow--;
            }
            if(minRow <= maxCol)
            {
                for(int i=maxRow;i>=minCol;i--)
                {
                    list.add(matrix[i][minRow]);
                }
                minRow++;
            }
        }
        return list;
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
		System.out.println(spiral(a));
	}

}
