package Day3;

public class CountPrint {
	public static void count(int a[])
	{
		int r=0;
		int count=0;
		int max_count=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				count++;
			}
			else
			{
				max_count= Math.max(max_count,count);
				count=1;
			}
		}
		System.out.println("Max Count:"+ Math.max(max_count, count));
	}
	public static void main(String [] args)
	{
		int a[]= new int[] {1,1,5,2,8,8,8};
		count(a);
	}
}
