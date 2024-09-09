package Day3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Find_Duplicate {

	public static ArrayList<Integer> duplicate(int arr[])
	{
		ArrayList<Integer> dups= new ArrayList<>();
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++)
		{
			if((arr[i]^arr[i+1])==0)
			{
				dups.add(arr[i]);
				
			}
		}
		return dups;
	}
	
	public static void main(String[] args) {
//		Scanner scan= new Scanner(System.in);
//		System.out.println("Enter the no. of elements:");
//		int n= scan.nextInt();
//		System.out.println("Enter the elements:");
//		for(int i=0;i<n;i++)
//		{
//			a[i]= scan.nextInt();
//		}
		int arr[] =new int [] {1,1,2,2,3,4,4,6};
		ArrayList<Integer> d= duplicate(arr);
		if(d.size()==0) {
			System.out.println("No duplicates Found");
		}
		else {
			System.out.print("Duplicates:");
			for(Integer i:d) {
				System.out.print(i+ " ");
			}
		}
	}

}
