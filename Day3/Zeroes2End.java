package Day3;

public class Zeroes2End {

	public static void End(int arr[])
	{
		int i=-1;
		int j=0;
		for(j=0;j<arr.length;j++)
		{
			if(arr[j]!=0)
			{
				i++;
				int temp= arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		for(int n: arr)
		{
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[] {0,1,2,0,0,8,3};
		End(arr);
	}

}
