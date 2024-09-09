package Day3;

public class Multiply_Across {

	public static void multiply(int a[])
		{
			int mult[]= new int[a.length];
			int p=1;
			for(int i=0;i<a.length;i++)
			{
				p=1;
				for(int j=0;j<a.length;j++)
				{
					if(i!=j)
					{
						p*=a[j];
						mult[i]=p;
					}
				}
			}
			System.out.println("Method 1:");
			for(int i: mult) 
			{
				System.out.print(i+" ");
			}
		}
	
	
	
	public static void product(int arr[])
	{
		int product[]= new int[arr.length];
		int prod=1;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				prod*=arr[i];
			}
			else 
			{
				count++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(count>1) 
			{
				product[i]=0;
			}
			else if(count==1)
			{
				if(arr[i]==0) 
				{
					product[i]=prod;
				}
				else
				{
					product[i]=0;
				}
			}
			else
			{
				product[i]=prod/arr[i];}
			}
		System.out.println("\n\n"+"Method 2:");
		for(int i:product)
		{
			System.out.print(i+" ");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int[] {2,0,4,6};
		int arr[]= new int[] {2,3,0,6};
		multiply(a);
		product(arr);
	}

}
