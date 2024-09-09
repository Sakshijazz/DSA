package Day2;
import java.util.Scanner;
public class Rotate {
	public static void rot(int arr1[], int offset)
	{
		int n=arr1.length;
		int rotated[]= new int [n];
		for(int i=offset;i<n;i++)
		{
			rotated[i-offset]= arr1[i];
;		}
		for(int j=0;j<offset;j++)
		{
			rotated[n-offset+j]= arr1[j];
;		}
		System.out.println("Rotated:"+offset+" "+"Times");
		for(int k:rotated)
		{
			System.out.print(k+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of elements:");
		int n= scan.nextInt();
		int [] arr= new int[n];
		System.out.println("Enter the array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter offset:");
		int offset = scan.nextInt();
		rot(arr,offset);
	}

}
