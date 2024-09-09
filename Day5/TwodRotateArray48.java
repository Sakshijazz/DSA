package Day5;
import java.util.Scanner;

public class TwodRotateArray48 {

	public static void rotate(int [][]matrix)
	{
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=i+1;j<matrix.length;j++)
			{
				int swap = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = swap;
			}
		}
		for(int i=0;i<matrix.length;i++)
		{
			int left=0;
			int right=matrix[0].length-1;
			while(left<right)
			{
				int swap = matrix[i][left];
				matrix[i][left] = matrix[i][right];
				matrix[i][right] = swap;
				left++;
				right--;
			}
		}
		for(int i=0;i<matrix.length;i++)
		{
			System.out.println();
			for(int j=0;j<matrix[0].length;j++)
			{
				System.out.print(matrix[i][j]+ " ");
			}
		}
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
		rotate(matrix);
	}

}
