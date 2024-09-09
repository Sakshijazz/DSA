package Day4;
import java.util.Scanner;

public class PrefixSum {

	public static int[] prefix(int[] a) {
        int prefix[]= new int[a.length];
        prefix[0]=a[0];
        for(int i=1;i<a.length;i++)
        {
        	prefix[i]= a[i]+prefix[i-1];
        }
		return prefix;
    }
	public static int rangesum(int a[], int prefix[],int l,int r)
	{
		int sum=0;
		if(l==0)
		{
			sum=prefix[r];
		}
		else
		{
			sum= prefix[r]-prefix[l-1];
		}
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter no. of elements:");
		int n= scan.nextInt();
		int a[] = new int [n];
		System.out.println("Enter the array1:");
		for(int i=0;i<n;i++)
		{
			a[i]= scan.nextInt();
		} 
		System.out.println("Enter L and R:");
		int l= scan.nextInt();
		int r= scan.nextInt();
		int prefix[]= prefix(a);
		System.out.print("Prefix:");
		for(int i: prefix)
		{
			System.out.print(i+ " ");
		}
		int rs= rangesum(a,prefix,l,r);
		System.out.println("Range Sum:"+rs);
	}
	}


